select *
from tb_department;

select *
from tb_student;

select *
from tb_grade;

select *
from tb_professor;

select student_name, student_no,student_address
from tb_student
where (student_address like('%경기도%') or student_address like('%강원도%'))and substr(student_ssn,2,2)>=90 
order by student_address asc;

--join으로 성적 테이블을 학생번호로하여금 연결, 그룹함수로 학생번호,이름 묶기(컬럼에 표시하기위해, 중복된 이름존재하기때문)
--round함수 소숫점 1의 자리에서 반올림
select student_no,tb_student.student_name, round(avg(g.point),1)
from tb_student join tb_grade g using(student_no)
where department_no = 59
group by student_no,tb_student.student_name
;

--과목넘버가 학생테이블에서 최경희와 같은 번호를 가진 사람
select student_name, student_address
from tb_student
where department_no=(select department_no from tb_student where student_name='최경희')
;
select ROWNUM,student_name,student_no
from(select student_name,avg(tb_grade.point),student_no
    from tb_student join tb_grade  using(student_no)
    where department_no=001
    group by student_name,student_no
    order by avg(tb_grade.point)desc)
where rownum=1;
