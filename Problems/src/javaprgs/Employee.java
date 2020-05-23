package javaprgs;

public class Employee 
{

	private int empNo;
	private String empName;
	private int empSal;
	Employee(){
		
	}
	 
	Employee(int empNo,String empName,int empSal ){
		this.empNo =123;
		this.empName ="Manjiri";
		this.empSal = 25000;
		
		
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
   void display() {
	   System.out.println("the emp no is"+ getEmpNo());
	   System.out.println("the emp no is"+ getEmpName());
	   System.out.println("the emp no is"+ getEmpSal());
	   
   }

}
