import java.util.Scanner;
public class Add
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the value a:");
		int a=d.nextInt();
		System.out.println("Enter the value b:");
		int b=d.nextInt();
		System.out.println("Addition of two numbers:"+(a+b));
	}
}
