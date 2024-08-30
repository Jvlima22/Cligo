CREATE TABLE cliente_fisico (
    cpf VARCHAR(11) UNIQUE PRIMARY KEY,
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO cliente_fisico (cpf, cod_us)
VALUES
    ('12345678901', 1),
    ('23456789012', 2);
