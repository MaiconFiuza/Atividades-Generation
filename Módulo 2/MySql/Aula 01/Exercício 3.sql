create database escola;
use escola;

create table alunes(
	id bigint auto_increment,
    nome varchar(30) not null,
    sala int not null,
    nota Decimal(10,2) not null,
    ano int not null,
    
    primary key(id)
    
);

insert into alunes(nome,ano,sala,nota)values("Vitória",1,1,10.0);
insert into alunes(nome,ano,sala,nota)values("Fernanda",1,1,10.0);
insert into alunes(nome,ano,sala,nota)values("Lucas",2,1,4.0);
insert into alunes(nome,ano,sala,nota)values("Douglas",2,2,9.5);
insert into alunes(nome,ano,sala,nota)values("Isac",1,1,10.0);
insert into alunes(nome,ano,sala,nota)values("Maicon",1,1,9.0);
insert into alunes(nome,ano,sala,nota)values("Mayko",2,2,6.0);
insert into alunes(nome,ano,sala,nota)values("Euclides",1,2,7.5);

select * from alunes where nota<7;
select * from alunes where nota>7;

update alunes set nota=10.0 where id=6;

select * from alunes where id=6;
