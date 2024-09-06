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
@Table(name = "mensagens")
public class Messages {

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
    private UUID cod_us;

    @ManyToOne
    @JoinColumn(name = "cod_us", insertable = false, updatable = false)
    private User usuario;
}
