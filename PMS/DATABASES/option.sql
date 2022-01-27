DROP TABLE IF EXISTS options;

create table options(
serial_number int primary key auto_increment,
question_id int(11) NOT NULL,
a varchar(500) NOT NULL,
b varchar(500) NOT NULL,
c varchar(500) NOT NULL,
d varchar(500) NOT NULL,
constraint op_fk foreign key(question_id) references paper(s_no)
ON DELETE CASCADE
ON UPDATE CASCADE
);

insert into options values(1,1,'hi','hello','yahoo','go');
insert into options values(2,2,'qq','ww','ee','rr');
insert into options values(3,3,'zzz','ddd','aa','ss');
insert into options values(4,4,'xx','cc','bb','nn');
