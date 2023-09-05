import java.util.Scanner;
public class Ascii
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		System.out.print("Enter a character:");
		char asc=d.nextLine().charAt(0);
		int ascii=asc;
		System.out.println("The ascii cosde for given Character :"+ascii);
	}
}