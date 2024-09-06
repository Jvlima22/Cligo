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
@Table(name = "bairro")
public class Neighborhood {

    @Id
    @Column(name = "id_bairro", length = 4)
    private Integer id_bairro;

    @Column(name = "nome_bairro", nullable = false, length = 50)
    private String nome_bairro;

    @Column(name = "id_estado")
    private Integer id_estado;

    @Column(name = "id_cidade")
    private Integer id_Ccdade;

    @Column(name = "cod_us")
    private UUID cod_us;

    @ManyToOne
    @JoinColumn(name = "id_estado", insertable = false, updatable = false)
    private Estate estado;

    @ManyToOne
    @JoinColumn(name = "id_cidade", insertable = false, updatable = false)
    private City cidade;

    @ManyToOne
    @JoinColumn(name = "cod_us", insertable = false, updatable = false)
    private User usuario;
}
