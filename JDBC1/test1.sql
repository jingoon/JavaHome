CREATE TABLE test(
name VARCHAR2(3),
age NUMBER(3)
)

test ���̺� ���� ������ �Է��ϼ���.
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

test ���̺���
��� ���ڵ���
��� �÷�����
��ȸ�Ͻÿ�.
SELECT * FROM test




test ���̺���
��� ���ڵ���
name �÷�����
��ȸ�Ͻÿ�.
SELECT name FROM test


test ���̺���
��� ���ڵ���
age �÷�����
��ȸ�Ͻÿ�.

SELECT age FROM test


alias
�÷��� ���� �ֱ�
SELECT name as �̸�, age as ���� FROM test

SELECT name �̸�, age ���� FROM test

SELECT name as �̸�, age ���� FROM test



test ���̺� ��ϵ� �� ���� ��� ����Ͻÿ�.
SELECT DISTINCT name FROM test



java collection framework....
sort....
db

SELECT * FROM test ORDER BY age ASC

SELECT * FROM test ORDER BY age DESC

test ���̺��� 
��� ���ڵ带
��� �÷��� ���Եǰ� 
��ȸ�ϵ�
�̸��� �������� ������������
�����Ͻÿ�.

SELECT * FROM test ORDER BY name DESC

test ���̺��� 
��� ���ڵ带
��� �÷��� ���Եǰ� ��ȸ�ϵ�
�̸��� �������� ������������ �����Ͻÿ�.
���� �̸��� ������ ���̰� ���� ����� �켱�� �ǵ��� �����Ͻÿ�.


SELECT * FROM test ORDER BY name DESC, AGE DESC

SELECT * FROM test WHERE name = 'kim'

SELECT * FROM test WHERE name != 'kim'

INSERT INTO test (age) VALUES (55)
INSERT INTO test (name) VALUES ('pyo')
COMMIT

name�� NULL�� ���ڵ� ������ ��ȸ�Ͻÿ�. 
��, �÷��� NAME�� ����.
SELECT name as �̸�, age ���� FROM test WHERE name IS NULL


name�� NULL�� �ƴ� ���ڵ� ������ ��ȸ�Ͻÿ�.
��, ���ڵ忡 ���� ������ AGE�� �����ǰ� �����ϰ�, 
���� AGE�� ������ name�� ������������ �����Ͻÿ�.

SELECT * FROM test WHERE name IS NOT NULL ORDER BY age ASC, name DESC



test ���̺���
age�� 55�� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age = 55



test ���̺���
age�� 55�� �ƴ� ���ڵ带 ��ȸ�Ͻÿ�.
SELECT * FROM test WHERE age != 55




test ���̺���
age�� NULL�� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age IS NULL

test ���̺���
age�� NULL�� �ƴ� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age IS NOT NULL



test ���̺���
age�� 33���� ū ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age > 33

test ���̺���
age�� 33���� ũ�ų� ���� ���ڵ带 ��ȸ�Ͻÿ�.
SELECT * FROM test WHERE age >= 33

test ���̺���
age�� 20�̰ų� 23�̰ų� 40�� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age = 20 OR age = 23 OR age = 40


test ���̺���
age�� 20�̰ų� 23�̰ų� 40�̰ų� 43�̰ų� 61�̰ų� 77�� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHRE age in(20, 23, 40, 43, 61, 77)

test ���̺���
age�� 20�̰ų� 23�̰ų� 40�̰ų� 43�̰ų� 61�̰ų� 77�� ���ڵ尡 �ƴ� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE age NOT IN(20, 23, 40, 43, 61, 77)


SELECT * FROM test

name kim�̰� age 33�� ���ڵ带 ��ȸ�Ͻÿ�.

SELECT * FROM test WHERE name = 'kim' and age = 33


test ���̺���
age�� 25���� ũ�� age�� 47���� ���� ���ڵ带 ��ȸ�Ͻÿ�.
25 < age < 47

SELECT * FROM test WHERE age > 25 AND age < 47 


test ���̺���
age�� 25���� ũ�ų� ���� age�� 47���� �۰ų� ���� ���ڵ带 ��ȸ�Ͻÿ�.
25 <= age <= 47

SELECT * FROM test WHERE age >= 25 AND age <=47


SELECT * FROM test WHERE age BETWEEN 25 AND 47


�𸣴� �� ���ڸ� ǥ���� ��  _
SELECT * FROM test WHERE name LIKE 'k__' 
SELECT * FROM test WHERE name LIKE '_e___'
SELECT * FROM test WHERE name LIKE '_e_'


�𸣴� ���� ���ڸ� ǥ���� ��   %
SELECT * FROM test WHERE name LIKE '%o'
SELECT * FROM test WHERE name LIKE '%��%'
SELECT * FROM test WHERE name LIKE '%l%'



table: ���ڵ�, alter...


���̺�� ��ſ� SELECT�� �ֱ�...

SELECT * FROM (SELECT * FROM test WHERE age > 20) WHERE name like '%k%'

rownum�� 2~4


SELECT * FROM
(SELECT rownum rnum, name, age FROM test)
WHERE rnum BETWEEN 2 AND 4



�� SELECT���� ORDER BY(����) ������ ����, 
������ SELECT���� �̿��Ͽ� ROWNUM �÷��� �־���� ��.

SELECT * FROM (
SELECT rownum rnum, name, age FROM 
(SELECT name, age FROM test ORDER BY age asc)
) WHERE rnum BETWEEN 2 AND 4



