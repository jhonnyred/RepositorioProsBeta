-- Cria banco
CREATE DATABASE db_ads ENCODING 'LATIN1';

-- Conecta no banco
\c bancopoo;

-- Cria tabela usuario
CREATE TABLE usuario (
    id_usuario SERIAL PRIMARY KEY,
    login VARCHAR(100) NOT NULL,
    senha VARCHAR(100) NOT NULL
);
