

public class LevelOrderTraversal {
	static class Node{
		int key;
		Node left;
		Node right;
		
		Node(int key)
		{
			right=left=null;
			this.key=key;
			
		}
	}
		 static Node root;
		
		public static int FindHeight(Node root)
		{
			if(root==null)
		{
				return 0;
				
			}
			int lheight= FindHeight(root.left);
			int rheight= FindHeight(root.right);
			
			if(lheight>rheight)
			{
				return(lheight+1);
			}
			else {
				return (rheight+1);
			}
		}
		
	
	
	public static void main(String args[])
	{
		
	       root= new Node(1); 
	       root.left= new Node(2); 
	      root.right= new Node(3); 
	       root.left.left= new Node(4); 
	      root.left.right= new Node(5); 
	      printlevelorder();
	      
	}



	private static void printlevelorder() {
		// TODO Auto-generated method stub
		int h=FindHeight(root);
		for(int i=0;i<=h;i++)
		{
			printlevelordertraversal(root,i);
		}
	}



	private static void printlevelordertraversal(Node root , int i) {
		// TODO Auto-generated method stub
		if(root==null)
		{
			return;
		}
		if(i==1)
		{
			System.out.println(" "+root.key);
			
		}
		printlevelordertraversal(root.left,  i-1);
		printlevelordertraversal(root.right,  i-1);
		
	}
}
