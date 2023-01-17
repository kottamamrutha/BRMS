use project_brms;
drop table if exists trip_management; 
create table trip_management
(Trip_Id int primary key auto_increment,
Boarding_Time time,
Arrival_Time time,
Ticket_Charges int,
Route_Id int,
foreign key(Route_Id) references Route(Route_Id));

insert into trip_management values('0001','08:10:15','03:20:00',900);
insert into trip_management(Boarding_Time,
Arrival_Time,
Ticket_Charges) values('07:00:15','19:30:00',980),
('21:00:15','14:15:00',1100),
('20:00:15','07:30:00',840);
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

