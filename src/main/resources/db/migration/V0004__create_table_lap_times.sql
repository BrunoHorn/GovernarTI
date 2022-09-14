create table lap_times (
id bigserial primary key,
race_id bigint ,
driver_id bigint ,
lap bigint,
position bigint ,
time varchar (50),
milliseconds varchar (50),
 constraint fk_races_lapTimes foreign key (race_id) references races (id),
 constraint fk_drivers_lapTimes foreign key (driver_id) references drivers (id)
);
