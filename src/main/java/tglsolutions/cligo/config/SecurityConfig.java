package tglsolutions.cligo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @SuppressWarnings({ "deprecation", "removal" })
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .requestMatchers("/auth/**", "/oauth2/**").permitAll() // Permite acesso sem autenticação
                .anyRequest().authenticated() // Requer autenticação para qualquer outra requisição
            .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
            .and()
            .oauth2Login()
                .loginPage("/login")
                .defaultSuccessUrl("/home", true)
            .and()
            .csrf().disable(); // Desativa CSRF para simplicidade (não recomendado para produção)

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
