SELECT    * FROM employee;
SELECT    * FROM department;
SELECT    * FROM JOB;
SELECT    * FROM location;
SELECT    * FROM national;
SELECT    * FROM sal_grade;

--실습
--1. JOB 테이블의 모든 정보 조회
SELECT    * FROM JOB;
--2. JOB 테이블의 직급 이름 조회
SELECT job_name
FROM JOB;
--3. DEPARTMENT 테이블의 모든 정보 조회
SELECT    * FROM department;
--4. EMPLOYEE테이블의 직원명, 이메일, 전화번호, 고용일 조회
SELECT emp_name, email, phone, hire_date
FROM employee;
--5. EMPLOYEE테이블의 고용일, 사원 이름, 월급 조회
SELECT hire_date, emp_namem, salary
FROM employee;
--6. EMPLOYEE테이블에서 이름, 연봉, 총수령액(보너스포함), 실수령액(총수령액 - (연봉*세금 3%)) 조회
SELECT  emp_name, salary*12 연봉, salary*12*nvl(bonus,1) 총수령액, (salary*12*nvl(bonus,1)-(salary*12*0.3))
FROM employee;
--7. EMPLOYEE테이블에서 SAL_LEVEL이 S1인 사원의 이름, 월급, 고용일, 연락처 조회
SELECT emp_name, employee.salary, hire_date, phone
FROM employee
where sal_level ='S1';
--8. EMPLOYEE테이블에서 실수령액(6번 참고)이 5천만원 이상인 사원의 이름, 월급, 실수령액, 고용일 조회
--9. EMPLOYEE테이블에 월급이 4000000이상이고 JOB_CODE가 J2인 사원의 전체 내용 조회
SELECT *
FROM employee
where salary>=4000000 and JOB_CODE='J2';
--10. EMPLOYEE테이블에 DEPT_CODE가 D9이거나 D5인 사원 중 고용일이 02년 1월 1일보다 빠른 사원의 이름, 부서코드, 고용일 조회
SELECT emp_name, employee.dept_code, hire_date
FROM employee
where DEPT_CODE='D9' or DEPT_CODE='D5';
--11. EMPLOYEE테이블에 고용일이 90/01/01 ~ 01/01/01인 사원의 전체 내용을 조회
--12. EMPLOYEE테이블에서 이름 끝이 '연'으로 끝나는 사원의 이름 조회
SELECT emp_name
FROM employee
where substr(emp_name,-1)='연';
--13. EMPLOYEE테이블에서 전화번호 처음 3자리가 010이 아닌 사원의 이름, 전화번호를 조회
SELECT emp_name, phone
FROM employee
where substr(phone,1,3)!=010;
--14. EMPLOYEE테이블에서 메일주소 '_'의 앞이 4자이면서 DEPT_CODE가 D9 또는 D6이고 고용일이 90/01/01 ~ 00/12/01이고, 급여가 270만 이상인 사원의 전체를 조회
--15. EMPLOYEE테이블에서 사원 명과 직원의 주민번호를 이용하여 생년, 생월, 생일 조회


--1. 70년대 생(1970~1979) 중 여자이면서 전씨인 사원의 이름과 주민번호, 부서 명, 직급 조회
SELECT   emp_name,instr(emp_no,1,2),dept_code,job_code 
FROM employee;
--(instr(emp_no,1,2)> 70 or substr(emp_no,1,2)<79) and instr(emp_no,8)!=1
SELECT E.EMP_ID, E.EMP_NAME 사원이름, E.DEPT_CODE, E.MANAGER_ID,

M.EMP_NAME 관리자이름

FROM EMPLOYEE E, EMPLOYEE M
WHERE E.MANAGER_ID = M.EMP_ID;



SELECT EMP_NAME, SALARY, E.SAL_LEVEL
FROM EMPLOYEE E
JOIN SAL_GRADE S ON (SALARY BETWEEN MIN_SAL AND MAX_SAL);

SELECT    *
FROM employee e
    left outer join department d on e.dept_code = d.dept_id;
    --join시 해당 컬럼에 같은 값이 없는경우 맨 밑으로 d테이블에 null값이 없으므로 맨밑


SELECT EMP_NAME, DEPT_TITLE
FROM EMPLOYEE
CROSS JOIN DEPARTMENT;


--‘전’씨 성을 가진 직원 이름과 급여 조회
SELECT  emp_name, salary
FROM employee
where emp_name like '전%';

--핸드폰의 앞 네 자리 중 첫 번호가 7인 직원 이름과 전화번호 조회
SELECT  emp_name, phone
FROM employee
where phone like '___7%';

--‘이’씨 성이 아닌 직원 사번, 이름, 이메일 조회
SELECT  emp_id, emp_name, email
FROM employee
where not emp_name like '이%';

--관리자도 없고 부서 배치도 받지 않은 직원 조회
SELECT  emp_name
FROM employee
where manager_id is null and dept_code is null ;

--D6 부서와 D8 부서원들의 이름, 부서코드, 급여 조회
SELECT  emp_name, dept_code, salary
FROM employee
where dept_code in ('D6','D8');

--‘J2’ 또는 ‘J7’ 직급 코드 중 급여를 2000000보다 많이 받는 직원의 이름, 급여, 직급코드 조회
SELECT  emp_name, dept_code, salary
FROM employee
where (job_code='J2' or job_code='J7')and salary > 2000000;

-- 오늘 날짜
SELECT SYSDATE
FROM DUAL;  

alter SESSION set NLS_DATE_FORMAT = 'yyyy-mm-dd hh24:mi:ss';


--emp no의 8번째 숫자가 2이면 여자 아니면 남 
select emp_name, emp_no, decode(substr(emp_no,8,1),2 ,'여','남') as "성별"
from employee;

--emp no의 8번째 글자 한개
select substr(emp_no,8,1)
from employee;

--EMPLOYEE에서 부서코드, 그룹 별 급여의 합계, 그룹 별 급여의 평균(정수처리), 인원 수를 조회하고 부서 코드 순으로 정렬
SELECT dept_code, sum(salary) "급여 합" ,floor(avg(salary)) "급여 평균", COUNT(*)"인원 수"
FROM employee
GROUP by dept_code
order by dept_code;

--EMPLOYEE테이블에서 부서코드와 보너스 받는 사원 수 조회하고 부서코드 순으로 정렬
SELECT dept_code, count(*)
FROM employee
where bonus is not null
GROUP by dept_code
order by dept_code;

SELECT emp_name, dept_code, department.dept_title ,department.location_id
FROM employee
    join department on employee.dept_code = department.dept_id
    join location on department.location_id = location.local_code;
    --using;

--emp에서 name, salary를 가져와 topn_sal이라는 서브를만듬 
WITH TOPN_SAL AS (SELECT EMP_NAME, SALARY

FROM EMPLOYEE
ORDER BY SALARY DESC)

SELECT ROWNUM, EMP_NAME, SALARY
FROM TOPN_SAL;


