import java.util.Scanner;
public class Reverse
{
	public static void main(String args[])
	{
		String rev="";
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the String :");
		String a=d.nextLine();
		char ch[]=a.toCharArray();
		for(int i=a.length()-1;i>=0;i--)
			rev+=ch[i];
		System.out.println("The Reverse of the String :"+rev);
	}
}
		