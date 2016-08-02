create table member(
	id varchar2(20) primary key,
	pw varchar2(20),
	name varchar2(20),
	birth varchar2(11),
	gender varchar2(1),
	phone varchar2(15),
	address varchar2(100),
	region varchar2(30),
	job varchar2(10),
	licence_num varchar2(20),
	licence_val varchar2(5),
	licence_local varchar2(3),
	licence_end varchar2(11),
	licence_start varchar2(11)
	
	
);
insert into member(id,pw,name,birth,gender,phone,address,region,job,licence_num,licence_val,licence_local,licence_end,licence_start)
				values
				('socar','1','김동혁','910820','m','010-4122-2361','서울시용산구청파동2가55번지','서울','학생','16-10-621726-88','1종대형','충남','2023-12-31','2015-03-30'); 

alter table member modify licence_local varchar2(6);
select * from member;

