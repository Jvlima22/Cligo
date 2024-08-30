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
@Table(name = "mensagens")
public class Mensagens {

    @Id
    @Column(name = "id_mensagem", length = 4)
    private String id_mensagem;

    @Column(name = "remetente_mensagem", length = 50, nullable = false)
    private String remetente_mensagem;

    @Column(name = "destinatario_mensagem", length = 50, nullable = false)
    private String destinatario_mensagem;

    @Column(name = "conteudo_mensagem", length = 100, nullable = false)
    private String conteudo_mensagem;

    @Column(name = "cod_us")
    private Integer cod_us;

    @ManyToOne
    @JoinColumn(name = "cod_us", insertable = false, updatable = false)
    private Usuario usuario;
}
