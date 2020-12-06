CREATE TABLE menu(
fullname VARCHAR2(100) PRIMARY KEY
)


INSERT INTO menu VALUES ('com.naver.InsertCommand')
INSERT INTO menu VALUES ('com.naver.SelectCommand')
INSERT INTO menu VALUES ('com.naver.UpdateCommand')
INSERT INTO menu VALUES ('com.naver.DeleteCommand')
INSERT INTO menu VALUES ('com.naver.EndCommand')
INSERT INTO menu VALUES ('com.naver.SelectByIDCommand')
COMMIT

SELECT * FROM menu



















DELETE FROM member
COMMIT

SELECT * FROM member