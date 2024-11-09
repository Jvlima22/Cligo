package tglsolutions.Cligo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "interesse")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Interesse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_interesse;
    private String tipo_de_bar;
    @ManyToOne
    @JoinColumn(name = "cod_us", referencedColumnName = "cod_us")
    private User cod_us;
    private String tipo_de_restaurante;
}
