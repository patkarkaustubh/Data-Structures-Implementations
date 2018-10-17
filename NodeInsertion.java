/* Node Insertion Algorithm
 * 1. Check the root where it is present or not
 * 2. If not present create root
 * 3. Check the next value to be inserted if it is less than key of the root
 * 4. If it is less then go to left subtree and insert it
 * 5. If it is more then go to right subtree and insert it\
   6. Likewise iterate till the end of inserting elements
   7. Print the inorder of tree : left,root,right
 * 
 * */



public class NodeInsertion
{
	class Node{
		Node left;
		Node right;
		int key;
		
		public Node(int item) {
			left=right=null;
			key = item;
		}
		
	}
	Node root;
	
	NodeInsertion()
	{
		root=null;
	}
	public void InsertKey( int key) {
		root=InsertNodeRec(root,key);
			
	}
	
	
	private Node InsertNodeRec(Node root, int key) {
		// TODO Auto-generated method stub
		
		
		if(root==null)
		{
			root=new Node(key);
			return root;
		}
		if(key<root.key)
		{
			root.left=InsertNodeRec(root.left,key); 
		}
		if(key>root.key)
		{
			root.right=InsertNodeRec(root.right,key); 
		}
		return root;
	}
	
	public void inorder()
	{
		inorderprint(root);
		
	}

	private void inorderprint(Node root) {
		// TODO Auto-generated method stub
		if(root!=null) {
		inorderprint(root.left);
		System.out.println(root.key);
		inorderprint(root.right);
		}
	}
	public static void main(String args[])
	{
		NodeInsertion tree = new NodeInsertion();
		tree.InsertKey(50);
		tree.InsertKey(10);
		tree.InsertKey(16);
		tree.InsertKey(92);
		tree.InsertKey(40);
		tree.InsertKey(30);
		tree.InsertKey(10);
		tree.inorder();
	}
}