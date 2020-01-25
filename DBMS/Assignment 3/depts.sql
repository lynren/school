create table project(
pname varchar2(25),
pnumber number(2),
plocation varchar2(25),
dnum number(1),
primary key (pnumber));

create table works_on(
essn number(9),
pno number(2),
hours number(3,1),
primary key (essn, pno),
foreign key (pno) references project (pnumber));

insert into project
values('productX', 1, 'bellaire', 1);

insert into project
values('productY', 2, 'sugarland', 2);

insert into project
values('productZ', 3, 'windsor', 1);

insert into works_on
values(123456789, 1, 5);

insert into works_on
values(123456789, 2, 5);

insert into works_on
values(123456789, 3, 5);

insert into works_on
values(234567890, 2, 5);