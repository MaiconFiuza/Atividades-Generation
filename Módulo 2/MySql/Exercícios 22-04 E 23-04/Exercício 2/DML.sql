USE db_pizzaria_legal;
  INSERT INTO tb_categoria ( cate_tipo,tb_tamanho) VALUES
  ("Pizza Doce","Grande"),
  ("Pizza Doce","Pequena"),
  ("Pizza Salgada","Grande"),
  ("Pizza Salgada","Pequena"),
  ("Pizza Salgada","Extra Grande");
  

  
  INSERT INTO tb_pizza(pizza_nome,pizza_acompanhamento,tb_categoria_pk_categoria,pizza_preco) VALUES
  ("Mussarela","Coca cola",3,45.99),
  ("Mussarela","Coca cola",4,25.99),
  ("Mussarela","Coca cola",5,60.99),
  ("Brigadeiro","Guaraná",1,50.99),
  ("Doce de Leite","Guaraná",2,30.99),
  ("Doce de Leite","Guaraná",1,60.99),
  ("Calabresa","Dolly Limão",1,50.99),
  ("Calabresa","Dolly Limão",2,19.99);
  
  SELECT * FROM tb_pizza WHERE pizza_preco > 45;
  
  SELECT * FROM tb_pizza WHERE pizza_preco BETWEEN 29 AND 60;
  
  SELECT * FROM tb_pizza WHERE pizza_nome LIKE "%C";
  
  SELECT * FROM tb_pizza p INNER JOIN tb_categoria c
  WHERE p.pk_categoria = c.tb_categoria_pk_categoria;
  
  SELECT * FROM tb_pizza WHERE tb_categoria_pk_categoria =2;
  
  
  