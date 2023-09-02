import java.util.Scanner;
public class KilotoMile
{
	public static void main(String args[])
	{
		Scanner d =new Scanner(System.in);
		System.out.print("Enter the KiloMeter :");
		int kilo=d.nextInt();
		System.out.print("Kilometer to Miles ="+(kilo*0.62137119));
	}
}