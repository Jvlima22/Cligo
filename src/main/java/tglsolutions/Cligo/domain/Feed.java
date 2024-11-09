package tglsolutions.Cligo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "feed")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Feed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_feed;
    private String curtidas;
    private String comentarios;
    @ManyToOne
    @JoinColumn(name = "cod_us", referencedColumnName = "cod_us")
    private User cod_us;
    @ManyToOne
    @JoinColumn(name = "autor", referencedColumnName = "cod_us")
    private User autor;
    private String tipo_conteudo;
    private String produto;
}
