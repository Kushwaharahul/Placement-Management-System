DROP TABLE IF EXISTS company;

create table company(
id int primary key auto_increment,
password varchar(20) NOT NULL,
name varchar(20) NOT NULL,
email varchar(20) NOT NULL,
phone_number varchar(20) NOT NULL,
profile varchar(20) NOT NULL,
description varchar(500) NOT NULL,
package double(4,2) NOT NULL,
10th_percentage double(5,2) NOT NULL,
12th_percentage double(5,2) NOT NULL,
graduation_percentage double(5,2) NOT NULL
);


insert into company values(1,'123','apple','app@abc','1234','developer','hero',9.5,65,65,65);
insert into company values(2,'234','yahoo','yah@abc','2345','support','hero',3.5,65,65,65);
insert into company values(3,'345','google','goo@abc','3456','tester','hero',5.50,70,65,75);
insert into company values(4,'456','bmw','bmw@abc','4567','CA','hero',7.50,65,65,65);