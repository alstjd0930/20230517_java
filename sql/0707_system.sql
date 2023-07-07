select * from user_tables;
--주석(ctrl /)
--create - DDL 데이터 정의 명령어
CREATE user c##scott IDENTIFIED by tiger;
drop user c##scott;

alter SESSION set "_ORACLE_SCRIPT"=true;
CREATE user kh IDENTIFIED by kh;
CREATE user scott IDENTIFIED by tiger;

GRANT connect,resource to c##scott;
GRANT connect,resource to kh; 
GRANT connect,resource to scott, kh; 

GRANT connect,resource,dba to scott, kh; 