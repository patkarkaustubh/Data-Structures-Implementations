import java.util.*;

public class Average {

	
	public static void main(String args[])
	{
			System.out.println("\nEnter the number of elements in array");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int []ar = new int[n];
			float sum = 0;
			
			System.out.println("\nEnter the elements in array");
			for(int i=0;i<n;i++)
			{
				ar[i]=scan.nextInt();
			}
			for(int j=0;j<n;j++)
			{
				sum = sum + ar[j];
			}
			System.out.println(""+sum);
			float avg = sum/n;
			System.out.println("\n The average of elements in array is : "+avg);
			scan.close();
			
	}
}
