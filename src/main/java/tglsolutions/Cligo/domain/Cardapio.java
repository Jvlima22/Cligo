package tglsolutions.Cligo.domain;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cardapio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_cardapio;
    @ManyToOne
    @JoinColumn(name = "cod_us", referencedColumnName = "cod_us")
    private User cod_us;
    private String descricao_alimento;
    private String nome_alimento;
    private String preco_alimento;
}
