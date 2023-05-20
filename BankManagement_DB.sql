create database BankManagementSystem ;

show databases;

use bankmanagementsystem;

create table signup(formno varchar(20),name varchar(20),fathername varchar(20),
dob varchar(20),gender varchar(20),email varchar(30), maritalst varchar(20),
addr varchar(40),city varchar(20),state varchar(25),pin varchar(20));

show tables;

delete from signup where formno=87;

select * from signup;

DELETE FROM signup; 








drop table signuptw;

create table signuptw(formno varchar(20), religon varchar(20), cast varchar(20),
				inco varchar(30),educ varchar(20),occup varchar(20), senior varchar(20),
				existing varchar(20),adhar varchar(20),pan varchar(20));


select * from signuptw;

DELETE FROM signuptw; 
	






create table signupthree(formno varchar(20), accounttype varchar(40),
 cardno varchar(30), pinno varchar(10), facility varchar(200));


drop table signupthree;

delete from signupthree;

select * from signupthree;






create table login (formno varchar(20),  cardno varchar(30), pinno varchar(10));
delete from login;


select * from login;

delete from login;









create table bank(pinno varchar(10), dateof varchar(30), 
typeoftr varchar(20), amount varchar(30));

delete from bank;

drop table bank;


select * from bank;

DELETE FROM bank WHERE dateof='Fri Apr 28 17:49:23 IST 2023' ;








select * from bank;


select * from login;



