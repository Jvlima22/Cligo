package tglsolutions.Cligo.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "categoria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_categoria;
    @ManyToOne
    @JoinColumn(name = "id_eventos", referencedColumnName = "id_eventos")
    private Eventos id_eventos;
    private String nome_categoria;
    private String descricao_categoria;
}
