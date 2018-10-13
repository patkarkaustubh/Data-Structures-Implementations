import java.util.Scanner;

public class ArrayRotation {

	public static void main(String args[])
	{
		
		
		
			System.out.println("\nEnter the size of array");
			java.util.Scanner scan = new java.util.Scanner(System.in);
			int n=scan.nextInt();
			int[] arr = new int[n];
			
			System.out.println("\nEnter the factor for array rotation\t");
			Scanner scan1 = new Scanner(System.in);
			int d= scan.nextInt();
			System.out.println("\nPlease enter the elements of array:\t");
			
		
		
		for(int r = 0 ;r<n ;r++)
		{
			arr[r] = scan.nextInt();
		}
		System.out.println("Rotation of Array is :");
		for(int y=0;y<n;y++)
		{
			System.out.println(""+arr[(y+d)%n]+" ");
		}
		scan.close();
		
	}
}
