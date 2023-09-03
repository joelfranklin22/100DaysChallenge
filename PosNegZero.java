import java.util.Scanner;
public class PosNegZero
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the Value:");
		int Num=d.nextInt();
		if(Num==0)
			System.out.println("The Number is Zero ="+Num);
		else if(Num>0)
			System.out.println("The Number is Positive ="+Num);
		else
			System.out.println("The Number is negative ="+Num);
	}
}