CREATE TABLE usuario (
    cod_us INTEGER PRIMARY KEY,
    senha VARCHAR(20) NOT NULL,
    login VARCHAR(20) NOT NULL,
    email VARCHAR(50) NOT NULL,
    telefone VARCHAR(50) NOT NULL,
    nome VARCHAR(50) NOT NULL,
    cpf VARCHAR(11) UNIQUE,
    cnpj VARCHAR(14) UNIQUE
);

INSERT INTO usuario (cod_us, senha, login, email, telefone, nome, cpf, cnpj)
VALUES
    (1, 'senha123', 'usuario1', 'cesar1@email.com', '1234567890', 'Cesár', '03384888049', '18529511000160'),
    (2, 'senha456', 'usuario2', 'maribel2@email.com', '9876543210', 'Maribel', '36821987092', NULL),
    (3, 'senha789', 'usuario3', 'gabi@email.com', '5555555555', 'Gabriella', NULL, '59002414000100');
