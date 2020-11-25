CREATE TABLE test(
name VARCHAR2(3),
age NUMBER(3)
)

test 테이블에 다음 값들을 입력하세요.
kim 20
lee 40
park 50
cho 23

INSERT INTO test (name, age) VALUES ('kim', 20)
INSERT INTO test VALUES ('lee', 40)
INSERT INTO test VALUES ('park', 50)
INSERT INTO test VALUES ('cho', 23)
INSERT INTO test VALUES ('kim', 33)

COMMIT

test 테이블의
모든 레코드의
모든 컬럼값을
조회하시오.
SELECT * FROM test




test 테이블의
모든 레코드의
name 컬럼값을
조회하시오.
SELECT name FROM test


test 테이블의
모든 레코드의
age 컬럼값을
조회하시오.

SELECT age FROM test


alias
컬럼에 별명 넣기
SELECT name as 이름, age as 나이 FROM test

SELECT name 이름, age 나이 FROM test

SELECT name as 이름, age 나이 FROM test



test 테이블에 등록된 성 씨를 모두 출력하시오.
SELECT DISTINCT name FROM test



java collection framework....
sort....
db

SELECT * FROM test ORDER BY age ASC

SELECT * FROM test ORDER BY age DESC

test 테이블의 
모든 레코드를
모든 컬럼이 포함되게 
조회하되
이름을 기준으로 내림차순으로
정렬하시오.

SELECT * FROM test ORDER BY name DESC

test 테이블의 
모든 레코드를
모든 컬럼이 포함되게 조회하되
이름을 기준으로 내림차순으로 정렬하시오.
만약 이름이 같으면 나이가 많은 사람이 우선이 되도록 정렬하시오.


SELECT * FROM test ORDER BY name DESC, AGE DESC

SELECT * FROM test WHERE name = 'kim'

SELECT * FROM test WHERE name != 'kim'

INSERT INTO test (age) VALUES (55)
INSERT INTO test (name) VALUES ('pyo')
COMMIT

name이 NULL인 레코드 정보를 조회하시오. 
단, 컬럼은 NAME만 있음.
SELECT name as 이름, age 나이 FROM test WHERE name IS NULL


name이 NULL이 아닌 레코드 정보를 조회하시오.
단, 레코드에 대한 정렬은 AGE가 증가되게 정렬하고, 
만약 AGE가 같으면 name을 내림차순으로 정렬하시오.

SELECT * FROM test WHERE name IS NOT NULL ORDER BY age ASC, name DESC



test 테이블에서
age가 55인 레코드를 조회하시오.

SELECT * FROM test WHERE age = 55



test 테이블에서
age가 55가 아닌 레코드를 조회하시오.
SELECT * FROM test WHERE age != 55




test 테이블에서
age가 NULL인 레코드를 조회하시오.

SELECT * FROM test WHERE age IS NULL

test 테이블에서
age가 NULL이 아닌 레코드를 조회하시오.

SELECT * FROM test WHERE age IS NOT NULL



test 테이블에서
age가 33보다 큰 레코드를 조회하시오.

SELECT * FROM test WHERE age > 33

test 테이블에서
age가 33보다 크거나 같은 레코드를 조회하시오.
SELECT * FROM test WHERE age >= 33

test 테이블에서
age가 20이거나 23이거나 40인 레코드를 조회하시오.

SELECT * FROM test WHERE age = 20 OR age = 23 OR age = 40


test 테이블에서
age가 20이거나 23이거나 40이거나 43이거나 61이거나 77인 레코드를 조회하시오.

SELECT * FROM test WHRE age in(20, 23, 40, 43, 61, 77)

test 테이블에서
age가 20이거나 23이거나 40이거나 43이거나 61이거나 77인 레코드가 아닌 레코드를 조회하시오.

SELECT * FROM test WHERE age NOT IN(20, 23, 40, 43, 61, 77)


SELECT * FROM test

name kim이고 age 33인 레코드를 조회하시오.

SELECT * FROM test WHERE name = 'kim' and age = 33


test 테이블에서
age가 25보다 크고 age가 47보다 작은 레코드를 조회하시오.
25 < age < 47

SELECT * FROM test WHERE age > 25 AND age < 47 


test 테이블에서
age가 25보다 크거나 같고 age가 47보다 작거나 같은 레코드를 조회하시오.
25 <= age <= 47

SELECT * FROM test WHERE age >= 25 AND age <=47


SELECT * FROM test WHERE age BETWEEN 25 AND 47


모르는 한 글자를 표현할 때  _
SELECT * FROM test WHERE name LIKE 'k__' 
SELECT * FROM test WHERE name LIKE '_e___'
SELECT * FROM test WHERE name LIKE '_e_'


모르는 여러 글자를 표현할 때   %
SELECT * FROM test WHERE name LIKE '%o'
SELECT * FROM test WHERE name LIKE '%초%'
SELECT * FROM test WHERE name LIKE '%l%'



table: 레코드, alter...


테이블명 대신에 SELECT문 넣기...

SELECT * FROM (SELECT * FROM test WHERE age > 20) WHERE name like '%k%'

rownum이 2~4


SELECT * FROM
(SELECT rownum rnum, name, age FROM test)
WHERE rnum BETWEEN 2 AND 4



원 SELECT에서 ORDER BY(정렬) 조건이 들어가면, 
별도의 SELECT문을 이용하여 ROWNUM 컬럼을 넣어줘야 함.

SELECT * FROM (
SELECT rownum rnum, name, age FROM 
(SELECT name, age FROM test ORDER BY age asc)
) WHERE rnum BETWEEN 2 AND 4



