create schema opticaluz;

create table clientes(
DNI INT PRIMARY KEY,
nombrecompleto varchar(40),
nrotelefono varchar(20),
direccion varchar(50));

create table observaciones(
observaciones varchar(250),
dnipaciente int(10),
fecha date,
foreign key (dnipaciente) references clientes(dni)
);
