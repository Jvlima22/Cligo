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
@Table(name = "interesse")
public class Interest {

    @Id
    @Column(name = "id_interesse", length = 4)
    private String id_interesse;

    @Column(name = "tipo_de_bar", length = 50)
    private String tipo_de_bar;

    @Column(name = "tipo_de_restaurante", length = 50)
    private String tipo_de_restaurante;

    @Column(name = "cod_us")
    private UUID cod_us;

    @ManyToOne
    @JoinColumn(name = "cod_us", insertable = false, updatable = false)
    private User usuario;
}
