package tglsolutions.Cligo.domain;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "perfil_juridico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Perfil_Juridico {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_perfil_juridico;
    @ManyToOne
    @JoinColumn(name = "cod_us", referencedColumnName = "cod_us")
    private User cod_us;
}
