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
@Table(name = "estado")
public class Estado {

    @Id
    @Column(name = "id_estado", length = 4)
    private Integer id_estado;

    @Column(name = "nome_estado", nullable = false, length = 50)
    private String nome_estado;

    @Column(name = "sigla_estado", nullable = false, length = 2)
    private String sigla_estado;

    @Column(name = "cod_us")
    private Integer cod_us;

    @ManyToOne
    @JoinColumn(name = "cod_us", insertable = false, updatable = false)
    private Usuario usuario;
}
