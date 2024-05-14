show databases;

create database spring;

use spring;

create table sample (num int, title varchar(50), res TIMESTAMP default current_timestamp);

select * from sample;

insert into sample values (1, '샘플1', default);
insert into sample values (2, '샘플2', default);
insert into sample values (3, '샘플3', default);

commit;

create table store (storenum int, storename varchar(1000));

select * from store;

drop table custom;

create table custom(id varchar2(20) primary key, pw varchar2(400) not null, name varchar2(50) not null, email varchar2(200),
tel varchar2(18), addr varchar2(200), postcode varchar2(10), resdate date default sysdate);

desc custom;

select * from custom;

create table board(bno int primary key, title varchar2(100), content varchar2(1000), author varchar2(50), vcnt int, 
resdate date default sysdate);

commit;