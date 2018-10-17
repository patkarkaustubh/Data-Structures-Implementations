import java.util.Scanner;

public class MaxMinArray {
	
	public static void main(String args[])
	{
	System.out.println("\nEnter the number of elements in array");
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int [] arr = new int[n];
	System.out.println("\nEnter elements in array");
	int max = arr[0];
	for(int i=0;i<n;i++)
	{
		arr[i]=scan.nextInt();
	}
	for(int j=0;j<n;j++)
	{
		if(arr[j]>max)
		{
			max = arr[j];
		}
		
	}
	
	System.out.println("\n The largest element in array is :"+max);
	
	int min = arr[0];
	
	for(int z=0;z<n;z++)
	{
		if(arr[z]<min)
		{
			min = arr[z];
		}
		
	}
	System.out.println("\n The smallest element in array is :"+min);
	scan.close();
	}
}
