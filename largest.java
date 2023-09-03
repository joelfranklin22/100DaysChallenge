import java.util.Scanner;
public class largest
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the value a:");
		int a=d.nextInt();
		System.out.print("Enter the value b:");
		int b=d.nextInt();
		System.out.print("Enter the value c:");
		int c=d.nextInt();
		if(a>b && a>c)
			System.out.println("A is Largest ="+a);
		else if(b>a && b>c)
			System.out.println("B is Largest ="+b);
		else
			System.out.println("C is Largest ="+c);
	}
}
		