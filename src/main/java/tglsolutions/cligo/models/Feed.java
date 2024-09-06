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
@Table(name = "feed")
public class Feed {

    @Id
    @Column(name = "id_feed", length = 4)
    private String id_feed;

    @Column(name = "curtidas")
    private Integer curtidas;

    @Column(name = "comentarios")
    private Integer comentarios;

    @Column(name = "autor", length = 50, nullable = false)
    private String autor;

    @Column(name = "tipo_conteudo", length = 50)
    private String tipo_conteudo;

    @Column(name = "produto", length = 50)
    private String produto;

    @Column(name = "cod_us")
    private UUID cod_us;

    @ManyToOne
    @JoinColumn(name = "cod_us", insertable = false, updatable = false)
    private User usuario;
}
