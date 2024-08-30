CREATE TABLE cidade (
  id_cidade SERIAL PRIMARY KEY,
  nome_cidade VARCHAR(50) NOT NULL,
  cod_us INTEGER,
  id_estado INTEGER,
  FOREIGN KEY (id_estado) REFERENCES estado (id_estado),
  FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO cidade (id_cidade, cod_us, nome_cidade, id_estado)
VALUES (DEFAULT, 1, 'São Paulo', 1),
       (DEFAULT, 2, 'Rio de Janeiro', 2),
       (DEFAULT, 3, 'Belo Horizonte', 3);
