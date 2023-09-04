import java.util.Scanner;
public class Amstrong
{
	public static void main(String args[])
	{
		int result=0,temp,remainder;
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int a=d.nextInt();
		temp=a;
		while(temp>0)
		{
			remainder=temp%10;
			result+=Math.pow(remainder,3);
			temp/=10;
		}
	if(result==a)
		System.out.println("The Number is Amstrong");
	else
		System.out.println("The Number is Not a Amstrong");
	}
}