INSERT INTO tb_categoria(nome) VALUES
("Cozinha"),
("Sala"),
("Banheiro"),
("Quarto"),
("Quintal");
 
INSERT INTO  tb_produto(nome,preco,cor,fk_categoria) VALUES
("Escada",50.5,"branca",5),
("Panela",30.20,"Vermelha",1),
("Televisão",1200,"preta",2),
("Pia ",200.00,"branca",1),
("Pia",120.00,"branca",3),
("Janela",160.00,"cinza",4),
("Espelho",60.00,"branco",4),
("Espelho",60.00,"preto",4);

SELECT * FROM tb_produto WHERE preco > 50;

SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

SELECT * FROM tb_produto WHERE nome LIKE '%C';

SELECT * FROM tb_produto p INNER JOIN  tb_categoria c
WHERE P.fk_categoria = c.id;

SELECT * FROM tb_produto WHERE cor="branco";




   