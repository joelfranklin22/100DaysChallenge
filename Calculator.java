import java.io.*;
import java.util.*;
public class Calculator
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the value a:");
		Double a=d.nextDouble();
		System.out.print("Enter the value b:");
		Double b=d.nextDouble();
		System.out.println("Choose an operator '+','-','*','%','/");
		char operator =d.next().charAt(0);
		Double result=0.0;
		switch(operator)
		{
			case '+':
			result =a + b;
			break;
		
			case '-':
			result=a-b;
			break;

			case '*':
			result=a*b;
			break;

			case '/':
			result=a/b;
			break;
			
			case '%':
			result=a%b;
			break;
	
			default:
				System.out.println("Give Correct operator");
				break;
		}
						System.out.println("Result ="+result);
	}
}
