package tglsolutions.cligo.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_us;  // Correspondente ao SERIAL

    @Column(length = 255)
    private String senha;  // Atributo correspondente a password

    @Column(length = 255)
    private String login;

    @Column(length = 255, unique = true, nullable = false)
    private String email;

    @Column(length = 50)
    private String telefone;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 11, unique = true)
    private String cpf;

    @Column(length = 14, unique = true)
    private String cnpj;

    @Column(length = 20, columnDefinition = "varchar(20) default 'LOCAL'")
    private String provider;

    @Column(length = 255)
    private String googleId;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    // Construtor padrão
    public User() {
    }

    // Construtor com parâmetros
    public User(String senha, String login, String email) {
        this.senha = senha;
        this.login = login;
        this.email = email;
    }

    // Getter para senha (password)
    public String getSenha() {
        return senha;
    }

    // Setter para senha (password)
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Getter para login
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    // Getter para email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter para telefone
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para CPF
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Getter para CNPJ
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Getter para provider
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    // Getter para Google ID
    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }

    // Getter para createdAt
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getPassword() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPassword'");
    }
}
