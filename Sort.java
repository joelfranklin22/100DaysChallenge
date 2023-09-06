import java.util.Scanner;
public class Sort
{
	public static void main(String args[])
	{
		int j;
		String temp; 
		Scanner d=new Scanner(System.in);
		String a[]=new String[200];
		System.out.print("Enter the no of elements:");
		int n=d.nextInt();
		for(int i=0;i<n;i++)
		{
				System.out.print("Enter the String :");
				a[i]=d.next();			
		}
		for(int i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("SORTED ORDERED :");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);

	}
}