package javaprgs;

public class Emp {
	private int EmpNo;
	private String Empname;
	private int empSal;
	Emp(){
		 
	}
	
	Emp(int EmpNo,String Empname,int empSal){
		this.EmpNo = 6231;
		this.Empname = "Vijay";
		this.empSal = 30000;
		
		
	}
	public void setEmpNo(int empNo) {
		this.EmpNo = empNo;
	}


	public int getEmpNo() {
		return EmpNo;
	}

	public void setEmpName(String empName) {
		this.Empname = empName;
	}
	
   public String getEmpname() {
		return Empname;
	}
   

	
   public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	 void display() {
		   System.out.println("the emp no is"+ getEmpNo());
		   System.out.println("the emp name is"+ getEmpname());
		   System.out.println("the emp salary is"+ getEmpSal());
		   
	   }

}
