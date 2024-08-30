CREATE TABLE avaliacoes (
    id_avaliacao VARCHAR(4) PRIMARY KEY,
    data_avaliacao DATE NOT NULL,
    avaliador_fisico VARCHAR(50),
    avaliado_juridico VARCHAR(50),
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO avaliacoes (id_avaliacao, data_avaliacao, avaliador_fisico, avaliado_juridico, cod_us)
VALUES
    ('AV1', '2023-11-04', 'Usuario1', 'EmpresaA', 1),
    ('AV2', '2023-11-05', 'Usuario2', 'EmpresaB', 2),
    ('AV3', '2023-12-25', 'Usuario3', 'EmpresaC', 3);
