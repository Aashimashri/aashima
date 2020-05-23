package javaprgs;

import java.util.Scanner;
public class EmpData 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int EmpNo = 0;
		String Empname = null;
		int empSal= 0;
	
		Emp emp1 = new Emp(EmpNo,Empname,empSal);
		System.out.println("the emp no is "+emp1.getEmpNo());
		System.out.println("the emp name is "+emp1.getEmpname());
		System.out.println("the emp salary is "+emp1.getEmpSal());
		Scanner sc = new Scanner(System.in);
	System.out.println("enter empno");
		 int eno =sc.nextInt();
		 System.out.println("the emp no is" + eno);
		 
	System.out.println("enter empname");
	String ename = sc.next();
	System.out.println("the emp name is" + ename);
		
		System.out.println("enter empsal");
	int esal =sc.nextInt();
		System.out.println("the emp sal is" + esal);
		
				emp1.display();
		

	}

}
