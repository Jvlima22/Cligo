package tglsolutions.Cligo.domain;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "estado")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_estado;
    @ManyToOne
    @JoinColumn(name = "cod_us", referencedColumnName = "cod_us")
    private User cod_us;
    private String nome_estado;
    private String sigla_estado;
}
