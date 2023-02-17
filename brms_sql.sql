use project_brms;
drop table if exists trip_management; 

create table trip_management
(Trip_Id int primary key,
Boarding_Time time,
Arrival_Time time,
Ticket_Charges int,
Bus_Reg_No varchar(15),
Route_Id int,
foreign key(Route_Id) references Route(Route_Id),
foreign key(Bus_Reg_No) references bus(Bus_Reg_No));
 
 

insert into trip_management values('1001','08:10:15','03:20:00',900,'AB-9999',101 ),
  (1002,'07:00:15','19:30:00',980 ,'AB-9998',102),
(1003,'21:00:15','14:15:00',1100 ,'AB-9997',103),
(1004,'20:00:15','07:30:00',840 ,'AB-9996',104),
(1005,'16:00:15','05:30:00',640 ,'AB-9995',105);

select * from trip_management;

 drop table Route;
create table Route( Route_Id int primary key,Source  varchar(20),Destination varchar (20));
insert into Route values
("101","Solapur","Pune"),
("102","Pune" ,"Hyderabad"),
("103","Kolhapur","Sangli"),
("104","Belgaum","Goa"),
("105","Mumbai","Pune"),
("106","Mysore","Benglore"),
("107","Delhi","Gurgaon");
select * from Route;

CREATE TABLE bus
(Bus_Reg_No varchar(10),
 Bus_Type varchar(10),
 TotalSeats numeric,No_of_Births varchar(25),
 PRIMARY KEY (Bus_Reg_No));
 
INSERT INTO bus VALUES ("AB-9999","AC",20,"12L+8U");
INSERT INTO bus VALUES ("AB-9998","AC",16,"10L+6U");
INSERT INTO bus VALUES ("AB-9997","NAC",18,"12L+6U");
INSERT INTO bus VALUES ("AB-9996","AC",17,"12L+5U");
INSERT INTO bus VALUES ("AB-9995","NAC",20,"14L+6U");

select * from bus;