===============11��24��================================


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

DB�� �����͸� ������ ���¿���
�÷� �ϳ����� �̿��ؼ�
Ư�� ���ڵ� �ϳ����� ��ȸ�ϰ� �;�.

�� ������ �� �� ��° ���ڵ常�� ��ȸ�� �� �ִ°�?
�Ұ���.

�����ϰ� �ϴ� �����?
--> �⺻Ű = ��Ű = primary key = pk ����

�켱 ������ �Է��� ������ ��� ����
DELETE FROM member2
COMMIT

id�� member2���̺��� �⺻Ű(=��Ű=primary key=pk)�� ����

ALTER TABLE member2 ADD CONSTRAINT pk_member2_id PRIMARY KEY(id)

INSERT INTO member2 VALUES ('m001', 'kim', 30) --�Է� ����
INSERT INTO member2 VALUES ('m001', 'kim', 30) --�Է� ����
�⺻Ű�� �����ϸ�, 
�⺻Ű�� ���� �ߺ��� ������� �ʴ´�.
�̸� unique constraint (����ũ ���� ����)�̶�� �θ���, �ڵ����� �߰��ȴ�.
����ũ�� ���Ϲ���(���� �� �ϳ����̶�� �ǹ���. �ֹι�ȣ, ��ȭ��ȣ, �̸����ּ� ���)


INSERT INTO member2 (name, age) VALUES ('lee', 44) --�Է� ����
�⺻Ű�� �����ϸ�
�⺻Ű�� ���� NOT NULL ���������� �ڵ����� �߰��ȴ�.




INSERT INTO member2 VALUES ('m001', 'kim', 30)
INSERT INTO member2 VALUES ('m002', 'kim', 30)
INSERT INTO member2 VALUES ('m003', 'kim', 30)
INSERT INTO member2 VALUES ('m004', 'kim', 30)
INSERT INTO member2 VALUES ('m005', 'kim', 30)
INSERT INTO member2 VALUES ('m006', 'kim', 30)
INSERT INTO member2 VALUES ('m007', 'kim', 30)

INSERT INTO member2 (id, name, age) VALUES ('m008', 'lee', 44)

COMMIT

member2�� Ư�� ���ڵ带 �÷�(�⺻Ű) �ϳ��θ� ��ȸ�غ���.
SELECT * FROM member2 WHERE id = 'm004'


member ���̺��� ���� Ȯ��
SELECT * FROM member



meber���̺��� mid�÷��� ��Ű(=�⺻Ű=pk=primary key)�� �����Ͻÿ�.
ALTER TABLE member ADD CONSTRAINT pk_member_mid PRIMARY KEY(mid)


�⺻Ű(=��Ű=primary key = pk)�� �����ϴ� �� ���� ���

CREATE TABLE test2(
id VARCHAR2(6) PRIMARY KEY,
age NUMBER(3)
)


CREATE TABLE test3(
id VARCHAR2(6),
age NUMBER(3),
CONSTRAINT pk_test3_id PRIMARY KEY(id)
)

ó�� ����� ����� �˰� ������, 
������ �� ���� ����� �����ϰ� ������ �� ����.

========================================
�ܷ�Ű = foreign key = fk

����� �����ϴ� ������ ���� �߿����� ���ÿ�.
1. ����
2. ������
3. �����
4. ��ġ�

���� ����...
1~4�߿����� �����϶�� �ߴµ�, ���ڸ� �����ϴٴ�...
�̷� �� ���� ����.



CREATE TABLE depart(
edep VARCHAR2(9)
)

�ܷ�Ű(=foreign key=fk)�� �Ƿ���, �ݵ�� �θ� ���̺��� �⺻Ű(=��Ű=primary key= pk)�̾�� ��.
ALTER TABLE depart ADD CONSTRAINT pk_depart_edep PRIMARY KEY(edep)

INSERT INTO depart VALUES ('�λ��')
INSERT INTO depart VALUES ('ȫ����')
INSERT INTO depart VALUES ('������')
INSERT INTO depart VALUES ('������')
COMMIT


�ǰ���� ���̺�
CREATE TABLE employee(
eid VARCHAR2(6),
ename VARCHAR2(6), 
edep VARCHAR2(9)
)

eid�� pk�� �����Ͻÿ�.
ALTER TABLE employee ADD CONSTRAINT pk_employee_eid PRIMARY KEY(eid)

ALTER TABLE employee ADD CONSTRAINT fk_employee_edep FOREIGN KEY(edep)
REFERENCES depart(edep)

//edep���� �λ��/ȫ����/������/�����θ� �� �� ����.
INSERT INTO employee (eid, ename, edep) VALUES ('e001', 'kim', '�λ��')
INSERT INTO employee (eid, ename, edep) VALUES ('e002', 'lee', 'ȫ����')
INSERT INTO employee (eid, ename, edep) VALUES ('e003', 'park', '������')
INSERT INTO employee (eid, ename, edep) VALUES ('e004', 'choi', '������')

�ؿ��� �Է��� �� ��. �θ����̺��� �����Ϳ� '�񼭽�'�� ����. �������Ἲ �������ǿ� ���ݵ�.
INSERT INTO employee (eid, ename, edep) VALUES ('e005', 'jung', '�񼭽�')

INSERT INTO employee (eid, ename) VALUES ('e006', 'kim')

COMMIT

SELECT * FROM employee






SELECT * FROM MEMBER


































