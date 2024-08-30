CREATE TABLE categoria (
  id_categoria SERIAL PRIMARY KEY,
  id_eventos INTEGER,
  nome_categoria VARCHAR(50) NOT NULL,
  FOREIGN KEY (id_eventos) REFERENCES eventos (id_eventos)
);

INSERT INTO categoria (id_categoria, id_eventos, nome_categoria)
VALUES (DEFAULT, 1, 'Aniversário Adulto'),
       (DEFAULT, 2, 'Comédia'),
       (DEFAULT, 3, 'Música');
    