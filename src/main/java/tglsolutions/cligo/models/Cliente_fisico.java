package tglsolutions.cligo.models;

import jakarta.persistence.Entity; 
import jakarta.persistence.Id;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne; 
import jakarta.persistence.JoinColumn; 
import jakarta.persistence.Table; 
import lombok.AllArgsConstructor; 
import lombok.Getter; 
import lombok.NoArgsConstructor; 
import lombok.Setter; 

@Entity 
@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
@Table(name = "cliente_fisico")
public class Cliente_fisico {

    @Id 
    @Column(name = "cpf", unique = true, length = 11)
    private String cpf;

    @Column(name = "cod_us") 
    private UUID cod_us; 

    @ManyToOne 
    @JoinColumn(name = "cod_us", insertable = false, updatable = false) 
    private User usuario; 
}
