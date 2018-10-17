import java.util.Scanner;

public class FindSpecificValue {
	
	public static void main(String args[])	{
		
	System.out.println("\nEnter number of elements in array");
	Scanner in = new Scanner(System.in);
	int n= in.nextInt();
	int [] ar = new int[n];
	System.out.println("\n Enter the elements in array ");
	for(int i = 0; i<n;i++)
	{
		ar[i]=in.nextInt();
		
	}
	System.out.println("\n Please enter the element to be found out in array");
	int num = in.nextInt();
	
	for(int j : ar)
	{
		if(num == j)
		{
			System.out.println(""+num+" Found");
		}
	}
	in.close();
	
	}
}
