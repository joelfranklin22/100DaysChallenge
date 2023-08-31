import java.util.Scanner;
import java.io.*;
public class Quadratic 
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the value A:");
		double a=d.nextInt();
		System.out.print("Enter the value B:");
		double b=d.nextInt();
		System.out.print("Enter the value C:");
		double c=d.nextInt();
	        double root1, root2;
	        double determinant = b * b - 4 * a * c;
	    if (determinant > 0) 
	    {
      		root1 = (-b + Math.sqrt(determinant)) / (2 * a);
      		root2 = (-b - Math.sqrt(determinant)) / (2 * a);
		System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
    		}
    	    else if (determinant == 0) 
	    {
     			 root1 = root2 = -b / (2 * a);
    		  System.out.format("root1 = root2 = %.2f;", root1);
		}

    else {
      double real = -b / (2 * a);
      double imaginary = Math.sqrt(-determinant) / (2 * a);
      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
    }
  }
}