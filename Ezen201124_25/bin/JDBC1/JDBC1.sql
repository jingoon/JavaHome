// �ܷ�Ű ���� ���� ���̺� �����
create table menu(
name varchar2(15) primary key,
price number
)

insert into menu values ('�Ұ��', 15000)
insert into menu values ('��������', 20000)
insert into menu values ('�ߵ�����', 25000)
insert into menu values ('�����', 15000)

select * from MENU

create table orderm(
tablenum number(2),
name varchar2(15),
constraint pk_orderm_tablenum primary key(tablenum)
)

alter table orderm add constraint fk_orderm_name foreign key(name) references menu(name)

insert into orderm values (01, '�Ұ��')
insert into orderm values (02, '��������')
insert into orderm values (04, '�����')
insert into orderm (tablenum) values (05)
�ַ�Ű null ����
insert into orderm values (06, '�����')
�ַ�Ű �ߺ����� 

insert into orderm values (06, '�ߵ�����')
�⺻Ű �ɷ��� �ȵ�
insert into orderm values (07, '����')
�ܷ�Ű �ɷ��� �ȵ�

select * from orderm

select* from member
