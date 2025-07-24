
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
    -- 선언된 'num_fk' 속성을 fk(참조키) 설정( table1테이블의 num_pk 참조 )
    constraint foreign key( num_fk ) references table1( num_pk ) 
    on update cascade -- 만약에 table1의 'num_pk' 값이 수정되면 'num_fk' 값도 같이 수정
	on delete cascade -- 만약에 table1의 'num_pk' 값이 삭제되면 'num_fk' 값도 같이 삭제
    /* 참조 옵션 : constraint foreing key( fk필드 ) references 테이블명( pk필드 ) 옵션
		1. on delete cascade : 참조중인 pk 레코드가 삭제되면 같이 fk레코드도 같이 삭제한다.
        2. on update cascade : 참조중인 pk 레코드의 pk값이 변경되면 fk 값도 같이 변경된다.
        3. on delete set null : 참조중인 pk 레코드가 삭제되면 fk 값은 null로 변경한다.
        4. on update set null : 참조중인 pk 레코드의 pk값이 변경되면 fk 값은 null로 변경한다.
        5. on delete restrict : ( 기본값/생략 ) pk가 참조중인 pk레코드는 삭제 불가능 설정한다
        6. on update restrict : ( 기본값/생략 ) pk가 참조중인 pk레코드는 수정 불가능 설정한다
			* 단 retrict 에서 pk값을 참조하는 fk값이 존재하지 않으면 가능
    */
);	
# foreign key : 참조키, 중복 가능, NULL 가능, 참조값, 댓글이위치한게시물번호, 게시물작성자번호
# 실생활 : 우리집 주소 pk, 쿠팡/마켓/카카오쇼핑
    
# 왜? PK와 FK 참조(관계)형 테이블 = 관계형 데이터베이스
# 3. 서로 다른 테이블 합치기 = JOIN
# 샘플 데이터
insert into table1 values(1), (2), (3), (4), (5);
insert into table2 values(1,1) , (2,2) , (3,1) , (4,1) , (5,2);
    
select * from table1;
select * from table2;
# (1) 두 개 이상의 테이블 조회하기 : select * from 테이블명A,테이블명B;
# 주의할점 : 두 테이블간의 데카르트 곱으로 표현된다. 테이블명A(5개) 테이블(5개) 5*5 -> 25
select * from table1,table2;
    
# (2) 교집합 : 두 테이블간의 공통된 값 기준으로 레코드 조회
# 2-1) where절, 일반적으로 join과 조건절 구분이 어렵기 때문에 실무 사용 불가능
select * from table1, table2 where table1.num_pk = table2.num_fk;
# 2-2) inner join on절, 테이블A inner join 테이블B on 테이블A.PK속성명 = 테이블B.FK속성명
select * from table1 inner join table2 on table1.num_pk = table2.num_fk;
# where 일반조건, having 그룹조건, on 집합조건

# 2-3) inner 생략 가능
select * from table1 join table2 on table1.num_pk = table2.num_fk;
select * from table1 as t1 inner join table2 t2 on t1.num_pk = t2.num_fk;
select * from table1 t1 inner join table2 t2 on t1.num_k = t2.num_fk;
    
# 아래 키워드 전제조건 : pk 속성명과 fk속성명이 일치할 때만 가능
# 2-4) natural join : 자연조인, 조인 의도와 다르게 동일한 속성명이 존재할 수도 있으므로 비권장
select * from table1 natural join table2;
    
# 2-5) join using : 현재 두 테이블간의 동일한 pk-fk 속성명이 아니므로 불가능*
select * from table1 join table2 using( num_pk );
    
# OUTER JOIN
# 3-1) 왼쪽 테이블( table1 ) 에 있는 모든 레코드와 오른쪽 테이블( table2 )에 교집합 되는 레코드 조회
# 왼쪽 테이블의 레코드 전체 조회 + 오른쪽 테이블과 교집합 레코드 값 표현 되고 없으면 null
select * from table1 t1 left outer join table2 t2 on t1.num_pk = t2.num_fk;
# 3-2) 오른쪽 테이블( table2 )에 있는 모든 레코드와 왼쪽 테이블( table2 )에 교집합 되는 레코드 조회, 없으면 null
select * from table1 t1 right outer join table2 t2 on t1.num_pk = t2.num_fk;
# 3-3) outer 생략가능
select * from table1 t1 left outer join table2 t2 on t1.num_pk = t2.num_fk;
    
# (4) 합집합, MYSQL : union / ORACLE : full outer join
# 4-1) UNION : 2개 이상의 select를 하나로 합치기, left outer + (union) + right outer
select * from table1 t1 left join table2 t2 on t1.num_pk = t2.num_fk union
select * from table1 t1 right join table2 t2 on t1.num_pk = t2.num_fk;
    
    
# (5) 차집합 : left outer join에서 교집합( 공통pk-fk ) 제외한
# 5-1) 왼쪽 테이블( table1 ) 의 차집합 ( 교집합 외 나머지 레코드 )
select * from table1 t1 left join table2 t2 on t1.num_pk where t2.num_fk is null;
# 5-2) 오른쪽 테이블( table2 ) 의 차집합 ( 교집합 외 나머지 레코드 )
select * from table1 t1 right join tabel2 t2 on t1.num_pk where t2.num_fk is null;\
    
    
/*

교집합 : 두 테이블간의 PK와 FK값이 동일한 레코드를 하나의 테이블로 조회
	1. where
    2. inner join on
    3. join on
    4. natural join
    5. join using
차집합 : 두 테이블간의 하나의 테이블A 레코드를 하나의 테이블B의 레코드 조회
	select 테이블A.* from 테이블A left outer join 테이블B on 테이블A.PK = 테이블B.FK where 테이블B is null;
합집합 : 두 테이블간의 모든 레코드를 하나의 테이블로 조회
	ORACLE : full outer join
    MYSQL : left outer join *union* right outer join
*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    