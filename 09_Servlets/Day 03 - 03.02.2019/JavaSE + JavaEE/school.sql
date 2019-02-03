/* STEP 1: CREATE DB */
CREATE DATABASE School;

/* STEP 2: CREATE A TABLE IN THE DB */
USE School;
CREATE TABLE students(
student_id 	    	int(3) AUTO_INCREMENT PRIMARY KEY,
student_name 	    varchar(25) NOT NULL,
student_age 	    int NOT NULL CHECK (student_age>=0 AND student_age<=120),
student_grade 	    int NOT NULL CHECK (student_grade>=0 AND student_grade<=100)
);

/* STEP 3: INSERT INTO THE TABLE NEW RECORDS */
USE School;
INSERT INTO students (`student_name`,`student_age`,`student_grade`)
VALUES 
('Bob',20,100),
('Alice',21,70),
('Tom',40,95),
('Talia',18,100),
('Nil',20,100);


/* STEP 4: SELECT ALL RECORDS - TO TEST IF PREV STEPS RAN SUCCESSFULLY */
USE School;
SELECT * FROM students;













