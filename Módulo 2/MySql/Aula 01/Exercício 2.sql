create database ecommerce;
use ecommerce;

create table produtos(
	id bigint auto_increment,
    tipo varchar(30) not null,
    marca varchar(20) not null,
    preco Decimal(10,2) not null,
    cor varchar(15) not null,
    
    primary key(id)
    
);

insert into produtos(tipo,marca,cor,preco)values("Camiseta","Nike","vermelha",130.00);
insert into produtos(tipo,marca,cor,preco)values("Camiseta","Oakley","vermelha",100.00);
insert into produtos(tipo,marca,cor,preco)values("Meia","Nike","branca",15.00);
insert into produtos(tipo,marca,cor,preco)values("Meia","Oakley","amarelo",20.00);
insert into produtos(tipo,marca,cor,preco)values("Tênis","Nike","vermelho",550.00);
insert into produtos(tipo,marca,cor,preco)values("Tênis","Adidas","rosa",600.00);
insert into produtos(tipo,marca,cor,preco)values("Camiseta","Adidas","branco",200.00);
insert into produtos(tipo,marca,cor,preco)values("Camiseta","Loyal","amarela",20.00);

select * from produtos where preco<500;
select * from produtos where preco>500;

update produtos set marca="Loyal Br" where id=8;

select * from produtos where id=8;


