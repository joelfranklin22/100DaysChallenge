import java.util.Scanner;
public class Factor
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter number to Find Factors:");
		int num=d.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				System.out.println("The Factors are:"+i);
		}
	}
}