import java.io.*;
import java.util.*;
class Main{
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter"+n+"elements into an array");
for(int i=0; i<n; i++) {
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
   for(int j=i+1;j<n;j++){
       if(arr[i]>arr[j]){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
       }
   }
}

System.out.println("After sorting the elements in the array are:");
for(int i=0;i<n;i++){
System.out.println(arr[i]+" ");
}
}
}
