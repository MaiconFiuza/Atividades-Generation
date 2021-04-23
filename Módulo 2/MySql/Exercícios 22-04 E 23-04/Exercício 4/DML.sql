INSERT INTO tb_categoria (marca)
VALUES("Sadia"),
("Muratta"),
("Friboi"),
("Swift"),
("Seara");

select * from tb_produto;


INSERT INTO tb_produto (nome,preco,kgs,tb_categoria_id)
VALUES('linguiça',40.5,'5kg',2),
("linguiça",20.5,"5kg",1),
("linguiça",40.5,"5kg",2),
("linguiça",10.5,"5kg",3),
("linguiça",5.5,"1kg",4),
("linguiça",30.5,"5kg",3),
("linguiça",25.5,"3kg",1),
("linguiça",24.5,"3kg",3);

SELECT * FROM tb_produto WHERE preco>50;

SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

SELECT * FROM tb_produto WHERE nome LIKE '%C';

SELECT * FROM tb_produto p INNER JOIN tb_categoria c
ON p.tb_categoria_id = c.id;

SELECT * FROM tb_produto WHERE tb_categoria_id=2;

