use db_farmacia_do_bem;

INSERT INTO tb_categoria(capsula ,generico) 
VALUES(true,true),
(false,false),
(true,false),
(false,true);

INSERT INTO tb_produto(nome,dosagem,preco ,fk_categoria)
VALUES("Amoxicilina",25.5,10.00,4),
("Alprazolam",10,70,1),    
("Charope da Rochelle",100,3.50,2),
("Adelanol",25.5,70.30,3),
("Dactinomicina",150,10.00,4),
("Omeprazol",30,40.00,4),
("Lupinol",20,15.00,2),
("Seranol",10,7.00,3);

SELECT * FROM tb_produto WHERE preco>50;

SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

SELECT * FROM tb_produto p 
INNER JOIN tb_categoria c WHERE c.id = p.fk_categoria;

SELECT nome FROM tb_produto 
WHERE nome LIKE "%B%";

SELECT nome, fk_categoria FROM Tb_produto 
WHERE fk_categoria=4;



  


