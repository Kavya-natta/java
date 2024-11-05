import java.io.*;
public class Main{
public static void main (String args[]){
    String str="kavya";
    System.out.printf("The string value is:%s\n",str);
    int x=512;
    System.out.printf("\nThe integer value is:%d\n",x);
    double f=5.25412368;
    System.out.printf("\nAfter formatting two specific width the value is:%.4lf\n",f);
    System.out.printf("\nAfter formatting two right margin the value is:%20.4lf\n",f);
}
}
