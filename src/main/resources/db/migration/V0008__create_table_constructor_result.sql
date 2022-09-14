create table constructor_result(
id bigint primary key ,
race_id bigint ,
constructor_id  bigint  ,
points  decimal(10,2),
status  varchar (50),
 constraint fk_races_constructor_result foreign key (race_id) references races (id),
 constraint fk_constructors_constructor_result foreign key (constructor_id) references constructors (id)
)