package tglsolutions.Cligo.domain;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "presenca")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Presenca {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_presenca;
    @ManyToOne
    @JoinColumn(name = "cod_us", referencedColumnName = "cod_us")
    private User cod_us;
    private Date data_confirmacao;
}
