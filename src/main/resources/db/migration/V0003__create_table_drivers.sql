create table drivers (
id bigint not null ,
driver_ref varchar (50),
number  varchar (10),
code   varchar (10),
forename varchar (100),
surname varchar (100),
dob  date,
nationality varchar (100),
url varchar (150),
primary key (id)
) ;