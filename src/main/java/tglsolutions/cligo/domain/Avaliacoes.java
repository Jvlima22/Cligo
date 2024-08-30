package tglsolutions.cligo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "avaliacoes")
public class Avaliacoes {

    @Id
    @Column(name = "id_avaliacao", length = 4)
    private String id_avaliacao;

    @Column(name = "data_avaliacao", nullable = false)
    private LocalDate data_avaliacao;

    @Column(name = "avaliador_fisico", length = 50)
    private String avaliador_fisico;

    @Column(name = "avaliado_juridico", length = 50)
    private String avaliado_juridico;

    @Column(name = "cod_us")
    private Integer cod_us;

    @ManyToOne
    @JoinColumn(name = "cod_us", insertable = false, updatable = false)
    private Usuario usuario;
}
