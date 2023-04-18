CREATE TABLE departamento(
NroDepart int(9) not null,
NomDepart varchar(30) not null,
PresupDepart decimal(4,2) not null,
primary key (NroDepart)
)engine=InnoDB;

CREATE TABLE empleados(
DniEmpleado int(12) not null,
NomEmpleado varchar(20) not null,
ApeEmpleado varchar(20) not null,
NacionalidadEmpleado varchar(20) not null,
primary key(DniEmpleado),
DepEmpleado int(9),
foreign key(DepEmpleado) references departamento (NroDepart) on delete no action on update no action 
)engine=InnoDB;

