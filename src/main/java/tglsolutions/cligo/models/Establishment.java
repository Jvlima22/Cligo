package tglsolutions.cligo.models;

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
@Table(name = "estabelecimento")
public class Establishment {

    @Id
    @Column(name = "id_estabelecimento")
    private Integer id_estabelecimento;

    @Column(name = "nome_estabelecimento", nullable = false)
    private String nome_estabelecimento;

    @Column(name = "endereco_estabelecimento", nullable = false)
    private String endereco_estabelecimento;

    @Column(name = "id_tipo_estabelecimento")
    private Integer id_tipo_estabelecimento;

    @ManyToOne
    @JoinColumn(name = "id_tipo_estabelecimento", insertable = false, updatable = false)
    private Establishment_type tipo_estabelecimento;
}
