CREATE TABLE telefone (
    id_telefone VARCHAR(4) PRIMARY KEY,
    ddd INTEGER NOT NULL,
    ddi INTEGER NOT NULL,
    prefixo INTEGER NOT NULL,
    sufixo INTEGER NOT NULL,
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO telefone (id_telefone, ddd, ddi, prefixo, sufixo, cod_us)
VALUES
    ('TEL1', 11, 55, 12345, 6789, 1),
    ('TEL2', 22, 55, 98765, 4321, 2),
    ('TEL3', 13, 55, 13579, 2468, 3);
