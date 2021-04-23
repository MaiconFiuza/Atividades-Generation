CREATE DATABASE db_construindo_a_nossa_vida;
USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria (
   id INT NOT NULL AUTO_INCREMENT,
   nome VARCHAR(60) NOT NULL,
   
   PRIMARY KEY(id)
   );
   
   CREATE TABLE tb_produto (
   id INT NOT NULL AUTO_INCREMENT,
   nome VARCHAR(60) NOT NULL,
   preco FLOAT NOT NULL,
   cor VARCHAR(30) NOT NULL,
   fk_categoria INT NOT NULL,
   
   PRIMARY KEY(id),
   FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id)
   );
   
   

