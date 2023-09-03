import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{	
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the value:");
		int num=d.nextInt();
		int fact=1;
		for(int i=2;i<=num;i++)
			fact=fact*i;
			System.out.println("Factorial of number :"+fact);
	}
}
			
		