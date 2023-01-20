use project_brms;
drop table if exists user;

create table user
(username varchar(15),
password varchar(15),
role varchar(20)
);

insert into user values('brms','@123','admin');