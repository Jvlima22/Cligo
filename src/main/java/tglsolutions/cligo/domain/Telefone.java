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
@Table(name = "telefone")
public class Telefone {

    @Id
    @Column(name = "id_telefone", length = 4)
    private String id_telefone;

    @Column(name = "ddd", nullable = false)
    private Integer ddd;

    @Column(name = "ddi", nullable = false)
    private Integer ddi;

    @Column(name = "prefixo", nullable = false)
    private Integer prefixo;

    @Column(name = "sufixo", nullable = false)
    private Integer sufixo;

    @Column(name = "cod_us")
    private Integer cod_us;

    @ManyToOne
    @JoinColumn(name = "cod_us", insertable = false, updatable = false)
    private Usuario usuario;
}
