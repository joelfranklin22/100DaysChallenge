import java.util.Scanner;
public class LCM
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the value A:");
		int a=d.nextInt();
		System.out.print("Enter the value B:");
		int b=d.nextInt();
		int Gcd=1;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
				Gcd=i;	
		}
			int lcm=(a*b)/Gcd;

		System.out.println("Gcd of two numbers :" + a +" and " + b +"=" +    lcm);
	}
}