CREATE DATABASE db_cursoDaMinhaVida;
USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria (
   id INT NOT NULL AUTO_INCREMENT,
   nomeCat VARCHAR(60) NOT NULL,
   presencial BOOLEAN NOT NULL,
   
   PRIMARY KEY(id)
   );
   
   CREATE TABLE tb_produto (
   id INT NOT NULL AUTO_INCREMENT,
   nome VARCHAR(60) NOT NULL,
   preco FLOAT NOT NULL,
   turma VARCHAR(30) NOT NULL,
   fk_categoria INT NOT NULL,
   
   PRIMARY KEY(id),
   FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id)
   );
   
   

