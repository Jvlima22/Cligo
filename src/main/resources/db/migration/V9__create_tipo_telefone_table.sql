CREATE TABLE tipo_telefone (
    id_tipo_telefone INTEGER PRIMARY KEY,
    descricao_tipo_telefone VARCHAR(50),
    cod_us INTEGER,
    id_telefone VARCHAR(4),
    FOREIGN KEY (id_telefone) REFERENCES telefone (id_telefone),
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO tipo_telefone (id_tipo_telefone, descricao_tipo_telefone, cod_us, id_telefone)
VALUES
    (1, 'Celular', 1, 'TEL1'),
    (2, 'Trabalho', 2, 'TEL2'),
    (3, 'Comercial', 3, 'TEL3');
