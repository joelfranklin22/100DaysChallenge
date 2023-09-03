import java.util.Scanner;
public class Multiplytables
{
	public static void main(String args[])	
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the table:");
		int n=d.nextInt();
		for(int i=1;i<=20;i++)
			System.out.println(+n +"*" +i +"=" +(n*i));
	}
}