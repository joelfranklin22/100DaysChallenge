import java.util.Scanner;
public class CelsiustoFahrenheit
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter the Celsius:");
		float Cel=d.nextFloat();
		float Fah=(float)(Cel*1.8)+32;
		System.out.print("Celsius to Fahrenheit ="+Fah);
	}
}
		