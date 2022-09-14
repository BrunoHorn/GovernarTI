create table constructor_standings(
id bigint primary key ,
race_id bigint ,
constructor_id  bigint  ,
points  decimal(10,2),
position bigint,
position_text  varchar (50),
wins bigint,
 constraint fk_races_constructor_standings foreign key (race_id) references races (id),
 constraint fk_constructors_constructor_standings foreign key (constructor_id) references constructors (id)
)