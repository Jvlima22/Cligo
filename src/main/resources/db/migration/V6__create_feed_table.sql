CREATE TABLE feed (
    id_feed VARCHAR(4) PRIMARY KEY,
    curtidas INTEGER,
    comentarios INTEGER,
    autor VARCHAR(50) NOT NULL,
    tipo_conteudo VARCHAR(50),
    produto VARCHAR(50),
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO feed (id_feed, curtidas, comentarios, autor, tipo_conteudo, produto, cod_us)
VALUES
    ('FD1', 10, 3, 'Usuario1', 'Foto', 'Produto A', 1),
    ('FD2', 20, 5, 'Usuario2', 'Vídeo', 'Produto B', 2),
    ('FD3', 30, 0, 'Usuario3', 'Foto', 'Produto C', 3);
