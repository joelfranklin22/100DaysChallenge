import java.io.*;
import java.util.Scanner;
public class swap
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("enter the value 1:");
		int a=d.nextInt();
		System.out.print("enter the value 2:");
		int b=d.nextInt();
		System.out.println("Before Swapping:"+a +"and" +b);
		int temp =a;
		a=b;
		b=temp;
		System.out.println("After Swapping:"+a +"and" +b);
	}
}