package tglsolutions.Cligo.domain;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bairro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bairro {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_logradouro;
    private String cep;
    private String nome_logradouro;
    private String numero;
    @ManyToOne
    @JoinColumn(name = "cod_us", referencedColumnName = "cod_us")
    private User cod_us;
    @ManyToOne
    @JoinColumn(name = "id_bairro", referencedColumnName = "id_bairro")
    private Bairro id_bairro;
}
