import java.io.*;
import java.util.Scanner;
public class Quadratic
{
	public static void main(String args[])
	{
		Double a,b,c,root1,root2,determinent;
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the value a:");
		a=d.nextDouble();
		System.out.print("Enter the value b:");
		b=d.nextDouble();
		System.out.print("Enter the value c:");		
		c=d.nextDouble();
		if(a!=0)
	  {
		determinent=b*b-4*a*c;
		if(determinent==0)
		{
			root1=root2=-b/(2*a);
			System.out.printf("the roots are %/2.f",root1);
			System.out.println("roots are real and equal");
		}
		else if(determinent>0)
		{
			root1=(+b+Math.sqrt(determinent))/(2*a);
			root2=(-b-Math.sqrt(determinent))/(2*a);
			System.out.printf("root1 = %.2f and root2 = %.2f ",root1,root2 );
			System.out.println("roots are real and different");
		}
		else if(determinent<0)
		{
			root1=-b/(2*a);
			root2=Math.sqrt(-determinent)/(2 * a);
   			   System.out.printf("root1 = %.2f + %.2fi",root1,root2);
   			   System.out.printf("\nroot2 = %.2f - %.2fi",root1,root2);
			System.out.println("\nroots are complex complex and different");
		}
	   }
	}
}











		