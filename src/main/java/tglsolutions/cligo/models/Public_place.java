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
@Table(name = "logradouro")
public class Public_place {

    @Id
    @Column(name = "id_logradouro", length = 4)
    private Integer id_logradouro;

    @Column(name = "cep", nullable = false, length = 9)
    private String cep;

    @Column(name = "nome_logradouro", nullable = false, length = 50)
    private String nome_logradouro;

    @Column(name = "numero", nullable = false, length = 10)
    private String numero;

    @Column(name = "complemento", length = 50)
    private String complemento;

    @Column(name = "id_bairro")
    private Integer id_bairro;

    @Column(name = "id_estado")
    private Integer id_estado;

    @Column(name = "id_cidade")
    private Integer id_cidade;

    @Column(name = "cod_us")
    private UUID cod_us;

    @ManyToOne
    @JoinColumn(name = "id_bairro", insertable = false, updatable = false)
    private Neighborhood bairro;

    @ManyToOne
    @JoinColumn(name = "id_estado", insertable = false, updatable = false)
    private Estate estado;

    @ManyToOne
    @JoinColumn(name = "id_cidade", insertable = false, updatable = false)
    private City cidade;

    @ManyToOne
    @JoinColumn(name = "cod_us", insertable = false, updatable = false)
    private User usuario;
}
