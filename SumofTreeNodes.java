

public class SumofTreeNodes {

	
	static class Node{
		Node left;
		Node right;
		int key;
		Node(int key){
			left = null;
			right = null;
			 this.key=key;
		}
	}
	
	static Node root=null;
	
	static int AddNodes(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		return (root.key+AddNodes(root.left)+AddNodes(root.right));
	}
	
	static void Inorder(Node temp)
	{
		if(temp==null)
		{
			return;
		}
		Inorder(temp.left);
		System.out.print(" "+temp.key);
		Inorder(temp.right);
	}
	
	public static void main(String args[])
	{
		int sum=0;
		root = new Node(10);
		root.left = new Node(11);
		root.left.left= new Node(7);
		root.right= new Node(9);
		root.right.left= new Node(15);
		root.right.right= new Node(8);
		 sum = AddNodes(root);
		 System.out.println("The nodes of trees is:");
		 Inorder(root);
		 System.out.println("\n"+sum);
	}
}
