import java.util.Scanner;
public class OddEven
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the Value:");
		int Num=d.nextInt();
		if(Num%2==0)
			System.out.println("The Number is Even ="+Num);
		else
			System.out.println("The Number is odd ="+Num);
	}
}