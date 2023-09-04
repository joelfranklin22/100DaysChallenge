import java.util.*;
public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the no of terms:");
		int a=d.nextInt();
		int num1=0,num2=1,num3;
		for(int i=0;i<=a;i++)
		{
			System.out.println(num1);
			num3=num1+num2;
			num1=num2;
			num2=num3;

		}
	}
}
		