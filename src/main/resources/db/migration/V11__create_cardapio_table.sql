CREATE TABLE cardapio (
    id_cardapio INTEGER PRIMARY KEY,
    descricao_alimento VARCHAR(50) NOT NULL,
    nome_alimento VARCHAR(50) NOT NULL,
    preco_alimento VARCHAR(50) NOT NULL,
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO cardapio (id_cardapio, descricao_alimento, nome_alimento, preco_alimento, cod_us)
VALUES
    (1, 'Entrada', 'Salada de Folhas Verdes', '10.00', 1),
    (2, 'Prato Principal', 'Frango Grelhado', '15.00', 2),
    (3, 'Sobremesa', 'Torta de Maçã', '8.00', 3);
