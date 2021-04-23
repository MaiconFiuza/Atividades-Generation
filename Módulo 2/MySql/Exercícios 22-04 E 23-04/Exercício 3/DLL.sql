CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE tb_categoria (
	id INT NOT NULL AUTO_INCREMENT,
    capsula BOOLEAN NOT NULL,
    generico BOOLEAN NOT NULL,
    
    PRIMARY KEY(id)

);

CREATE TABLE tb_produto (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    dosagem FLOAT NOT NULL,
    preco FLOAT NOT NULL,
    fk_categoria INT NOT NULL,
    
    PRIMARY KEY(id),
    FOREIGN KEY (fk_categoria) REFERENCES tb_categoria (id)
);