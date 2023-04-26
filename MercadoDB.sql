create database super;
use super;
create table cliente(
id int auto_increment,
nomCli varchar(20) not null,
nacCli int(6) not null,
primary key(id))engine=InnoDB;

insert into cliente(nomCli, nacCli) values ("Omar","1934");
insert into cliente(nomCli, nacCli) values ("Gaston","2000");


select * from cliente;
