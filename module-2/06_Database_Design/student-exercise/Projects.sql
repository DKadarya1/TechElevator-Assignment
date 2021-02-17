BEGIN TRANSACTION;


DROP TABLE IF EXISTS departments;
DROP TABLE IF EXISTS employees;
DROP TABLE IF EXISTS projects;
DROP TABLE IF EXISTS projects_employees;
DROP TABLE IF EXISTS id;
DROP TABLE IF EXISTS job_titles;
DROP TABLE IF EXISTS dates;

CREATE TABLE job_titles
(
	id serial,
	title varchar(100) NOT NULL,
	CONSTRAINT pk_job_titles_id PRIMARY KEY (id)
);

CREATE TABLE dates
(
	id serial,
	date_added timestamp DEFAULT NOW() NOT NULL,
	CONSTRAINT pk_dates_id PRIMARY KEY (id)
);

CREATE TABLE departments
(
	department_number serial,
	name varchar(100) NOT NULL,
	CONSTRAINT pk_departments_department_number PRIMARY KEY (department_number)
);

CREATE TABLE employees
(
	employee_number serial,
	job_title_id integer NOT NULL,
	first_name varchar(100) NOT NULL,
	last_name varchar(100) NOT NULL,
	gender varchar(50),
	birthday_id integer NOT NULL,
	hire_date_id integer NOT NULL,
	department_id integer NOT NULL,
	CONSTRAINT pk_employees_employee_number PRIMARY KEY (employee_number),
	CONSTRAINT fk_employees_job_title_id FOREIGN KEY (job_title_id) REFERENCES job_titles (id),
	CONSTRAINT fk_employees_birthday_id FOREIGN KEY (birthday_id) REFERENCES dates (id),
	CONSTRAINT fk_employees_hire_date_id FOREIGN KEY (hire_date_id) REFERENCES dates (id),
	CONSTRAINT fk_employees_department_id FOREIGN KEY (department_id) REFERENCES departments (department_number)
);

CREATE TABLE projects
(
	project_number serial,
	name varchar(64) NOT NULL,
	start_date_id integer NOT NULL,
	CONSTRAINT pk_projects_project_number PRIMARY KEY (project_number)
);

CREATE TABLE projects_employees
(
	projects_id integer NOT NULL,
	employees_id integer NOT NULL,
	CONSTRAINT pk_projects_employees_projects_id_employees_id PRIMARY KEY (projects_id, employees_id)
);

-- inserting values in table.
INSERT INTO departments (department_number, name) VALUES (1, 'Information Technology');
INSERT INTO departments (department_number, name) VALUES (2, 'Marketing');
INSERT INTO departments (department_number, name) VALUES (3, 'Human Resources');
       
INSERT INTO dates (id) VALUES (1);
INSERT INTO dates (id) VALUES (2);
INSERT INTO dates (id) VALUES (3);
INSERT INTO dates (id) VALUES (4); 

INSERT INTO projects (project_number, name, start_date_id) VALUES (1, 'Home Development', 1);
INSERT INTO projects (project_number, name, start_date_id) VALUES (2, 'App Deployment', 2);
INSERT INTO projects (project_number, name, start_date_id) VALUES (3, 'New Operating Systems', 3);
INSERT INTO projects (project_number, name, start_date_id) VALUES (4, 'New chairs', 4);        


INSERT INTO job_titles (id, title) VALUES (1, 'Applications Developer');
INSERT INTO job_titles (id, title) VALUES (2, 'Senior Developer');
INSERT INTO job_titles (id, title) VALUES (3, 'junior Developer');
INSERT INTO job_titles (id, title) VALUES (4, 'Marketing');


INSERT INTO dates (id) VALUES (5);
INSERT INTO dates (id) VALUES (6);
INSERT INTO dates (id) VALUES (7);
INSERT INTO dates (id) VALUES (8);
INSERT INTO dates (id) VALUES (9);
INSERT INTO dates (id) VALUES (10);
INSERT INTO dates (id) VALUES (11);
INSERT INTO dates (id) VALUES (12);

INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (1, 1, 'Dhakaram', 'Kadarya', 'Male', 5, 5, 1);
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (2, 1, 'Hemanta', 'Dahal', 'Male', 6, 6, 1);
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (3, 2, 'Katie', 'Teshome', 'Female', 7, 7, 1);
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (4, 2, 'Tom', 'Medvitz', 'Male', 8, 8, 1);
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (5, 4, 'Betny', 'Dialson', 'Female', 9, 9, 2);
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (6, 4, 'Diya', 'Loveson', 'Female', 10, 10, 2);
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (7, 3, 'Mark', 'Simpson', 'Male', 11, 11, 3);
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (8, 3, 'craig', 'Ketchum', 'Male', 12, 12, 3);



INSERT INTO projects_employees (projects_id, employees_id) VALUES (1, 5);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (1, 8);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (2, 3);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (2, 1);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (3, 4);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (3, 7);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (3, 6);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (4, 2);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (4, 8);

COMMIT;

