package tglsolutions.Cligo.domain;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "logradouro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Logradouro {
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
    @ManyToOne
    @JoinColumn(name = "id_cidade", referencedColumnName = "id_cidade")
    private Cidade id_cidade;
    @ManyToOne
    @JoinColumn(name = "id_estado", referencedColumnName = "id_estado")
    private Estado id_estado;
    private String complemento;
}
