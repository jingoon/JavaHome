-------- 
현재 계정 생성 테이블 조회
 SELECT *FROM tab
--------
tableName:

member_num
member_id
member_pw
member_name
member_birth

member_email
member_date

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