CREATE TABLE cliente_juridico (
    cnpj VARCHAR(14) PRIMARY KEY,
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO cliente_juridico (cnpj, cod_us)
VALUES
    ('12345678901234', 1),
    ('23456789012345', 2),
    ('34567890123456', 3);
