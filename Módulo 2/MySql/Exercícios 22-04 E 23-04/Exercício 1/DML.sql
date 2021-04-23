INSERT INTO tb_classe(class_tipo,class_habilidadeEspecial) VALUES("Mago","Fazer sair rainho da mão");
INSERT INTO tb_classe(class_tipo,class_habilidadeEspecial) VALUES("Arqueiro","Atirar coisa de longe");
INSERT INTO tb_classe(class_tipo,class_habilidadeEspecial) VALUES("Metaleiro","Fazer bate cabeça");
INSERT INTO tb_classe(class_tipo,class_habilidadeEspecial) VALUES("Forrozeiro","Dançar agarradinho");
INSERT INTO tb_classe(class_tipo,class_habilidadeEspecial) VALUES("Guerreiro","Dar machadada nos outros");


INSERT INTO tb_personagem(character_nome,tb_classe_class_id,ataque,defesa)
VALUES("Maicon",4,3000,2300) ,
("Maicon",4,3000,2300),
("Euclides",3,1000,4300),
("Arrow",2,1000,2000),
("Kratos",5,9000,1600),
("Gandolf",1,8000,8000),
("Harry Potter",1,5000,3300),
("Arrow cópia barata",2,500,1000);

SELECT * FROM tb_personagem WHERE ataque>2000;

SELECT * FROM tb_personagem WHERE defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagem WHERE character_nome LIKE '%C';

SELECT * FROM tb_personagem p INNER JOIN tb_classe c
ON p.tb_classe_class_id = c.class_id;

SELECT * FROM tb_personagem WHERE tb_classe_class_id=2;