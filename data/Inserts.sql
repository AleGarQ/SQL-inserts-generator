INSERT INTO DEPARTMENT VALUES('1','Legal',NULL); 
INSERT INTO DEPARTMENT VALUES('2','Training',NULL); 
INSERT INTO DEPARTMENT VALUES('3','Accounting',NULL); 
INSERT INTO DEPARTMENT VALUES('4','Services',NULL); 
INSERT INTO DEPARTMENT VALUES('5','Business Development',NULL); 
INSERT INTO DEPARTMENT VALUES('6','Sales',NULL); 
INSERT INTO DEPARTMENT VALUES('7','Marketing',NULL); 
INSERT INTO DEPARTMENT VALUES('8','Research and Development',NULL); 
INSERT INTO DEPARTMENT VALUES('9','Sales',NULL); 
INSERT INTO DEPARTMENT VALUES('10','Business Development',NULL); 
INSERT INTO EMPLOYEE VALUES(1,'Leelah','Kinlock','94 Service Center','21/01/1975','F','Boss','1'); 
INSERT INTO EMPLOYEE VALUES(2,'Rollo','Tant','13372 Mcbride Hill','28/09/1959','M','Boss','2'); 
INSERT INTO EMPLOYEE VALUES(3,'Masha','Starr','5 Oak Road','11/05/1980','F','Boss','3'); 
INSERT INTO EMPLOYEE VALUES(4,'Teodoro','Guiduzzi','06 Westport Center','08/03/1986','M','Boss','4'); 
INSERT INTO EMPLOYEE VALUES(5,'Janifer','Connors','25 4th Drive','02/09/1978','F','Boss','5'); 
INSERT INTO EMPLOYEE VALUES(6,'Isis','Meads','70834 Macpherson Court','28/06/1966','F','Boss','6'); 
INSERT INTO EMPLOYEE VALUES(7,'Ansley','Andrin','0439 Brentwood Road','07/07/1981','F','Boss','7'); 
INSERT INTO EMPLOYEE VALUES(8,'Luis','Peltzer','9412 Mosinee Road','21/09/1965','M','Boss','8'); 
INSERT INTO EMPLOYEE VALUES(9,'Fleur','Jados','6997 Superior Circle','27/02/1978','F','Boss','9'); 
INSERT INTO EMPLOYEE VALUES(10,'Christoffer','Popov','88092 Sutherland Trail','15/08/1965','M','Boss','10'); 

UPDATE DEPARTMENT
SET mgrEmpNo = 1
WHERE deptNo = 1;

UPDATE DEPARTMENT
SET mgrEmpNo = 2
WHERE deptNo = 2;

UPDATE DEPARTMENT
SET mgrEmpNo = 3
WHERE deptNo = 3;

UPDATE DEPARTMENT
SET mgrEmpNo = 4
WHERE deptNo = 4;

UPDATE DEPARTMENT
SET mgrEmpNo = 5
WHERE deptNo = 5;

UPDATE DEPARTMENT
SET mgrEmpNo = 6
WHERE deptNo = 6;

UPDATE DEPARTMENT
SET mgrEmpNo = 7
WHERE deptNo = 7;

UPDATE DEPARTMENT
SET mgrEmpNo = 8
WHERE deptNo = 8;

UPDATE DEPARTMENT
SET mgrEmpNo = 9
WHERE deptNo = 9;

UPDATE DEPARTMENT
SET mgrEmpNo = 10
WHERE deptNo = 10;
INSERT INTO PROJECT VALUES(1,'Zaam-Dox','1'); 
INSERT INTO PROJECT VALUES(2,'Tin','2'); 
INSERT INTO PROJECT VALUES(3,'Konklux','3'); 
INSERT INTO PROJECT VALUES(4,'Trippledex','4'); 
INSERT INTO PROJECT VALUES(5,'Tres-Zap','5'); 
INSERT INTO PROJECT VALUES(6,'Latlux','6'); 
INSERT INTO PROJECT VALUES(7,'Zaam-Dox','7'); 
INSERT INTO PROJECT VALUES(8,'Holdlamis','8'); 
INSERT INTO PROJECT VALUES(9,'Treeflex','9'); 
INSERT INTO PROJECT VALUES(10,'Solarbreeze','10'); 
INSERT INTO WORKSON VALUES('1',1,'08/08/1967',33); 
INSERT INTO WORKSON VALUES('2',2,'11/11/1965',95); 
INSERT INTO WORKSON VALUES('3',3,'30/03/2012',44); 
INSERT INTO WORKSON VALUES('4',4,'01/09/2010',37); 
INSERT INTO WORKSON VALUES('5',5,'07/12/1970',92); 
INSERT INTO WORKSON VALUES('6',6,'14/03/2011',60); 
INSERT INTO WORKSON VALUES('7',7,'11/09/2014',32); 
INSERT INTO WORKSON VALUES('8',8,'29/11/2002',86); 
INSERT INTO WORKSON VALUES('9',9,'12/08/1993',78); 
INSERT INTO WORKSON VALUES('10',10,'22/12/1960',41); 
