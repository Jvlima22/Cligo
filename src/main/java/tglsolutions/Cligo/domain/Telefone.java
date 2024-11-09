package tglsolutions.Cligo.domain;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "telefone")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_telefone;
    private int ddd;
    private int dd;
    @ManyToOne
    @JoinColumn(name = "cod_us", referencedColumnName = "cod_us")
    private User cod_us;
    private int prefixo;
    private int sufixo;
}
