create table employee
(name varchar2(25),
ssn number(9),
super_ssn number(9),
salary number(5),
dno number(1),
primary key (ssn));

create table department 
(dname varchar2(25),
dnumber number(1),
mgr_ssn number(9),
primary key (dnumber),
foreign key (mgr_ssn) references employee (ssn));

insert into employee
VALUES('bob', 123456789, 234567890, 1000, 1);

insert into employee
VALUES('john', 234567890, 333445555, 2000, 1);

insert into employee
VALUES('alice', 333445555, 999999999, 3000, 1);

insert into department
VALUES('dept1', 1, 333445555);

insert into employee
VALUES('tom', 987654321, 098765432, 0200, 2);

insert into employee
VALUES('cam', 098765432, 098765432, 0800, 2);

insert into department
VALUES('dept2', 2, 098765432);