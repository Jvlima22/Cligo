package tglsolutions.Cligo.domain;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mensagens")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mensagens {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id_mensagem;
    @ManyToOne
    @JoinColumn(name = "destinatario_mensagem", referencedColumnName = "cod_us")
    private User destinatario_mensagem;
    @ManyToOne
    @JoinColumn(name = "remetente_mensagem", referencedColumnName = "cod_us")
    private User remetente_mensagem;
    private String conteudo_mensagem;
    private Date date_mensagem;
}
