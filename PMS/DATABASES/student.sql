DROP TABLE IF EXISTS student;

create table student(
roll_number int primary key identity(100,1) auto_increment,
password varchar(20) NOT NULL,
name varchar(20) NOT NULL,
email varchar(20) NOT NULL,
phone_number varchar(20) NOT NULL,
10th_percentage double(5,2) NOT NULL,
12th_percentage double(5,2) NOT NULL,
graduation_percentage double(5,2) NOT NULL
)engine=InnoDB auto_increment=500;


insert into student values(1,'123','rahul','rah@abc','1234',99.99,90,82);
insert into student values(2,'234','ajay','aj@abc','3434',92.3,85,80);
insert into student values(3,'345','saurav','sau@abc','4234',83.3,88,65);
insert into student values(4,'456','anurag','anu@abc','7890',72.5,56.33,75);
insert into student values(5,'567','ankit','ank@abc','9876',59.99,66.99,55.22);

