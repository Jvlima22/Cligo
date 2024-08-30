package tglsolutions.cligo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "geolocalizacao")
public class Geolocalizacao {

    @Id
    @Column(name = "id_localizacao", length = 4)
    private Integer id_localizacao;

    @Column(name = "id_bairro")
    private Integer id_bairro;

    @Column(name = "id_estado")
    private Integer id_estado;

    @Column(name = "id_cidade")
    private Integer id_cidade;

    @Column(name = "id_logradouro")
    private Integer id_logradouro;

    @Column(name = "cod_us")
    private Integer cod_us;

    @ManyToOne
    @JoinColumn(name = "id_bairro", insertable = false, updatable = false)
    private Bairro bairro;

    @ManyToOne
    @JoinColumn(name = "id_estado", insertable = false, updatable = false)
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "id_cidade", insertable = false, updatable = false)
    private Cidade cidade;

    @ManyToOne
    @JoinColumn(name = "id_logradouro", insertable = false, updatable = false)
    private Logradouro logradouro;

    @ManyToOne
    @JoinColumn(name = "cod_us", insertable = false, updatable = false)
    private Usuario usuario;
}
