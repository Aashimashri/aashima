package javaprgs;

import java.util.Scanner;

public class TestReactangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		System.out.println(r.calArea(5,5));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height");
		 double h =sc.nextDouble();
		 r.setHeight(h);
		System.out.println("Enter width");
		double w = sc.nextDouble();
		r.setWidth(w);
		System.out.println(r.calArea(h, w));
		

	}

}
