create table driver_standings (
id bigint primary key ,
race_id bigint ,
driver_id bigint ,
points bigint ,
position bigint ,
position_text  varchar (50),
wins  bigint ,
 
 constraint fk_races_driver_standings foreign key (race_id) references races (id),
 constraint fk_drivers_driver_standings foreign key (driver_id) references drivers (id)
 
)