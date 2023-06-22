DROP TABLE if exists usuario;

CREATE TABLE if not exists usuario  (
    id INTEGER NOT NULL,
    name VARCHAR(255) NOT NULL,
    occupation VARCHAR(255) NOT NULL,
    githubUser VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);