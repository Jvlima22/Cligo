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

import java.sql.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "presenca")
public class Presence {

    @Id
    @Column(name = "id_presenca", length = 4)
    private Integer id_presenca;

    @Column(name = "cod_us")
    private UUID cod_us;

    @Column(name = "data_confirmacao")
    private Date data_confirmacao;

    @ManyToOne
    @JoinColumn(name = "cod_us", insertable = false, updatable = false)
    private User usuario;
}
