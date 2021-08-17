use test

create table student (rollNumber int(4) primary key,studentName varchar(20) ,markScored double );

desc student;

select * from student;

select * from student

update student set markscored =95 where rollNumber =101

delete from student where rollNumber =101