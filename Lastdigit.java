import java.util.Scanner;
public class Lastdigit
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the value of a:");
		int a=d.nextInt();
		System.out.print("Enter the value of b:");			
		int b=d.nextInt();
		System.out.print("Enter the value of c:");
		int c=d.nextInt();
		a%=10;b%=10;c%=10;
		if(a==b && a==c)
			System.out.println("Last digit is same");
		else 
			System.out.println("Last digit is different");
	}
}