package tglsolutions.cligo.requests;

public class LoginRequest {
    private String email;
    private String password;

    // Construtor padrão
    public LoginRequest() {
    }

    // Construtor com parâmetros
    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getter para email
    public String getEmail() {
        return email;
    }

    // Setter para email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter para password
    public String getPassword() {
        return password;
    }

    // Setter para password
    public void setPassword(String password) {
        this.password = password;
    }
}
