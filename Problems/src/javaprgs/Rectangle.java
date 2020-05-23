package javaprgs;

public class Rectangle 
{

	private double height;
	private double width;
	Rectangle(){
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	Rectangle(double height,double width){
		this.height =5.0;
		this.width = 5.0;
		
	}
	public double calArea(double height,double width) {
		double area = height * width;
		return area;
		
	}
}
