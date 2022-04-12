drop table member;

create table member(

id 	varchar(20) not null,
pw  varchar(20) not null,
name varchar(20) default null,
email varchar(20) default null,

primary key (id)

);

select * from member;

DROP TABLE bbs;
DROP SEQUENCE bbs_seq;



CREATE SEQUENCE bbs_seq
INCREMENT BY 1
START WITH 1
MINVALUE 1
MAXVALUE 10000
NOCYCLE;

CREATE TABLE bbs(
	bno NUMBER(10,0) not null,
	title VARCHAR(200),
	content VARCHAR(1000),
	writer VARCHAR(100),
	regdate DATE DEFAULT SYSDATE,
	hit number(10,0),
	category varchar(100),

	PRIMARY KEY(BNO)
);

select * from bbs;
select * from bbs_seq;

