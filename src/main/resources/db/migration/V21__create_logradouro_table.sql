CREATE TABLE logradouro (
  id_logradouro SERIAL PRIMARY KEY,
  cep VARCHAR(9) NOT NULL,
  nome_logradouro VARCHAR(50) NOT NULL,
  numero VARCHAR(10) NOT NULL,
  complemento VARCHAR(50),
  cod_us INTEGER,
  id_bairro INTEGER,
  id_estado INTEGER,
  id_cidade INTEGER,
  FOREIGN KEY (cod_us) REFERENCES usuario (cod_us),
  FOREIGN KEY (id_bairro) REFERENCES bairro (id_bairro),
  FOREIGN KEY (id_estado) REFERENCES estado (id_estado),
  FOREIGN KEY (id_cidade) REFERENCES cidade (id_cidade)
);

INSERT INTO logradouro (id_logradouro, cep, nome_logradouro, numero, complemento, cod_us, id_bairro, id_cidade, id_estado)
VALUES (DEFAULT, '01234-567', 'Rua Principal', '123', 'Apto 101', 1, 1, 1, 1),
       (DEFAULT, '04567-890', 'Avenida Central', '456', NULL, 2, 2, 2, 2),
       (DEFAULT, '01234-567', 'Rua das Flores', '789', 'Casa', 3, 3, 3, 3);
