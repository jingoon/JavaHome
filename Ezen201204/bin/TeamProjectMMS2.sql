create table menu(
fullname varchar2(100) primary key,
name varchar2(20)
)

insert into menu values ('com.naver.InsertCommand_jin', '�Է�')
insert into menu values ('com.naver.SelectCommand', '��ȸ')
insert into menu values ('com.naver.UpdateCommand', '����')
insert into menu values ('com.naver.DeleteCommand', '����')
insert into menu values ('com.naver.EndCommand', '����')
insert into menu values ('com.naver.SelectByidCommand', '�Է�(test)')

delete from menu where name='�Է�'
select * from menu
-------- 
���� ���� ���� ���̺� ��ȸ
 SELECT *FROM tab
--------
create table member_P(
member_num number,
member_id varchar2(20),
member_pw varchar2(20),
member_name varchar2(20),
member_birth varchar2(20),
member_email varchar2(20)
)

alter table member_P add constraint pk_member_P_member_num primary key (member_num)

CREATE SEQUENCE num
START WITH 1000001
INCREMENT BY 1
NOMAXVALUE
NOMINVALUE
NOCYCLE
NOCACHE;

insert into MEMBER_P values (7, 'm001', 'pw1234','kim','2000-10-20','qwer2@gmail.com')
insert into MEMBER_P values (2, 'kiskdo032', 'pw1234','lee','2000-11-20','q23er2@gmail.com')
insert into MEMBER_P values (3, '2sdsd', 'pw1234','choi','2000-11-20','q23er2@gmail.com')
insert into MEMBER_P values (4, 'gr4g4', 'pw1234','park','2000-11-20','q23er2@gmail.com')
insert into MEMBER_P values (5, 'uff5', 'pw1234','jin','2000-11-20','q23er2@gmail.com')
select * from member_P
select * from member_P where member_birth like '%05%'

delete from MEMBER_P where member_num = '2'
select max(member_pw) from member_p
------------
- ���̺�� ���ϱ�
- ���ο� �÷� �߰��� ������?
 - member_email
 - member_date

-���
insert
- ȸ����ȣ �ڵ�����: ȸ����ȣ �Է����� �ʰ� �߰�
- ȸ������ �Է����� �ʾƵ� ȸ���߰�

select
- ��ü��ȸ
- ���̵���ȸ
- ȸ����ȣ ��ȸ

- ȸ������ ��¥ ��ȸ
 - Ư���� �˻� ��ȸ
 - ��⵵ ��� ~ ��� ���� ����, ȸ�� ��ȸ
- ���̷� ��ȸ(20�� ȸ�� ��ȸ, 6���� ��ȸ ��)

update
(select �޾Ƽ� ����)
- ���̵���ȸ -> ����
- ȸ����ȣ ��ȸ -> ����
- ���̷� ��ȸ -> ����
- Ư�� �÷� ��ȸ ����

delete
(select �޾Ƽ� ����)
- ���̵���ȸ ����
- ȸ����ȣ ��ȸ ����
- ���̷� ��ȸ ���� ����
- Ư�� ��¥�� ������ ȸ�� ����