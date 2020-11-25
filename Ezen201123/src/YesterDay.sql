create table member(
id varchar2(6),
name varchar2(15),
job varchar2(2),
birth date
)

insert into MEMBER values ('m001', 'kim','a','2000-12-25')

alter table member add constraint pk_member_id primary key(id)

select * from MEMBER

