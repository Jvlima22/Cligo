CREATE TABLE interesse (
    id_interesse VARCHAR(4) PRIMARY KEY,
    tipo_de_bar VARCHAR(50),
    tipo_de_restaurante VARCHAR(50),
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO interesse (id_interesse, tipo_de_bar, tipo_de_restaurante, cod_us)
VALUES
    ('INT1', 'Bar de Jazz', 'Comida Italiana', 1),
    ('INT2', 'Bar de Vinhos', 'Comida Mexicana', 2),
    ('INT3', 'Bar de rock', 'Comida Americana', 3);
