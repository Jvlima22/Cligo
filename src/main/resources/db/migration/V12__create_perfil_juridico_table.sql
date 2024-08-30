CREATE TABLE perfil_juridico (
    id_perfil_juridico INTEGER PRIMARY KEY,
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO perfil_juridico (id_perfil_juridico, cod_us)
VALUES
    (1, 1),
    (2, 2),
    (3, 3);
