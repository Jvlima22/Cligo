CREATE TABLE perfil_fisico (
    id_perfil VARCHAR(4) PRIMARY KEY,
    lista_amigos VARCHAR(50),
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO perfil_fisico (id_perfil, lista_amigos, cod_us)
VALUES
    ('PF1', 'Amigo1, Amigo2, Amigo3', 1),
    ('PF2', 'Amigo4, Amigo5', 2),
    ('PF3', 'Amigo6, Amigo7, Amigo8', 3);
