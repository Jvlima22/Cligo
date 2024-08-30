CREATE TABLE estado (
  id_estado SERIAL PRIMARY KEY,
  nome_estado VARCHAR(50) NOT NULL,
  sigla_estado VARCHAR(2) NOT NULL,
  cod_us INTEGER,
  FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO estado (id_estado, nome_estado, sigla_estado, cod_us)
VALUES (DEFAULT, 'São Paulo', 'SP', 1),
       (DEFAULT, 'Rio de Janeiro', 'RJ', 2),
       (DEFAULT, 'Minas Gerais', 'MG', 3);
