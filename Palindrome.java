import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		String rev="";
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the String :");
		String a=d.nextLine();
		for(int i=a.length()-1;i>=0;i--)
			rev=rev+a.charAt(i);

		if(a.equals(rev))
			System.out.println("The String is palindrome");
		else
			System.out.println("The String is not palindrome");
	}
}