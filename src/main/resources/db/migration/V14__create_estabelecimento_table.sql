CREATE TABLE estabelecimento (
    id_estabelecimento INTEGER PRIMARY KEY,
    id_tipo_estabelecimento INTEGER,
    nome_estabelecimento VARCHAR(50) NOT NULL,
    endereco_estabelecimento VARCHAR(100) NOT NULL,
    FOREIGN KEY (id_tipo_estabelecimento) REFERENCES tipo_estabelecimento (id_tipo_estabelecimento)
);

INSERT INTO estabelecimento (id_estabelecimento, id_tipo_estabelecimento, nome_estabelecimento, endereco_estabelecimento)
VALUES
    (1, 1, 'La Dolce Vita', 'Rua das Flores, 123'),
    (2, 2, 'Vino e Cibo', 'Avenida Central, 456'),
    (3, 3, 'Café do Bairro', 'Rua dos Anjos, 789');
