-- Tabela usuario
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
VALUES (1, 'senha123', 'usuario1', 'cesar1@email.com', '1234567890', 'Cesár', '03384888049', '18529511000160');
INSERT INTO usuario (cod_us, senha, login, email, telefone, nome, cpf)
VALUES (2, 'senha456', 'usuario2', 'maribel2@email.com', '9876543210', 'Maribel', '36821987092');
INSERT INTO usuario (cod_us, senha, login, email, telefone, nome, cnpj)
VALUES (3, 'senha789', 'usuario3', 'gabi@email.com', '5555555555', 'Gabriella', '59002414000100');

-- Tabela cliente_fisico
CREATE TABLE cliente_fisico (
    cpf VARCHAR(11) UNIQUE,
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO cliente_fisico (cpf, cod_us)
VALUES ('03384888049', 1);
INSERT INTO cliente_fisico (cpf, cod_us)
VALUES ('36821987092', 2);

-- Tabela perfil_fisico
CREATE TABLE perfil_fisico (
    id_perfil VARCHAR(4) PRIMARY KEY,
    lista_amigos VARCHAR(50),
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO perfil_fisico (id_perfil, lista_amigos, cod_us)
VALUES ('PF1', 'Amigo1, Amigo2, Amigo3', 1);
INSERT INTO perfil_fisico (id_perfil, lista_amigos, cod_us)
VALUES ('PF2', 'Amigo4, Amigo5', 2);
INSERT INTO perfil_fisico (id_perfil, lista_amigos, cod_us)
VALUES ('PF3', 'Amigo6, Amigo7, Amigo8', 3);

-- Tabela interesse
CREATE TABLE interesse (
    id_interesse VARCHAR(4) PRIMARY KEY,
    tipo_de_bar VARCHAR(50),
    tipo_de_restaurante VARCHAR(50),
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO interesse (id_interesse, tipo_de_bar, tipo_de_restaurante, cod_us)
VALUES ('INT1', 'Bar de Jazz', 'Comida Italiana', 1);
INSERT INTO interesse (id_interesse, tipo_de_bar, tipo_de_restaurante, cod_us)
VALUES ('INT2', 'Bar de Vinhos', 'Comida Mexicana', 2);
INSERT INTO interesse (id_interesse, tipo_de_bar, tipo_de_restaurante, cod_us)
VALUES ('INT3', 'Bar de rock', 'Comida Americana', 3);

-- Tabela mensagens
CREATE TABLE mensagens (
    id_mensagem VARCHAR(4) PRIMARY KEY,
    remetente_mensagem VARCHAR(50) NOT NULL,
    destinatario_mensagem VARCHAR(50) NOT NULL,
    conteudo_mensagem VARCHAR(100) NOT NULL,
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO mensagens (id_mensagem, remetente_mensagem, destinatario_mensagem, conteudo_mensagem, cod_us)
VALUES ('MSG1', 'Usuario1', 'Usuario2', 'Olá, como você está?', 1);
INSERT INTO mensagens (id_mensagem, remetente_mensagem, destinatario_mensagem, conteudo_mensagem, cod_us)
VALUES ('MSG2', 'Usuario3', 'Usuario4', 'Vamos nos encontrar mais tarde?', 2);
INSERT INTO mensagens (id_mensagem, remetente_mensagem, destinatario_mensagem, conteudo_mensagem, cod_us)
VALUES ('MSG3', 'Usuario4', 'Usuario3', 'vamos!', 3);

-- Tabela feed
CREATE TABLE feed (
    id_feed VARCHAR(4) PRIMARY KEY,
    curtidas INTEGER,
    comentarios INTEGER,
    autor VARCHAR(50) NOT NULL,
    tipo_conteudo VARCHAR(50),
    produto VARCHAR(50),
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO feed (id_feed, curtidas, comentarios, autor, tipo_conteudo, produto, cod_us)
VALUES ('FD1', 10, 3, 'Usuario1', 'Foto', 'Produto A', 1);
INSERT INTO feed (id_feed, curtidas, comentarios, autor, tipo_conteudo, produto, cod_us)
VALUES ('FD2', 20, 5, 'Usuario2', 'Vídeo', 'Produto B', 2);
INSERT INTO feed (id_feed, curtidas, comentarios, autor, tipo_conteudo, produto, cod_us)
VALUES ('FD3', 30, 0, 'Usuario3', 'Foto', 'Produto C', 3);

-- Tabela avaliacoes
CREATE TABLE avaliacoes (
    id_avaliacao VARCHAR(4) PRIMARY KEY,
    data_avaliacao DATE NOT NULL,
    avaliador_fisico VARCHAR(50),
    avaliado_juridico VARCHAR(50),
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO avaliacoes (id_avaliacao, data_avaliacao, avaliador_fisico, avaliado_juridico, cod_us)
VALUES ('AV1', DATE '2023-11-04', 'Usuario1', 'EmpresaA', 1);
INSERT INTO avaliacoes (id_avaliacao, data_avaliacao, avaliador_fisico, avaliado_juridico, cod_us)
VALUES ('AV2', DATE '2023-11-05', 'Usuario2', 'EmpresaB', 2);
INSERT INTO avaliacoes (id_avaliacao, data_avaliacao, avaliador_fisico, avaliado_juridico, cod_us)
VALUES ('AV3', DATE '2023-12-25', 'Usuario3', 'EmpresaC', 3);

-- Tabela telefone
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
VALUES ('TEL1', 11, 55, 12345, 6789, 1);
INSERT INTO telefone (id_telefone, ddd, ddi, prefixo, sufixo, cod_us)
VALUES ('TEL2', 22, 55, 98765, 4321, 2);
INSERT INTO telefone (id_telefone, ddd, ddi, prefixo, sufixo, cod_us)
VALUES ('TEL3', 13, 55, 13579, 2468, 3);

-- Tabela tp_telefone
CREATE TABLE tp_telefone (
    id_tp_telefone INTEGER PRIMARY KEY,
    descricao_tp_telefone VARCHAR(50),
    cod_us INTEGER,
    id_telefone VARCHAR(4),
    FOREIGN KEY (id_telefone) REFERENCES telefone (id_telefone),
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO tp_telefone (id_tp_telefone, descricao_tp_telefone, cod_us, id_telefone)
VALUES (1, 'Celular', 1, 'TEL1');
INSERT INTO tp_telefone (id_tp_telefone, descricao_tp_telefone, cod_us, id_telefone)
VALUES (2, 'Trabalho', 2, 'TEL2');
INSERT INTO tp_telefone (id_tp_telefone, descricao_tp_telefone, cod_us, id_telefone)
VALUES (3, 'Comercial', 3, 'TEL3');

-- Tabela cliente_juridico
CREATE TABLE cliente_juridico (
    cnpj VARCHAR(14) PRIMARY KEY,
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO cliente_juridico (cnpj, cod_us)
VALUES ('18529511000160', 1);
INSERT INTO cliente_juridico (cnpj, cod_us)
VALUES ('59002414000100', 2);
INSERT INTO cliente_juridico (cnpj, cod_us)
VALUES ('03384888049', 3);

-- Tabela cardapio
CREATE TABLE cardapio (
    id_cardapio VARCHAR(4) PRIMARY KEY,
    tipo_cardapio VARCHAR(50),
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO cardapio (id_cardapio, tipo_cardapio, cod_us)
VALUES ('CD1', 'Comida Brasileira', 1);
INSERT INTO cardapio (id_cardapio, tipo_cardapio, cod_us)
VALUES ('CD2', 'Comida Italiana', 2);
INSERT INTO cardapio (id_cardapio, tipo_cardapio, cod_us)
VALUES ('CD3', 'Comida Japonesa', 3);

-- Tabela geolocalizacao
CREATE TABLE geolocalizacao (
    id_geolocalizacao VARCHAR(4) PRIMARY KEY,
    latitude DECIMAL(9, 6),
    longitude DECIMAL(9, 6),
    tipo_ponto VARCHAR(50),
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO geolocalizacao (id_geolocalizacao, latitude, longitude, tipo_ponto, cod_us)
VALUES ('GEO1', -23.550520, -46.633308, 'Restaurante', 1);
INSERT INTO geolocalizacao (id_geolocalizacao, latitude, longitude, tipo_ponto, cod_us)
VALUES ('GEO2', -22.906847, -43.172896, 'Bar', 2);
INSERT INTO geolocalizacao (id_geolocalizacao, latitude, longitude, tipo_ponto, cod_us)
VALUES ('GEO3', -15.780148, -47.929215, 'Escola', 3);

-- Tabela evento
CREATE TABLE evento (
    id_evento VARCHAR(4) PRIMARY KEY,
    nome_evento VARCHAR(50),
    tipo_evento VARCHAR(50),
    descricao_evento VARCHAR(100),
    data_evento DATE,
    cod_us INTEGER,
    FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO evento (id_evento, nome_evento, tipo_evento, descricao_evento, data_evento, cod_us)
VALUES ('EV1', 'Festa de Aniversário', 'Social', 'Aniversário de 30 anos', DATE '2024-09-10', 1);
INSERT INTO evento (id_evento, nome_evento, tipo_evento, descricao_evento, data_evento, cod_us)
VALUES ('EV2', 'Reunião de Negócios', 'Negócio', 'Reunião com clientes importantes', DATE '2024-09-12', 2);
INSERT INTO evento (id_evento, nome_evento, tipo_evento, descricao_evento, data_evento, cod_us)
VALUES ('EV3', 'Show de Música', 'Entretenimento', 'Show ao vivo no centro da cidade', DATE '2024-09-15', 3);
