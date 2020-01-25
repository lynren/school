SELECT e.name
FROM employee e, department
WHERE e.dno=dnumber AND dnumber IN 
(SELECT dnumber
FROM department, employee
WHERE dnumber=dno AND salary IN 
(SELECT salary FROM employee
WHERE salary in (select min(salary) from employee)));

SELECT name FROM employee
WHERE super_ssn in
(SELECT ssn FROM employee
WHERE super_ssn=333445555);

SELECT name FROM employee
WHERE salary > (select min(salary) from employee)+10000;