package model;

public class WorksOn {
	
	
	private String empNo;
	private int projNo;
	private String dateWorked;
	private int hoursWorked;
	
	
	public WorksOn(String empNo, int projNo, String dateWorked, int hoursWorked) {

		this.empNo = empNo;
		this.projNo = projNo;
		this.dateWorked = dateWorked;
		this.hoursWorked = hoursWorked;
	}


	public String getEmpNo() {
		return empNo;
	}


	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}


	public int getProjNo() {
		return projNo;
	}


	public void setProjNo(int projNo) {
		this.projNo = projNo;
	}


	public String getDateWorked() {
		return dateWorked;
	}


	public void setDateWorked(String dateWorked) {
		this.dateWorked = dateWorked;
	}


	public int getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	

}