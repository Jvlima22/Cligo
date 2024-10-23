package tglsolutions.Cligo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "geolocalizacao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Geolocalizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_geolocalizacao;
    @ManyToOne
    @JoinColumn(name = "cod_us", referencedColumnName = "cod_us")
    private User cod_us;
    @ManyToOne
    @JoinColumn(name = "id_estado", referencedColumnName = "id_estado")
    private Estado id_estado;
    @ManyToOne
    @JoinColumn(name = "id_cidade", referencedColumnName = "id_cidade")
    private Cidade id_cidade;
    @ManyToOne
    @JoinColumn(name = "id_bairro", referencedColumnName = "id_bairro")
    private Bairro id_bairro;
    @ManyToOne
    @JoinColumn(name = "id_logradouro", referencedColumnName = "id_logradouro")
    private Logradouro id_logradouro;
}
