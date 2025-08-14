create schema opticaluz;

create table clientes(
DNI INT PRIMARY KEY,
nombrecompleto varchar(40),
nrotelefono varchar(20),
direccion varchar(50));

create table observaciones(
dnipaciente int(10),
fecha varchar(20),
lejos varchar(20),
lejoslente varchar(40),
lejosmarco varchar(40),
cerca varchar(20),
cercalente varchar(40),
cercamarco varchar(40),
foreign key (dnipaciente) references clientes(dni)
);
SELECT
    o.dnipaciente,
    c.nombrecompleto, 
    o.observaciones,
    o.fecha
FROM
    observaciones o
JOIN
    clientes c ON o.dnipaciente = c.dni;
