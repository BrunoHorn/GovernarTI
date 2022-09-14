create table qualifying(
id bigint primary key ,
race_id bigint ,
driver_id bigint ,
constructor_id bigint ,
number  bigint ,
position bigint ,
q1 varchar(15),
q2 varchar(15),
q3 varchar(15),
 constraint fk_races_qualifying foreign key (race_id) references races (id),
 constraint fk_constructors_qualifying foreign key (constructor_id) references constructors (id),
 constraint fk_driver_qualifying foreign key (driver_id) references drivers (id)
)