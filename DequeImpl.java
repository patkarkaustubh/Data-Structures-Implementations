import java.util.LinkedList;
import java.util.*;

public class DequeImpl {

	//DequeImpl Implementations
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		Deque deque = new ArrayDeque<>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements in deque\t");
		int n=scan.nextInt();
		System.out.print("Enter the elements\t");
		for(int i=0;i<n;i++)
		{
			int num = scan.nextInt();
			deque.add(num);
			
		}
		System.out.println("Deque before add First function -- "+deque);
		
		deque.addFirst(4);
		
		System.out.println("\nDeque before add Last function: added 4 at beginning "+deque);
		deque.addLast(6);
		
		System.out.println("\nDeque before  Offer function : added 6 at last "+deque);
		deque.offer(5);
	
		System.out.println("\nDeque after  Offer function : offered 5  "+deque);
	
		int count=0;
	
		System.out.println("\n<-------Deque Iterator------------>");
		Iterator iterator = deque.iterator();
		while(iterator.hasNext())
		{
			System.out.print("\t"+iterator.next());
		}
		
		System.out.println("\n<------- Reverse Deque Iterator------------>");
		Iterator rev = deque.descendingIterator();
			while(rev.hasNext())
			{
				System.out.print("\t"+rev.next());
			}
		
	}
}
