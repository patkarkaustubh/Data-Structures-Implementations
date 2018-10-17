import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
	public static void main(String args[])
	{
		System.out.println("\nEnter the number of elements in array");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] arr = new int[n];
	
		System.out.println("\nEnter the elements in array");
		for(int i = 0;i < n;i++)
			{
				arr[i] = in.nextInt();
			}
		System.out.println("Original Array : "+Arrays.toString(arr)); 
		System.out.println("\nEnter the index of the array to be removed\n");
		int num = in.nextInt();
		for(int j=num;j<n-1;j++)
		{
			arr[j]= arr[j+1];
		}
		System.out.println("Array after index removed is "+Arrays.toString(arr));
		in.close();
	}
}
