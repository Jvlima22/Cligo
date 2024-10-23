package tglsolutions.Cligo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tp_telefone")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tp_Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_tp_telefone;
    private int id_telefone;
    @ManyToOne
    @JoinColumn(name = "cod_us", referencedColumnName = "cod_us")
    private User cod_us;
    private String descricao_tp_telefone;
}
