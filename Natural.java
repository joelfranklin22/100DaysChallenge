import java.util.Scanner;
public class Natural
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the limit:");
		int num=d.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++)
			sum=sum+i;
			System.out.println("Sum of natural numbers :"+sum);
	}
}
			