create table member(id varchar2(20) primary key, pw varchar2(200) not null, 
name varchar2(20) not null, addr varchar2(200), tel varchar2(20) not null, 
regdate date default sysdate, pt number);

drop table member;

select * from member;