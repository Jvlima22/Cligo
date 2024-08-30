CREATE TABLE presenca (
  id_presenca SERIAL PRIMARY KEY,
  cod_us INTEGER,
  data_confirmação DATE,
  FOREIGN KEY (cod_us) REFERENCES usuario (cod_us)
);

INSERT INTO presenca (id_presenca, cod_us, data_confirmação)
VALUES (DEFAULT, 1, '2023-11-07'),
       (DEFAULT, 2, '2023-11-08'),
       (DEFAULT, 3, '2023-11-09');
