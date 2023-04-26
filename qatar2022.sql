
use qatar2022;

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
foreign key(DepEmpleado) references departamento (NroDepart) on delete cascade on update cascade
)engine=InnoDB;


-- CARGA DE DEPARTAMENTOS
insert into departamento(
NroDepart,
NomDepart,
PresupDepart)values("3", "sistemas","33.50");

insert into departamento(
NroDepart,
NomDepart,
PresupDepart)values("2","compras","22.20");

insert into departamento(
NroDepart,
NomDepart,
PresupDepart)values("1", "logistica","44.10");


-- CARGA DE EMPLEADOS
insert into empleados(
DniEmpleado,
NomEmpleado,
ApeEmpleado,
NacionalidadEmpleado,
DepEmpleado) values(
'202041', 'Julio', 'Ortega', 'Cubano', '3'
);

insert into empleados(
DniEmpleado,
NomEmpleado,
ApeEmpleado,
NacionalidadEmpleado,
DepEmpleado)values("158923","Alberto","Quintero","Chile","2"
);

insert into empleados(
DniEmpleado,
NomEmpleado,
ApeEmpleado,
NacionalidadEmpleado,
DepEmpleado) values(
'432314', 'Damian', 'Sosa', 'Ven', '1'
);


select * from empleados ;
-- ACTUALIZACION DE NACIONALIDAD
update empleados set NacionalidadEmpleado = 'Español' where DniEmpleado= 432314;
select * from empleados;

-- DEPARTAMENTO DE LOGISTICA
select * from empleados where DepEmpleado=1;

-- DEPARTAMENTOS ORDENADOS ALFABETICAMENTE EN ORDEN DESCENDENTE
select * from departamento order by NomDepart desc;

-- ELIMINAR DEPARTAMENTO
delete from departamento where NroDepart=3;