

public class NodeDeletion {
	
	    /* Class containing left and right child of current node and key value*/
	    class Node 
	    { 
	        int key; 
	        Node left, right; 
	  
	        public Node(int item) 
	        { 
	            key = item; 
	            left = right = null; 
	        } 
	    } 
	  
	    // Root of BST 
	    Node root; 
	  
	    // Constructor 
	    NodeDeletion() 
	    { 
	        root = null; 
	    } 
	    
	    
	    void deletekey(int key)
	    {
	    	root = deleterec(root,key);
	    }


		private Node deleterec(Node root, int key) {
			// TODO Auto-generated method stub
			
			if(root==null)
			{
				root=new Node(key);
				return root;
			}
			if(key<root.key)
			{
				root.left=deleterec(root.left,key);
			}
			else if(key>root.key)
			{
				root.left=deleterec(root.left,key);
			}
			else
			{
				if(root.left==null)
				{
					return root.right;
				}
				else if(root.right==null)
				{
					return root.left;
				}
				//Inorder succesor to be deleted
				root.key = Minvalue(root.right);
			}
			
			return root;
		}


		private int Minvalue(Node root) {
			// TODO Auto-generated method stub
			
			int minval =root.key;
			
			while(root.left!=null)
			{
				minval = root.left.key;
				root = root.left;
			}
			return minval;
		}
		public void InsertKey( int key) {
			root=InsertNodeRec(root,key);
				
		}
		 void insert(int key) 
		    { 
		        root = InsertNodeRec(root, key); 
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
			NodeDeletion tree = new NodeDeletion(); 
			  
	        /* Let us create following BST 
	              50 
	           /     \ 
	          30      70 
	         /  \    /  \ 
	        20   40  60   80 */
	        tree.insert(50); 
	        tree.insert(30); 
	        tree.insert(20); 
	        tree.insert(40); 
	        tree.insert(70); 
	        tree.insert(60); 
	        tree.insert(80); 
	  
	        System.out.println("Inorder traversal of the given tree"); 
	        tree.inorder(); 
	  
	        System.out.println("\nDelete 20"); 
	        tree.deletekey(20); 
	        System.out.println("Inorder traversal of the modified tree"); 
	        tree.inorder(); 
	  
	        System.out.println("\nDelete 30"); 
	        tree.deletekey(30); 
	        System.out.println("Inorder traversal of the modified tree"); 
	        tree.inorder(); 
	  
	        System.out.println("\nDelete 50"); 
	        tree.deletekey(50); 
	        System.out.println("Inorder traversal of the modified tree"); 
	        tree.inorder(); 
		}
}
