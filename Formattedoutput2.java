import java.io.*;
import java.text.DecimalFormat;
public class Main
{
	public static void main(String[] args) {
		double x=123.45678;
		System.out.printf("The number is:%lf",x);
		DecimalFormat DF = new DecimalFormat("####");
		System.out.println("\nWithout fractional part the number is"+x);
		System.out.println("\nWithout fractional part the number is" +DF.format(x));
		 DF = new DecimalFormat("#.##");
		System.out.println("\nFormatted number with precision is:"+DF.format(x));
		 DF = new DecimalFormat("$####,###.##");
		System.out.println("\nAfter formatting the value is"+DF.format(x));
	}
}
