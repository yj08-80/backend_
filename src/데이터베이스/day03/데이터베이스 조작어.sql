# 데이터베이스 조작어
# 1. 데이터베이스 생성
drop database if exists mydb0716;
create database mydb0716;
use mydb0716;

# 2. 테이블 생성
create table test(
	mno int auto_increment, -- 속성명 타입 제약조건
    mname varchar(30) not null unique, -- 속성명 타입 제약조건1 제약조건2
    mcount int default 2, -- 속성명 타입 제약조건
    constraint primary key( mno ) -- 식별키 설정, 만약에 속성명 뒤에 ,(쉼표) 생략
);

# DML : 데이터베이스 조작어
# 1. insert 2.select 3.update 4.delete
# [ C : 저장 ] [ R : 조회 ] [ U : 수정 ] [ D : 삭제 ]

# [1] INSERT : 레코드 삽입, 레코드란? 테이블내 행(가로)단위의 데이터들, 1레코드 vs 1행 vs 1줄
# 주의할점 : 테이블내 데이터 삽입시 레코드 단위, 한 칸 한 칸에 데이터 삽입이 아닌 줄/행/레코드 단위로 삽입
# (1) insert into 테이블명( 속성명1 , 속성명2 ) values( 값1 , 값2 );
insert into test( mno , mname , mcount ) values( 1 , "유재석" , 30 );
# 작성한 속성명에 대응하는 값 삽입한다.
insert into test( mcount , mno , mname ) values( 40 , 2 , "강호동" );
select * from test; -- 확인차 조회

#(2) auto_increment 제약조건의 속성은 값 생략할 경우 자동번호(1씩증가된) 할당
insert into test( mcount , mname ) values( 50 , "신동엽" );

# (3) default 제약조건의 속성은 값 생략할 경우 정의된 기본값이 할당
insert into test( mname ) value( "서장훈" );
select * from test; -- 확인차 조회

# (4) not null 제약조건의 속성은 값이 꼭 삽입되어야 한다.
-- 오류 : insert into test( mno , mcount ) value( 5 , 40 );

# (5) unique 제약조건의 속성은 중복값일 경우 삽입 불가능
-- 오류 : insert into test( mname ) values( "유재석" )

# (6) 모든 속섬영을 순서대로 작성할 경우는 속성명 생략 가능하다
insert into test values( 5 , "하하" , 10 );
# (7) 하나의 insert에서 여러개 레코드 삽입할 경우, values() , () , ();
insert into test values( 6 , "박명수" , 50 ) , ( 7 , "박명수2" , 60 );

# [2] SELECT : 레코드 조회
# 주의할 점 : 조회 결과는 기존 테이블과 상관없다, select만 result table 존재, 조회 결과는 항상 테이블/표
# (1) select * from 테이블명 : 전체 속성(*)의 레코드 조회 
select * from test;
# (2) select 속성명1 , 속성명2 from 테이블명 : 특정 속성의 모든 레코드 조회
select mname from test;
# (3) select 속성명 from 테이블명 where 조건절;
# 'test'테이블에서 'mane' 속성값이 '유재석'과 같은 레코드를 조회
select * from test where mname = "유재석"; # =(대입이 아닌 같다라는 뜻)
select * from test where mno = 3; # 'mno' 속성 값이 3과 같은 레코드 조회

# [3] UPDATE : 레코드 수정
# mysql workbench에서는 수정/삭제를 safe mode이므로 불가능
# safeMode 해제 : set SQL_SAFE_UPDATES = 0; safeMode 0은 끄기 1은 켜기
set SQL_SAFE_UPDATES = 0;
# (1) update 테이블명 set 속성명 = 새로운값; : 전체 레코드의 속성값 수정
update test set mcount = 0;
# (2) update 테이블명 set 속성명 = 새로운값 where 조건절; : 조건에 충족하는 레코드의 속성값 수정
update test set mcount = 10 where mname = "유재석";
# (3) update 테이블명 set 속성명1 = 값1 , 속성명2 = 값2 where 조건절; : 다수의 속성값 수정
update test set mcount = 20, mname = "강호동2" where mno = 2;
select * from test; -- 확인차 조회

# [4] DELETE : 레코드 삭제
# (1) delete from 테이블명 where 조건절 : 조건에 충족하는 레코드 삭제
delete from test where mno = 2;
# (2) delete from 테이블명;



