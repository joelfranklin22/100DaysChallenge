import java.util.Scanner;
public class Triangle
{	
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("enter the length:");
		int l=d.nextInt();
		System.out.print("enter the breadth:");
		int b=d.nextInt();
		System.out.println("Area of triangle ="+(0.5*l*b));
	}
}
