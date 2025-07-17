drop database if exists mydb0715;
create database mydb0715;
use mydb0715;
create table test1( 필드명 int );
show tables;
# 2개 이상의 속성을 정의할 때 ,(쉼표)로 구분한다.
create table test2( 필드명1 int , 필드명2 double );
drop table test1;
drop table if exists test1;
show tables;

create table test3( # 테이블 정의 시작
	# 속성명 타입, 속성명 타입
    정수필드1 tinyint , 정수필드2 smallint , 정수필드3 mediumint ,
    정수필드4 int , 정수필드5 bigint , 정수필드6 int unsigned ,
    실수필드1 float , 실수필드2 double , 실수필드3 decimal,
    날짜필드1 date , 날짜필드2 time , 날짜필드3 datetime ,
    문자필드1 char(3) , 문자필드2 varchar(3) ,
    문자필드3 text , 문자필드4 longtext ,
    논리필드1 bool
);
show tables;
select * from test3;

# 예) 방문록을 기록하는 테이블 설계

create table board(
	content longtext,
	writer varchar(30)
);
select * from board;

# 예2) 대기번호발급 기록하는 테이블 설계
create table waiting(
	phone char(13), -- 핸드폰 번호, 고정길이 13글자, pirvate String phone
    count int -- 대기인원수 20억, private byte count
);
select * from waiting;

# [7] 제약조건을 이용한 테이블 설계
# 제약조건 목적 : 데이터들간의 문제와 결합이 되는 입력 방지, 해결
create table test4(
	#필드명 타입 제약조건
    필드명1 tinyint not null, -- 지정한 속성에는 null을 대입할 수 없도록 조건 설정
    필드명2 smallint unique, -- 지정한 속성에는 중복값을 저장할 수 없도록 조건 설정
    필드명3 int default 10, -- 지정한 속성에는 값이 생략될 때 자동으로 기본값 10 설정
    필드명4 bigint auto_increment, -- 지정한 속성에는 값이 생략될때 자동으로 순서번호 설정, 1,2,3,4,5,,,
    constraint primary key( 필드명4 ) -- 'pk필드명5' 속성을 PK필드로 설정
);
select * from test4;
# [7]
create table test5(
	필드명1 bigint, -- 지정한 속성 선언
    constraint
		foreign key( 필드명1 )
        references test4( 필드명4 )
    -- test5의 '필드명1'속성을 FK필드로 설정하고 test4의 '필드명4' 속성의 PK를 참조한다\

);

# 예3) 회원제 게시판 데이터베이스 설계하시오.
drop database if exists boardService0715; -- 새로 만들 데이터베이스가 존재하면 삭제
create database boardService0715; -- 데이터베이스 생성
use boardService0715;	-- 데이터베이스 활성화
create table member(
	mno int auto_increment, -- 회원번호는 정수, 자동번호, PK사용할 예정
    mid varchar(30) not null unique, -- 회원아이디 : 문자 최대 30, 공백x, 중복x
    mpwd varchar(30) not null, -- 회원비밀번호 : 문자 최대 30, 공백x
    mname varchar(10) not null, -- 회원닉네임 : 문자 최대 10,  공백x 중복o
    constraint primary key( mno ) -- 위에서 선언된 '회원번호'속성을 PK필드로 설정
);
select * from member; -- 확인차 회원테이블 조회

create table board( -- [2] 게시물 테이블
	bno int auto_increment, -- 게시물번호 : 정수, 자동번호, *PK 사용할 예정*
    btitle varchar(100) not null, -- 게시물제목 : 문자최대100, 공백x
    bcontent longtext, -- 게시물내용 : 4GB 대용량( 사진/긴글 )
    bdate datetime default now(), -- 게시물작성일 : 날짜/시간, 기본값, now() : 현재 날짜/시간 반환해
	bview int default 0, -- 게시물조회수 : 정수, 기본값, 0
    constraint primary key( bno ), -- 위에서 선언된 '게시물번호'속성을 PK필드로 설정
	mno int,  -- 게시물작성자 : FK사용할 예정 -> PK필드 타입과 일치
    constraint foreign key( mno ) references member( mno ) -- mno 둘은 같은 게 아님
);

# 여럿 테이블간의 관계 확인( 다이어그램 )
-- workbench 상단메뉴 -> [ database ]


