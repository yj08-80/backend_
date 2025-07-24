
# 1. 데이터베이스 생성
drop database if exists mydb0724;
create database mydb0724;
use mydb0724;

# 2. 테이블 생성
create table table1( -- table1 테이블 생성
	num_pk int,  -- 'num_pk' 속성/컬럼/필드를 int 타입 선언
    constraint primary key( num_pk ) -- 선언된 'num_pk' 속성을 pk(식별키) 설정
); # primary key : 식별키, 중복 불가능, NULL 불가능, 고유한 값, 게시물번호/회원번호/학번/제품번호

# 2. 테이블 생성
create table table2(
	no_pk int, 
    constraint primary key( no_pk ),
    num_fk int, -- 'num_fk' 속성을 int 타입 선언
    constraint foreign key( num_fk ) references table1( num_pk ) -- 선언된 'num_fk' 속성을 fk(참조키) 설정( table1테이블의 num_pk 참조 )
    # foreign key : 참조키, 중복 가능, NULL 가능, 참조값, 댓글이위치한게시물번호, 게시물작성자번호
    # 실생활 : 우리집 주소 pk, 쿠팡/마켓/카카오쇼핑
);


