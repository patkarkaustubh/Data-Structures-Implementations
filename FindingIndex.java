import java.util.Scanner;

public class FindingIndex {
	
	
	public static void main(String args[])
	{
		System.out.println("\nEnter the number of elements in array");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("\nEnter the elements of Array");
		for(int i = 0;i < n;i++)
		{
			arr[i] = in.nextInt();
		}
		System.out.println("\nPlease enter the number for which index is to be found out:\t");
		int num = in.nextInt();
		for(int j : arr)
		{
			if(num == j)
			{
				System.out.println("The index of the element in array is: "+arr[num-2]);
			}
		}
		in.close();
	}
}
