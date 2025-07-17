drop database if exists mydb0717;
create database mydb071member7;
use mydb0717;

# 1. 회원테이블
create table member(            # 아이돌 그룹
   mid char(8) not null ,         # 식별키       최대 8자리
    mname varchar(10) not null ,   # 그룹명      최대 10자리
    mnumber int not null ,         # 인원수      정수 +-21억정도
    maddr char(2) not null ,       # 지역      최대 2자리
    mphone1 char(3) ,            # 지역번호   최대 2자리
    mphone2 char(8) ,            # 전화번호    최대 8자리
    mheight smallint ,            # 평균키       정수 +-3만정도
   mdebut date ,               # 데뷔일       yyyy-mm-dd
    constraint primary key ( mid )            # 제약조건
);
# 2. 구매테이블
create table buy(
   bnum int auto_increment ,          # 구매번호   정수    자동번호 부여
    mid char(8),                  # 구매자      FK
    bpname char(6) not null ,         # 제품명      최대 6자리
    bgname char(4) ,                # 분류명       최대   4자리
    bprice int not null ,            # 가격       정수
    bamount smallint not null ,         # 구매수량   정수
    constraint primary key(bnum) ,               # 제약조건
    constraint foreign key ( mid ) references member(mid) # 제약조건
);

# 샘플데이터
INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남', '055', '22222222', 163, '2016.08.08');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기', '031', '33333333', 166, '2015.01.15');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울', NULL, NULL, 160, '2015.04.21');
INSERT INTO member VALUES('GRL', '소녀시대', 8, '서울', '02', '44444444', 168, '2007.08.02');
INSERT INTO member VALUES('ITZ', '잇지', 5, '경남', NULL, NULL, 167, '2019.02.12');
INSERT INTO member VALUES('RED', '레드벨벳', 4, '경북', '054', '55555555', 161, '2014.08.01');
INSERT INTO member VALUES('APN', '에이핑크', 6, '경기', '031', '77777777', 164, '2011.02.10');
INSERT INTO member VALUES('SPC', '우주소녀', 13, '서울', '02', '88888888', 162, '2016.02.25');
INSERT INTO member VALUES('MMU', '마마무', 4, '전남', '061', '99999999', 165, '2014.06.19');
INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
INSERT INTO buy VALUES(NULL, 'BLK', '맥북프로', '디지털', 1000, 1);
INSERT INTO buy VALUES(NULL, 'APN', '아이폰', '디지털', 200, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '아이폰', '디지털', 200, 5);
INSERT INTO buy VALUES(NULL, 'BLK', '청바지', '패션', 50, 3);
INSERT INTO buy VALUES(NULL, 'MMU', '에어팟', '디지털', 80, 10);
INSERT INTO buy VALUES(NULL, 'GRL', '혼공SQL', '서적', 15, 5);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 2);
INSERT INTO buy VALUES(NULL, 'APN', '청바지', '패션', 50, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 1);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 4);


# 샘플 확인 
select * from member;
select * from buy;


#[1] as 별칭, 조회 결과의 속성명 변경( 단 원본의 속성명과 상관없다 ), 복잡한 조회에서 속성명 단순화
select mid from member;
select mid as 회원아이디 from member;
select mid as 회원아이디, mname 회원명 from member; -- as는 생략하고 띄어쓰기로 구분 가능
select mid 회원아이디 from memeber as m; -- member 테이블명을 'm'으로 별칭

# [2] distinct, 속성값이 중복인 레코드를 제거
select maddr as 주소 from member; -- 조회 결과 속성 값들의 중복이 존재 
select distinct maddr as 주소 from member; -- 중복이 제거 

# [3] 산술연산자, +더하기, -빼기, *곱하기, /나누기
select mnumber + 3 as 더하기 , mnumber - 3 as 빼기, mnumber * 3 as 곱하기,
mnumber / 3 as 나누기, mnumber div 3 as 몫, mnumber mod 3 as 나머지 from member;

# [4] 비교연산자 : > 초과 < 미만 >= 이상 <= 이하 = 같다
select * from member where mname = "블랙핑크"; -- member 테이블의 mname속성의 값이 "블랙핑크"와 같으면 
select * from member where mnumber = 4; -- member 테이블의 mname속성의 값이 4이면 
select * from member where mname != "블랙핑크"; -- member 테이블의 mname속성의 값이 "블랙핑크"가 아니면
select * from member where not mname = "블랙핑크"; -- member 테이블의 mname속성의 값이 "블랙핑크"와 같지 않으면
select * from member where mheight <= 162; -- member 테이블의 mheight 속성의 값이 162 이하인
select * from member where mheight <= 162 and mheight <= 170; -- mheight 속성의 값이 165이상이면서 170이하
select * from member where maddr = "경기" or maddr = "전남" or maddr = "경남"; -- 조건1 or 조건2 or 조건3
select * from membemembersr where maddr in( "경기","전남","경남" );
# 논리연산자 : not 부정, and 이면서
# 기타연산자 : 속성명 between 시작값 and 끝값; , 속성명 in ( 값1, 값2, 값3 );

select * from member where mphone1 = ""; -- 속성값이 비어있는 표현, "" 빈칸 대신에 null 사용한다
select * from member where mphone1 = null; -- 속성값이 null이면 [불가능]
select * from member where mphone1 is null; -- 속성값이 null면 [가능]
select * from member where mphone1 is not null; -- 속성값이 null이 아니면
# null 연산자 : 속성명 is null, 속성명 is not null
select * from member where mname like "에이%"; -- 속성의 값이 '에이'로 시작하는 , 에이x, 에이xx, 에이xxx
select * from member where mname like "에이_"; -- 속성의 값이 '에이'로 시작하는 세글자 , 에이x
select * from member where mname like "%핑크"; -- 속성의 값이 '핑크'로 끝나는, x핑크, xx핑크, xxx핑크
select * from member where mname like "%이%"; -- 속성의 값에 두 번재 글자가 '이'인 세글자
# 문자패턴 : 속성명 like "문자패턴", %:문자대응(개수상관), :문자대응(_수만큼)

# [5] order by 속성명 src/desc, 정렬
# 오름차순 : 1 2 3 4, a b c, ㄱ ㄴ ㄷ, 25-07-15 25-07-16 25-07-17
select * from member order by mdebut asc;
select * from member order by mdebut ; -- asc/desc 생략시 자동으로 asc(기본)
# 주의할 점 : 2개 이상의 정렬은 ,(쉼포) 구분하되, 1차정렬에서 중복값이 있을 경우 중복값끼리 2차 정렬
# (1차) 먼저 주소( maddr ) 내림차순으로 정렬 후 (2차) 주소가 동일한 데이터끼리 mdebut(날짜) 오름차순 정렬
select * from member order by maddr desc, mdebut asc;

# [6] limit 레코드수, 조회결과 제한
select * from member limit 2 ; -- 조회 결과에서 상위 2개만 제한
select * from member limit 0 , 2; -- 조회 결과에서 0번 레코드부터 2개 제한
select * from member limit 2 , 3; -- 2번 레코드부터 3개 제한
select * from member order by mheight desc limit 3; -- mheight 속성을 내림차순으로 정렬 후 상위 3개
















