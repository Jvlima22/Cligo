package tglsolutions.cligo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

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
@Table(name = "cidade")
public class City {

    @Id
    @Column(name = "id_cidade", length = 4)
    private Integer id_cidade;

    @Column(name = "nome_cidade", nullable = false, length = 50)
    private String nome_cidade;

    @Column(name = "id_estado")
    private Integer id_estado;

    @Column(name = "cod_us")
    private UUID cod_us;

    @ManyToOne
    @JoinColumn(name = "id_estado", insertable = false, updatable = false)
    private Estate estado;

    @ManyToOne
    @JoinColumn(name = "cod_us", insertable = false, updatable = false)
    private User usuario;
}
