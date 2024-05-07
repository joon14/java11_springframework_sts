create table sample (num int, title varchar2(50), res TIMESTAMP default sysdate);

select * from sample;

insert into sample values (1, 'ป๙วร1', default);
insert into sample values (2, 'ป๙วร2', default);
insert into sample values (3, 'ป๙วร3', default);

commit;
