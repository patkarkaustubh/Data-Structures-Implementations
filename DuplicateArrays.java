import java.util.Scanner;

public class DuplicateArrays {
	public static void main(String args[])
	{
		System.out.println("\nEnter the number of elements in arrays");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println("\n Enter the elements in the array");
		int []arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = in.nextInt();
		}
		for(int j=0;j<n-1;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(arr[j] == arr[k] && j!=k)
				{
					System.out.println("The duplicate values in array are: "+arr[k]);
				}
			}
		}
		in.close();
		
	}
}
