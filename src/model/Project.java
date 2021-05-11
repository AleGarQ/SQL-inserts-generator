package model;

public class Project {
	
	private int projNo;
	private String projName;
	private String deptNo;
	
	public Project(int projNo, String projName, String deptNo) {
		this.projNo = projNo;
		this.projName = projName;
		this.deptNo = deptNo;
	}

	public int getProjNo() {
		return projNo;
	}

	public void setProjNo(int projNo) {
		this.projNo = projNo;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	
	
	
}
