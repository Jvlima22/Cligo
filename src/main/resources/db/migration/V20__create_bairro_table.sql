CREATE TABLE bairro (
  id_bairro SERIAL PRIMARY KEY,
  nome_bairro VARCHAR(50) NOT NULL,
  cod_us INTEGER,
  id_estado INTEGER,
  id_cidade INTEGER,
  FOREIGN KEY (cod_us) REFERENCES usuario (cod_us),
  FOREIGN KEY (id_estado) REFERENCES estado (id_estado),
  FOREIGN KEY (id_cidade) REFERENCES cidade (id_cidade)
);

INSERT INTO bairro (id_bairro, nome_bairro, cod_us, id_estado, id_cidade)
VALUES (DEFAULT, 'Vila Mariana', 1, 1, 1),
       (DEFAULT, 'Copacabana', 2, 2, 2),
       (DEFAULT, 'Savassi', 3, 3, 3);
