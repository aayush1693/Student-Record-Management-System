CREATE DATABASE student_record_management;

USE student_record_management;

CREATE TABLE students (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  age INT NOT NULL,
  grade VARCHAR(10) NOT NULL,
  address VARCHAR(255) NOT NULL
);
