package tglsolutions.cligo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id; 
import jakarta.persistence.Column; 
import jakarta.persistence.Table; 
import lombok.AllArgsConstructor; 
import lombok.Getter; 
import lombok.NoArgsConstructor; 
import lombok.Setter; 
import java.util.UUID; 

@Entity 
@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
@Table(name = "usuario") 
public class Usuario {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cod_us", updatable = false, nullable = false)
    private UUID cod_us;

    @Column(name = "senha", nullable = false) 
    private String senha; 

    @Column(name = "login", nullable = false) 
    private String login;

    @Column(name = "email", nullable = false) 
    private String email; 

    @Column(name = "telefone", nullable = false) 
    private String telefone; 
    
    @Column(name = "nome", nullable = false) 
    private String nome;

    @Column(name = "cpf", unique = true, length = 11)
    private String cpf;

    @Column(name = "cnpj", unique = true)
    private String cnpj;
}
