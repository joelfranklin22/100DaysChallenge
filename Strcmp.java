import java.util.Scanner;
public class Strcmp
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the String 1:");
		String a=d.nextLine();
		System.out.print("Enter the String 2:");
		String b=d.nextLine();
		int result=a.compareToIgnoreCase(b);
		if(result==0)
			System.out.println("Strings are same ");
		else
			System.out.println("Strings are Different ");
	}
}
		