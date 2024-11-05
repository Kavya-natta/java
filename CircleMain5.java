import java.io.*;
import java.util.Scanner;


class CircleArea5
{
	double r;	
	CircleArea5()
	{
		r=0;  	
	}
	CircleArea5(double c)
	{
		r=c;
	}
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
		CircleArea5 ca1 = new CircleArea5();
		CircleArea5 ca2 = new CircleArea5(5);
		System.out.print("Enter Radius of the circle-1 : ");
		double radius=sc.nextDouble();
		ca1.setCircle(radius);
		System.out.println("Area of Circle-1 is : "+ca1.area());	
		System.out.println("Area of Circle-2 is : "+ca2.area());
	}
}
