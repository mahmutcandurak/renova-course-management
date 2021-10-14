CREATE SEQUENCE STUDENT_ID_SEQ INCREMENT 1 START 1 CACHE 1;

CREATE TABLE COURSE
(
ID 	BIGINT							 NOT NULL 			PRIMARY KEY, 
	TITLE CHARACTER VARYING(128)	 NOT NULL,
	STUDENT_ID BIGINT				 NOT NULL
);

CREATE TABLE STUDENT
(
ID BIGINT 										NOT NULL 			 		DEFAULT NEXTVAL ('STUDENT_ID_SEQ'),
	NAME CHARACTER VARYING(25)					NOT NULL, 
	SURNAME CHARACTER VARYING(25)				NOT NULL,
	EMAIL CHARACTER VARYING(25)					NOT NULL,
	STUDENT_DETAIL_ID CHARACTER VARYING(25)		NOT NULL
);

CREATE TABLE STUDENT_DETAIL
(
ID BIGINT NOT NULL PRIMARY KEY,
	FACULTY CHARACTER VARYING(50),
	HOBBY CHARACTER VARYING(50)
);

INSERT INTO COURSE(id, title, student_id) VALUES (1,'Gituar',1);
INSERT INTO COURSE(id, title, student_id) VALUES (2,'Ardunio',2);
INSERT INTO COURSE(id, title, student_id) VALUES (3,'English',2);
INSERT INTO COURSE(id, title, student_id) VALUES (4,'Java Programming',3);


INSERT INTO STUDENT(id, name, surname, email,student_detail_id) VALUES (1,'Mahmut Can','Durak','mahmutdurak69@gmail.com',1);
INSERT INTO STUDENT(id, name, surname, email,student_detail_id) VALUES (2,'Salih','Özel','ozelsalih@gmail.com',2);
INSERT INTO STUDENT(id, name, surname, email,student_detail_id) VALUES (3,'Ayberk','Orhan','ayberkulas@icluad.com',3);

INSERT INTO STUDENT_DETAIL(id, faculty, hobby) VALUES (1,'Engineering','Football');
INSERT INTO STUDENT_DETAIL(id, faculty, hobby) VALUES (2,'Engineering','Video Games');
INSERT INTO STUDENT_DETAIL(id, faculty, hobby) VALUES (3,'Engineering','Billiards');


