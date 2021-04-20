create database rh_exe;
use rh_exe;

create table funcionaries(
	id bigint auto_increment,
    nome varchar(120) not null,
    salario decimal(10,2) not null,
    telefone varchar(11) ,
    cargo varchar(20) not null,
    
    primary key(id)
    
);

insert into funcionaries(nome,salario,telefone,cargo)values("Maicon",5000,"11951077123","Dev Júnior");
insert into funcionaries(nome,salario,telefone,cargo)values("Euclides",5000,"11999999999","Dev Júnior");
insert into funcionaries(nome,salario,telefone,cargo)values("Douglas",12000,"11888888888","Dev Sênior");
insert into funcionaries(nome,salario,telefone,cargo)values("Mayko",1900,"11777777","DBA");
insert into funcionaries(nome,salario,telefone,cargo)values("Vitória",15000,"11666666","Scrum Master");

select * from funcionaries where salario >2000;

select * from funcionaries where salario <2000;

update funcionaries set salario=5000 where id=4;

select * from funcionaries;
