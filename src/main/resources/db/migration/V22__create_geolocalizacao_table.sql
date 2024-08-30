CREATE TABLE geolocalizacao (
  id_localizacao SERIAL PRIMARY KEY,
  cod_us INTEGER,
  id_bairro INTEGER,
  id_estado INTEGER,
  id_cidade INTEGER,
  id_logradouro INTEGER,
  FOREIGN KEY (cod_us) REFERENCES usuario (cod_us),
  FOREIGN KEY (id_bairro) REFERENCES bairro (id_bairro),
  FOREIGN KEY (id_cidade) REFERENCES cidade (id_cidade),
  FOREIGN KEY (id_estado) REFERENCES estado (id_estado),
  FOREIGN KEY (id_logradouro) REFERENCES logradouro (id_logradouro)
);

INSERT INTO geolocalizacao (id_localizacao, cod_us, id_bairro, id_cidade, id_estado, id_logradouro)
VALUES (DEFAULT, 1, 1, 1, 1, 1),
       (DEFAULT, 2, 2, 2, 2, 2),
       (DEFAULT, 3, 3, 3, 3, 3);
