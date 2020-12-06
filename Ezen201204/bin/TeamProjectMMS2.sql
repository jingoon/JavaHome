create table menu(
fullname varchar2(100) primary key,
name varchar2(20)
)

insert into menu values ('com.naver.InsertCommand_jin', '입력')
insert into menu values ('com.naver.SelectCommand', '조회')
insert into menu values ('com.naver.UpdateCommand', '수정')
insert into menu values ('com.naver.DeleteCommand', '삭제')
insert into menu values ('com.naver.EndCommand', '종료')
insert into menu values ('com.naver.SelectByidCommand', '입력(test)')

delete from menu where name='입력'
select * from menu
-------- 
현재 계정 생성 테이블 조회
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
- 테이블명 정하기
- 새로운 컬럼 추가할 것인지?
 - member_email
 - member_date

-기능
insert
- 회원번호 자동생성: 회원번호 입력하지 않고 추가
- 회원생일 입력하지 않아도 회원추가

select
- 전체조회
- 아이디조회
- 회원번호 조회

- 회원가입 날짜 조회
 - 특정일 검색 조회
 - 몇년도 몇월 ~ 몇월 까지 가입, 회원 조회
- 나이로 조회(20세 회원 조회, 6월생 조회 등)

update
(select 받아서 수정)
- 아이디조회 -> 수정
- 회원번호 조회 -> 수정
- 나이로 조회 -> 수정
- 특정 컬럼 조회 수정

delete
(select 받아서 삭제)
- 아이디조회 삭제
- 회원번호 조회 삭제
- 나이로 조회 선택 삭제
- 특정 날짜에 가입한 회원 삭제