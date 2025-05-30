create table employee_details(
	employee_id SERIAL PRIMARY KEY,
	full_name varchar(100) NOT NULL,
	email varchar(100) unique,
	salary numeric(10, 2),
	is_active BOOLEAN default TRUE,
	joining_date DATE NOT NULL,
	created_ts TIMESTAMP
);

commit;

insert into employee_details(
full_name,
email,
salary,
is_active,
joining_date,
created_ts
) values ('Srinath', '123@gmail.com', 100000, TRUE, '2025-01-01', current_timestamp);

insert into employee_details(
full_name,
email,
salary,
is_active,
joining_date,
created_ts
) values ('Anush', 'Anusha@gmail.com', 200000, TRUE, '2025-02-02', current_timestamp),
('Prathiba', 'prathiba@gmail.com', 100000, FALSE, '2025-01-15', current_timestamp),
('Sreeja', 'sreeja@gmail.com', 100000, TRUE, '2025-01-20', current_timestamp),
('Pooja', 'Pooja@gmail.com', 200000, TRUE, '2025-01-25', current_timestamp);

commit;

select * from employee_details;

select * from employee_details group by employee_id;

select salary,full_name, count(*) from employee_details group by salary, full_name;

select max(salary) from 

select * from employee_details order by created_ts desc;

select * from employee_details order by created_ts asc;

select count(*) from employee_details;

update employee_details set salary = 150000 where employee_id = 2;
commit;

delete from employee_details where employee_id = 1;

create table employee_department(
	department_id SERIAL PRIMARY KEY,
	department_name varchar(100) NOT NULL,
	salary numeric(10, 2)
);


insert into employee_department(
department_name,
salary
) values('HR', 100000),
('java developer', 200000),
('data science', 200000),
('QA Automation', 100000),
('aws developer', 100000);

commit;

select * from employee_department;

select ed.full_name, ed.email, empdept.department_name from employee_details ed
inner join employee_department empdept on ed.salary = empdept.salary;

select distinct full_name, email,joining_date  from employee_details
right join employee_department 
on employee_details.salary = employee_department.salary;
