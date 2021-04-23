INSERT INTO tb_categoria(nomeCat,presencial)VALUES
("Tecnologia",false),
("Saúde",true),
("Educação",true),
("Engenharia",false),
("Gestão",false);


INSERT INTO tb_produto (nome,preco,turma,fk_categoria) VALUES
("Redes de computadores",60.00,"Turma 1",1),
("Ciência da Computação",600.00,"Turma 2",1),
("Engenharia Cívil",200.00,"Turma 3",4),
("Administração",500.00,"Turma 4",5),
("Enfermagem",800.00,"Turma 5",2),
("Médicina",1800.00,"Turma 6",2),
("História",200.00,"Turma 7",3),
("Análise e Desenvolvento de Sistema",600.00,"Turma 8",1);
   
SELECT * FROM tb_produto WHERE preco > 50;

SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

SELECT * FROM tb_categoria c 
INNER JOIN tb_produto p
WHERE c.id = p.fk_categoria;

SELECT * FROM tb_produto WHERE fk_categoria=2;

SELECT * FROM tb_produto WHERE nome LIKE '%J';


