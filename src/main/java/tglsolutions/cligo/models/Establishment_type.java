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
@Table(name = "tipo_estabelecimento")
public class Establishment_type {

    @Id
    @Column(name = "id_tipo_estabelecimento")
    private Integer id_tipo_estabelecimento;

    @Column(name = "nome_estabelecimento", nullable = false)
    private String nome_estabelecimento;

    @Column(name = "descricao_tipo_estabelecimento", nullable = false)
    private String descricao_tipo_estabelecimento;

    @Column(name = "id_perfil_juridico")
    private Integer id_perfil_juridico;

    @ManyToOne
    @JoinColumn(name = "id_perfil_juridico", insertable = false, updatable = false)
    private Profile_juridico perfil_juridico;
}
