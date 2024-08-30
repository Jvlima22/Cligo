CREATE TABLE mensagens (
    id_mensagem VARCHAR(4) PRIMARY KEY,
    remetente_mensagem VARCHAR(50) NOT NULL,
    destinatario_mensagem VARCHAR(50) NOT NULL,
    conteudo_mensagem VARCHAR(100) NOT NULL,
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO mensagens (id_mensagem, remetente_mensagem, destinatario_mensagem, conteudo_mensagem, cod_us)
VALUES
    ('MSG1', 'Usuario1', 'Usuario2', 'Olá, como você está?', 1),
    ('MSG2', 'Usuario3', 'Usuario4', 'Vamos nos encontrar mais tarde?', 2),
    ('MSG3', 'Usuario4', 'Usuario3', 'Vamos!', 3);
