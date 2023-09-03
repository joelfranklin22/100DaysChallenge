import java.util.Scanner;
public class Prime
{
	public static void main(String args[])
	{
		int flag=0;
		Scanner d=new Scanner(System.in);
		System.out.print("Enter a positive Number:");
		int num=d.nextInt();
		if(num<=1)
			System.out.println("The Number is not prime");
		else(num>1)
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
	            		   System.out.println("The Number is not prime");
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
				System.out.println("The Number is a prime");
	}
}
				