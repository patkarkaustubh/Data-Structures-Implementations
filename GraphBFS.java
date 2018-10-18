import java.util.Iterator;
import java.util.LinkedList;

public class GraphBFS {

	int V;
	LinkedList<Integer> adj[]; 
	
	
	GraphBFS(int v)
	{
		V=v;
		adj= new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i]= new LinkedList();
		}
			
	}
	void addedge(int v,int w)
	{
		adj[v].add(w);
	}
	void BFS(int s)
	{
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(s);
		boolean visited[] =new boolean[V];
		visited[s]=true;
		
		while(queue.size()!=0)
		{
			s=queue.poll();
			System.out.println(""+s);
			
		
		Iterator<Integer> it = adj[s].listIterator();
		
		while(it.hasNext())
		{
			int n=it.next();
			if(!visited[n])
			{
				visited[n]=true;
				queue.add(n);
			}
		}
		}
	}
	public static void main(String args[])
	{
			GraphBFS dfs= new GraphBFS(4);
			dfs.addedge(0, 1);
			dfs.addedge(0, 2);
			dfs.addedge(0, 3);
			dfs.addedge(1, 2);
			dfs.addedge(1, 3);
			dfs.addedge(2, 2);
			dfs.addedge(2, 3);
			
			dfs.BFS(2);
			
			
	}
}
