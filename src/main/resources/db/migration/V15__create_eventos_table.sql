CREATE TABLE eventos (
    id_eventos INT PRIMARY KEY,
    organizador VARCHAR(50) NOT NULL,
    descricao VARCHAR(50) NOT NULL,
    cod_us INT,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO eventos (id_eventos, organizador, descricao, cod_us)
VALUES (1, 'Usuario1', 'Evento de Networking', 1),
       (2, 'Usuario2', 'Festa de Aniversário', 2),
       (3, 'Usuario3', 'Workshop de Desenvolvimento Pessoal', 3);
