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
@Table(name = "tipo_telefone")
public class Phone_type {

    @Id
    @Column(name = "id_tipo_telefone")
    private Integer id_tipo_telefone;

    @Column(name = "descricao_tipo_telefone", length = 50)
    private String descricao_tipo_telefone;

    @Column(name = "cod_us")
    private UUID cod_us;

    @ManyToOne
    @JoinColumn(name = "cod_us", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_telefone", insertable = false, updatable = false)
    private Phone telefone;
}
