create table pit_stop (
id bigserial primary key,
race_id bigint ,
driver_id bigint ,
stop  bigint ,
time varchar (50),
duration  varchar (50),
milliseconds varchar (50),
 constraint fk_races_pit_stop foreign key (race_id) references races (id),
 constraint fk_drivers_pit_stop foreign key (driver_id) references drivers (id)
);