===============11월24일================================


CREATE TABLE member2(
id VARCHAR2(6),
name VARCHAR2(6),
age NUMBER(3)
)



INSERT INTO member2 VALUES ('m001', 'kim', 30)
INSERT INTO member2 VALUES ('m001', 'kim', 30)
INSERT INTO member2 VALUES ('m001', 'kim', 30)
INSERT INTO member2 VALUES ('m001', 'kim', 30)
INSERT INTO member2 VALUES ('m001', 'kim', 30)
INSERT INTO member2 VALUES ('m001', 'kim', 30)
INSERT INTO member2 VALUES ('m001', 'kim', 30)
COMMIT

DB에 데이터를 저장한 상태에서
컬럼 하나만을 이용해서
특정 레코드 하나만을 조회하고 싶어.

위 데이터 중 세 번째 레코드만을 조회할 수 있는가?
불가능.

가능하게 하는 방법은?
--> 기본키 = 주키 = primary key = pk 설정

우선 기존에 입력한 데이터 모두 삭제
DELETE FROM member2
COMMIT

id를 member2테이블의 기본키(=주키=primary key=pk)로 설정

ALTER TABLE member2 ADD CONSTRAINT pk_member2_id PRIMARY KEY(id)

INSERT INTO member2 VALUES ('m001', 'kim', 30) --입력 성공
INSERT INTO member2 VALUES ('m001', 'kim', 30) --입력 실패
기본키를 설정하면, 
기본키에 대한 중복을 허용하지 않는다.
이를 unique constraint (유니크 제약 조건)이라고 부르며, 자동으로 추가된다.
유니크는 유일무이(세상에 단 하나뿐이라는 의미임. 주민번호, 전화번호, 이메일주소 등등)


INSERT INTO member2 (name, age) VALUES ('lee', 44) --입력 실패
기본키를 설정하면
기본키에 대해 NOT NULL 제약조건이 자동으로 추가된다.




INSERT INTO member2 VALUES ('m001', 'kim', 30)
INSERT INTO member2 VALUES ('m002', 'kim', 30)
INSERT INTO member2 VALUES ('m003', 'kim', 30)
INSERT INTO member2 VALUES ('m004', 'kim', 30)
INSERT INTO member2 VALUES ('m005', 'kim', 30)
INSERT INTO member2 VALUES ('m006', 'kim', 30)
INSERT INTO member2 VALUES ('m007', 'kim', 30)

INSERT INTO member2 (id, name, age) VALUES ('m008', 'lee', 44)

COMMIT

member2의 특정 레코드를 컬럼(기본키) 하나로만 조회해보자.
SELECT * FROM member2 WHERE id = 'm004'


member 테이블의 구조 확인
SELECT * FROM member



meber테이블의 mid컬럼을 주키(=기본키=pk=primary key)로 설정하시오.
ALTER TABLE member ADD CONSTRAINT pk_member_mid PRIMARY KEY(mid)


기본키(=주키=primary key = pk)를 설정하는 두 가지 방법

CREATE TABLE test2(
id VARCHAR2(6) PRIMARY KEY,
age NUMBER(3)
)


CREATE TABLE test3(
id VARCHAR2(6),
age NUMBER(3),
CONSTRAINT pk_test3_id PRIMARY KEY(id)
)

처음 배웠던 방법만 알고 있으면, 
나머지 두 가지 방법도 무난하게 적용할 수 있음.

========================================
외래키 = foreign key = fk

당신이 좋아하는 음식을 다음 중에서만 고르시오.
1. 갈비
2. 떡볶이
3. 된장찌개
4. 김치찌개

나는 피자...
1~4중에서만 선택하라고 했는데, 피자를 선택하다니...
이런 일 없게 하자.



CREATE TABLE depart(
edep VARCHAR2(9)
)

외래키(=foreign key=fk)가 되려면, 반드시 부모 테이블의 기본키(=주키=primary key= pk)이어야 함.
ALTER TABLE depart ADD CONSTRAINT pk_depart_edep PRIMARY KEY(edep)

INSERT INTO depart VALUES ('인사부')
INSERT INTO depart VALUES ('홍보부')
INSERT INTO depart VALUES ('연구실')
INSERT INTO depart VALUES ('영업부')
COMMIT


피고용자 테이블
CREATE TABLE employee(
eid VARCHAR2(6),
ename VARCHAR2(6), 
edep VARCHAR2(9)
)

eid를 pk로 설정하시오.
ALTER TABLE employee ADD CONSTRAINT pk_employee_eid PRIMARY KEY(eid)

ALTER TABLE employee ADD CONSTRAINT fk_employee_edep FOREIGN KEY(edep)
REFERENCES depart(edep)

//edep에는 인사부/홍보부/연구실/영업부만 들어갈 수 있음.
INSERT INTO employee (eid, ename, edep) VALUES ('e001', 'kim', '인사부')
INSERT INTO employee (eid, ename, edep) VALUES ('e002', 'lee', '홍보부')
INSERT INTO employee (eid, ename, edep) VALUES ('e003', 'park', '연구실')
INSERT INTO employee (eid, ename, edep) VALUES ('e004', 'choi', '영업부')

밑에는 입력이 안 됨. 부모테이블의 데이터에 '비서실'이 없음. 참조무결성 제약조건에 위반됨.
INSERT INTO employee (eid, ename, edep) VALUES ('e005', 'jung', '비서실')

INSERT INTO employee (eid, ename) VALUES ('e006', 'kim')

COMMIT

SELECT * FROM employee






SELECT * FROM MEMBER


































