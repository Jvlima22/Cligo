package tglsolutions.Cligo.domain;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "avaliacoes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Avaliacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_avaliacao;
    private String avaliador_juridico;
    private String avaliador_fisico;
    @ManyToOne
    @JoinColumn(name = "cod_us", referencedColumnName = "cod_us")
    private User cod_us;
    private Date data_avaliacao;
}
