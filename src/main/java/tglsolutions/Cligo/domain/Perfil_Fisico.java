package tglsolutions.Cligo.domain;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "perfil_fisico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Perfil_Fisico {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_perfil_fisico;
    @ManyToOne
    @JoinColumn(name = "cod_us", referencedColumnName = "cod_us")
    private User cod_us;
    private String lista_amigos;
}
