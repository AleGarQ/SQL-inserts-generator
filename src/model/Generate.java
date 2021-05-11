package model;

import java.util.List;

public class Generate {
	
	private String deptInsert;
	private String empInsert;
	private String projInsert;
	private String wOInsert;
	private int deptsInserted;
	private int employeesInserted;
	
	public Generate() {
		deptInsert = "";
		empInsert = "";
		projInsert = "";
		wOInsert = "";
		deptsInserted = 0;
		employeesInserted = 0;
	}

	public void generateDeparment(List<Deparment> inserts) {
		String insert = "";
		
		for (Deparment deparment : inserts) {
			insert += "INSERT INTO DEPARTMENT VALUES(" + deparment.getDeptNo() +","+ deparment.getDeptName()+","+deparment.getMgrEmpno()+"); \n";
			deptsInserted++;
		}
		
		deptInsert += insert;
	}
	
	public void generateEmployee(List<Employee> inserts) {
		String insert = "";
		
		for (Employee employee : inserts) {
			insert += "INSERT INTO EMPLOYEE VALUES(" + employee.getEmpNo()+","+ employee.getfName()+","+employee.getlName()+","+
					employee.getAddress()+","+ employee.getDob()+","+employee.getSex()+","+employee.getPosition()+","+employee.getDeptNo()+"); \n";
			employeesInserted++;
		}
		
		
		empInsert += insert;
	}
	
	public void generateProject(List<Project> inserts) {
		String insert = "";
		
		for (Project project : inserts) {
			
			insert += "INSERT INTO PJCT VALUES(" + project.getProjNo()+","+ project.getProjName()+","+project.getDeptNo()+"); \n";
			
		}
		
		projInsert += insert;
	}
	
	public void generateWorksOn(List<WorksOn> inserts) {
		String insert = "";
		
		for (WorksOn worksOn : inserts) {
			
			insert += "INSERT INTO WORKSON VALUES(" + worksOn.getEmpNo()+","+ worksOn.getProjNo()+","+worksOn.getDateWorked()+","+worksOn.getHoursWorked()+"); \n";
			
		}
		
		
		wOInsert += insert;
	}

	public String getDeptInsert() {
		return deptInsert;
	}

	public String getEmpInsert() {
		return empInsert;
	}

	public String getProjInsert() {
		return projInsert;
	}

	public String getwOInsert() {
		return wOInsert;
	}

	public int getDeptsInserted() {
		return deptsInserted;
	}
	
	public int getEmployeesInserted() {
		return employeesInserted;
	}
}
