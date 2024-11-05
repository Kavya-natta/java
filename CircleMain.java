import java.io.*;
import java.util.Scanner;


class CircleArea
{
	double r;
	double area()		
	{
		return (22/7.0)*r*r;
	}
	void setCircle(double r) 	
	{
		this.r=r;		
	}
	
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		CircleArea ca1 = new CircleArea();
		CircleArea ca2 = new CircleArea();
		System.out.print("Enter Radius of the circle-1 : ");
		double radius1=sc.nextDouble();
		System.out.print("Enter Radius of the circle-2 : ");
		double radius2=sc.nextDouble();
		ca1.setCircle(radius1);
		ca2.setCircle(radius2);
		System.out.println("Area of Circle-1 is : "+ca1.area());	
		System.out.println("Area of Circle-2 is : "+ca2.area());
	}
}
