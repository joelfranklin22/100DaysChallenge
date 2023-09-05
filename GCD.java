import java.util.Scanner;
public class GCD
{
	public static void main(String arg[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the Value A:");
		int a=d.nextInt();
		System.out.print("Enter the value B:");
		int b=d.nextInt();
		if(b!=0)
		{
			int R=b%a;
			a=b;
			b=R;
		}
			System.out.println("The GCD of two numbers ="+b);
	}
}