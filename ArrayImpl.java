import java.util.Scanner;
/* Created Array*/
public class ArrayImpl {

	public static void main(String args[])
	{
		System.out.println("\nEnter the length of array1");
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		
		int[] arr1 = new int[n];
	
		System.out.println("Elements of array1 are:");
		
		for(int i=0;i<n;i++)
		{
			arr1[i]=scan.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print("\t"+arr1[i]);
		}
		System.out.println("\nEnter the length of array2");
		Scanner scan1 = new Scanner(System.in);
		int m=scan1.nextInt();
		
		System.out.println("\nEnter the elements of array2:");
		int[] arr2= new int[m];
		for(int i=0;i<m;i++)
		{
			arr2[i]=scan.nextInt();
		}
		System.out.println("Elements of array2 are:");
		for(int i=0;i<m;i++)
		{
			System.out.print("\t"+arr2[i]);
		}
int choice;
		do {
			System.out.println("\n1.Addition \n2.Subtraction \n3.Multiplication\n4.Exit");
			System.out.println("\nEnter the choice");
			Scanner scan2= new Scanner(System.in);
			 choice = scan2.nextInt();
			
			switch(choice)
			{
			
			case 1:
				
					if(m==n)
					{
						int[] arr3= new int[arr1.length];
						for(int i=0;i<n;i++)
						{
							arr3[i]=arr1[i]+arr2[i];
						}
						System.out.println("\nThe addition matrix will be as following:");
						for(int i=0;i<n;i++)
						{
							
							System.out.println("\t"+arr3[i]);
						}
					}
					else
					{
						System.out.println("\nThe length of the both the array will have to be same");
					}
					break;
						
					case 2:
						
						if(m==n)
						{
							int[] arr4= new int[arr1.length];
							for(int i=0;i<n;i++)
							{
								arr4[i]=arr1[i]-arr2[i];
							}
							System.out.println("\nThe subtraction matrix will be as following:");
							for(int i=0;i<n;i++)
							{
								
								System.out.print("\t"+arr4[i]);
							}
						}
						else
						{
							System.out.println("\nThe length of the both the array will have to be same");
						}
						break;
						
					case 3:
						if(m==n)
						{
							int[] arr4= new int[arr1.length];
							for(int i=0;i<n;i++)
							{
								arr4[i]=arr1[i]*arr2[i];
							}
							System.out.println("\nThe multiplication of  matrix will be as following:");
							for(int i=0;i<n;i++)
							{
								
								System.out.print("\t"+arr4[i]);
							}
						}
						else
						{
							System.out.println("\nThe length of the both the array will have to be same");
						}
						break;
					case 4:
						System.exit(0);
						
				}
		}while(choice<4);
		System.out.println("Exiting...");
		System.exit(0);
	}
}
