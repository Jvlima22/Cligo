package tglsolutions.cligo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tglsolutions.cligo.models.User;
import tglsolutions.cligo.requests.LoginRequest;
import tglsolutions.cligo.requests.RegisterRequest;
import tglsolutions.cligo.repositories.UserRepository;
import tglsolutions.cligo.services.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterRequest request) {
    if (userService.existsByEmail(request.getEmail())) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body("Email já registrado");
    }

    String encryptedPassword = passwordEncoder.encode(request.getPassword());
    // A chamada ao construtor deve funcionar agora
    User newUser = new User(request.getEmail(), encryptedPassword, "LOCAL");
    userRepository.save(newUser);

    return ResponseEntity.ok("Usuário registrado com sucesso");
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginRequest request) {
        User user = userService.findByEmail(request.getEmail());
        if (user == null || !passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais inválidas");
        }

        // Aqui você pode gerar um token JWT ou usar outro método de autenticação
        return ResponseEntity.ok("Login realizado com sucesso");
    }

    @GetMapping("/oauth2/callback/google")
    public ResponseEntity<String> googleCallback(OAuth2AuthenticationToken authentication) {
        String googleEmail = authentication.getPrincipal().getAttribute("email");
        String googleId = authentication.getPrincipal().getAttribute("sub");

        User user = userService.findByEmail(googleEmail);
        if (user == null) {
            // Ajustar a criação do usuário de acordo com os atributos disponíveis
            user = new User(googleEmail, null, "GOOGLE");
            user.setGoogleId(googleId); // Certifique-se de que a propriedade `googleId` está presente na classe `User`
            userRepository.save(user);
        }

        // Aqui você pode gerar um token JWT ou usar outro método de autenticação
        return ResponseEntity.ok("Autenticação via Google realizada com sucesso");
    }
}
