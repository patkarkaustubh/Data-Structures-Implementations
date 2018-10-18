
public class HeightofBinaryTree {

	
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
		 Node root;
		
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
		HeightofBinaryTree tree = new HeightofBinaryTree(); 
	       tree.root= new Node(1); 
	       tree.root.left= new Node(2); 
	       tree.root.right= new Node(3); 
	       tree.root.left.left= new Node(4); 
	       tree.root.left.right= new Node(5); 
	       int h=FindHeight(tree.root);
	       System.out.println(h);
	}
	
}
