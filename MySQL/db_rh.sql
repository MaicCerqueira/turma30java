create database db_rh;
use db_rh;

create table tb_funcionaries(
	id bigint auto_increment, primary key(id),
    nome varchar(50) not null,
    setor varchar(25) not null,
	salario decimal(10,2) not null,
    ativo boolean not null
);

insert into tb_funcionaries(nome, setor, salario, ativo) values("Pamela Paulino", "Gestão", 2100.00, true);
insert into tb_funcionaries(nome, setor, salario, ativo) values("Ana Beatriz", "Recrutadora", 1900.00, true);
insert into tb_funcionaries(nome, setor, salario, ativo) values("Maicon Cerqueira", "Consultoria", 2250.00, true);
insert into tb_funcionaries(nome, setor, salario, ativo) values("Thiago Machado", "Gestão", 2100.00, true);
insert into tb_funcionaries(nome, setor, salario, ativo) values("João Pedro", "Consultoria", 2250.00, true);

select * from tb_funcionaries where salario > 2000.00;
select * from tb_funcionaries where salario < 2000.00;

update tb_funcionaries set salario = 2300.00 where id = 2; 