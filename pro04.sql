create table member(id varchar2(20) primary key, pw varchar2(200) not null, 
name varchar2(20) not null, addr varchar2(200), tel varchar2(20) not null, 
regdate date default sysdate, pt number);

drop table member;

select * from member;

select * from board;

create table board(seq number primary key, title varchar2(150) not null, content varchar2(1000) not null, nickname varchar2(100), regdate date default sysdate, visited number default 0);

insert into board values (1, '���� �� ����', '���� �� ����', 'admin', sysdate, 0);
insert into board values ((select nvl(max(seq), 0)+1 from board), '���� �� ����2', '���� �� ����', 'admin', sysdate, 0);
insert into board values ((select nvl(max(seq), 0)+1 from board), '���� �� ����3', '���� �� ����', 'admin', sysdate, 0);

commit;
