CREATE TABLE tipo_estabelecimento (
    id_tipo_estabelecimento INTEGER PRIMARY KEY,
    id_perfil_juridico INTEGER,
    nome_estabelecimento VARCHAR(50) NOT NULL,
    descricao_tipo_estabelecimento VARCHAR(50) NOT NULL,
    FOREIGN KEY (id_perfil_juridico) REFERENCES perfil_juridico (id_perfil_juridico)
);

INSERT INTO tipo_estabelecimento (id_tipo_estabelecimento, id_perfil_juridico, nome_estabelecimento, descricao_tipo_estabelecimento)
VALUES
    (1, 1, 'Restaurante A', 'Comida Italiana'),
    (2, 2, 'Bar B', 'Bar de Vinhos'),
    (3, 3, 'Café C', 'Café e Lanches');
