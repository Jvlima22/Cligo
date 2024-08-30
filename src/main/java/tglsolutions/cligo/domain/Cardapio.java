package tglsolutions.cligo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cardapio")
public class Cardapio {

    @Id
    @Column(name = "id_cardapio")
    private Integer id_cardapio;

    @Column(name = "descricao_alimento", nullable = false, length = 50)
    private String descricao_alimento;

    @Column(name = "nome_alimento", nullable = false, length = 50)
    private String nome_alimento;

    @Column(name = "preco_alimento", nullable = false, length = 50)
    private String preco_alimento;

    @Column(name = "cod_us")
    private Integer cod_us;

    @ManyToOne
    @JoinColumn(name = "cod_us", insertable = false, updatable = false)
    private Usuario usuario;
}
