package javaprgs;

import java.util.Scanner;

public class EmployeeData{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empNo = 0;
		String empName = null;
		int empSal = 0;
		Employee emp = new Employee(empNo,empName,empSal);
		System.out.println("the emp no is "+emp.getEmpNo());
		System.out.println("the emp no is "+emp.getEmpName());
		System.out.println("the emp no is "+emp.getEmpSal());
		Scanner sc = new Scanner(System.in);
		System.out.println("enter empno");
		 int eno =sc.nextInt();
		emp.setEmpNo(eno);
		System.out.println("enter empname");
		String ename = sc.next();
		emp.setEmpName(ename);
		System.out.println("enter empsal");
		int esal =sc.nextInt();
		emp.setEmpSal(esal);
		
         emp.display();

	}

}
