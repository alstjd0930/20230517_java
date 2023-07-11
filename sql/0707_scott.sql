SELECT *
FROM emp
;
SELECT *
FROM DEPT
;

SELECT *
FROM salgrade
;


select empno, ename, sal --3. 무슨 열 추출
from emp    --1. 무슨 테이블 선택
where DEPTNO=20 AND SAL>1500 --2. 무슨 행 선택
;
--select 열 추출 조건 / where 행 선택 조건

SELECT EMPNO,ENAME, SAL
FROM EMP
; --EMP의 사번, 이름, 월급 조회

SELECT DNAME LOC
FROM DEPT
;
SELECT EMPNO, ENAME , JOB, mgr, hiredate, sal, comm, deptno
from emp;

SELECT    *FROM EMP;
SELECT    *FROM DEPT;
SELECT    *FROM salgrade;
SELECT    *FROM bonus;

--Q 사원명과 연봉을 조회
SELECT ename 사원명 , sal*12 연봉, sal*12 + nvl(comm,0) "보너스 포함 연봉"
FROM emp
;

SELECT comm, nvl(comm, 0)   --nvl : comm의 컬럼값이 none인거 > 0
FROM emp
;

SELECT '안녕' as hello    --as : hello;컬럼  안녕;컬럼값  emp table 길이만큼
FROM emp                    --distinct : 중복값 삭제
;

SELECT ename, sal
FROM emp
where sal > 1500 and sal < 2800
;
SELECT ename, sal
FROM emp
where sal BETWEEN 1600 and 2800
;

SELECT 
    *
FROM EMP
where not deptno = 20 and comm is null  --null은 is로 비교
;

-----------------------------------------
-- from = dual >> 임시 테이블 
--Ltrim  010 제거
--Lpad ename이 10자가 되도록 left쪽에 s를 채워줘
SELECT Lpad(ename, 10 ,'S') 
FROM emp;

--문자열(컬럼) 이어붙이기
SELECT concat(ename, comm)
FROM emp;

--해당 컬럼에서 SM을 A로 바꿈
SELECT replace(ename,'SM', 'A')
FROM emp;

--직원들의 평균 급여 조회
select avg(sal) 평균급여
from emp;

--부서별 평균급여 조회
select avg(sal) 평균급여
from emp GROUP by deptno;

--1. EMP테이블에서 COMM 의 값이 NULL이 아닌 정보 조회
SELECT *
FROM emp
where comm is not null;
--2. EMP테이블에서 커미션을 받지 못하는 직원 조회
SELECT *
FROM emp
where comm is null or comm =0;
--3. EMP테이블에서 관리자가 없는 직원 정보 조회
SELECT *
FROM emp
where mgr is null;
--4. EMP테이블에서 급여를 많이 받는 직원 순으로 조회
SELECT *
FROM emp 
order by sal desc ;
--5. EMP테이블에서 급여가 같을 경우 커미션을 내림차순 정렬 조회
SELECT *
FROM emp 
order by sal desc;
--6. EMP테이블에서 사원번호, 사원명, 직급, 입사일 조회 (단, 입사일을 오름차순 정렬 처리)
SELECT empno, ename, job, hiredate
FROM emp 
order by hiredate desc ;

--7. EMP테이블에서 사원번호, 사원명 조회 (사원번호 기준 내림차순 정렬)
SELECT empno, ename
FROM emp 
order by empno desc ;

--8. EMP테이블에서 사번, 입사일, 사원명, 급여 조회 (부서번호가 빠른 순으로, 같은 부서번호일 때는 최근 입사일 순으로 처리)
SELECT empno, hiredate, ename, sal
FROM emp 
order by deptno asc , hiredate asc;

--9. 오늘 날짜에 대한 정보 조회
SELECT sysdate
from dual ;

--10. EMP테이블에서 사번, 사원명, 급여 조회 (단, 급여는 100단위까지의 값만 출력 처리하고 급여 기준 내림차순 정렬)
SELECT empno, ename, trunc(sal,-2)
FROM emp 
order by sal asc;

--11. EMP테이블에서 사원번호가 홀수인 사원들을 조회
SELECT *
FROM emp 
where mod(empno,2)=1;

--12. EMP테이블에서 사원명, 입사일 조회 (단, 입사일은 년도와 월을 분리 추출해서 출력)
SELECT  ename, extract(year from hiredate) 입사년도,extract(MONTH from hiredate) 월
FROM emp ;

--13. EMP테이블에서 9월에 입사한 직원의 정보 조회
SELECT *
FROM emp 
where extract(MONTH from hiredate)=9;

--14. EMP테이블에서 81년도에 입사한 직원 조회
SELECT *
FROM emp 
where extract(year from hiredate)=1981;

--15. EMP테이블에서 이름이 'E'로 끝나는 직원 조회
SELECT *
FROM emp 
where substr(ename,-1)='E';

--16. EMP테이블에서 이름의 세 번째 글자가 'R'인 직원의 정보 조회
SELECT *
FROM emp 
where ename like '__R%';
--where substr(ename,3)='R';

--17. EMP테이블에서 사번, 사원명, 입사일, 입사일로부터 40년 되는 날짜 조회
SELECT empno ,ename, hiredate, add_months(hiredate,480)
FROM emp; 
--18. EMP테이블에서 입사일로부터 38년 이상 근무한 직원의 정보 조회
--19. 오늘 날짜에서 년도만 추출
SELECT extract(year from sysdate)
FROM dual; 


create table t1( c1 char(5), c2 varchar2(2));
insert into t1 values('12','12');
commit;
SELECT*
FROM t1;

