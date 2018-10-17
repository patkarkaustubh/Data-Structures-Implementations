import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PairtoSum {

	
	public static void main(String args[])
	{
		PairtoSum pairsum = new PairtoSum();
		Map <Boolean,ArrayList<Integer>> map1= new HashMap<>();
		map1 = pairsum.FindPair();
		System.out.println(map1);
		
}
	public Map<Boolean,ArrayList<Integer>> FindPair()
	{
		int n=Integer.MAX_VALUE;
		int[] arr = new int[4];
		
		Scanner scan = new Scanner(System.in);
		Map <Boolean,ArrayList<Integer>> map= new HashMap<>();
		int sum=8;
		System.out.println("Enter the elements of array");
		
			int flag=0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			temp=sum-arr[i];
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(temp==arr[j])
				{
					flag=1;
					list.add(arr[i]);
					list.add(arr[j]);
					
					
				}
				else 
				{
					flag=0;
					
				}
				
			}
		
	}
		if(flag==1)
		{
			System.out.println("\nPair found");
			map.put(true,list);
		}
		else
		{
			System.out.println("\nPair not  found");
			map.put(false,list);
		}
		return map;
		
	}
	}

