import java.io.*;
import java.util.*;
class FactRec
{
	int factorial(int n) 
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return(n*factorial(n-1));
		}
	}
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		FactRec ob = new FactRec();
		System.out.print("Enter a number  : ");
		int num = sc.nextInt();
		System.out.println("Factorial of "+num+" is "+ob.factorial(num));
	}
}
