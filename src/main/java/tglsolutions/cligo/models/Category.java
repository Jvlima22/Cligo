package tglsolutions.cligo.models;

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
@Table(name = "categoria")
public class Category {

    @Id
    @Column(name = "id_categoria", length = 4)
    private Integer id_categoria;

    @Column(name = "nome_categoria", nullable = false, length = 50)
    private String nome_categoria;

    @Column(name = "id_eventos")
    private Integer id_eventos;

    @ManyToOne
    @JoinColumn(name = "id_eventos", insertable = false, updatable = false)
    private Events eventos;
}
