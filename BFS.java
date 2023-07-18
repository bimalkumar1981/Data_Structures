import java.util.Scanner;
import java.util.*;

 
public class Bfs
{
        
	public static void main (String[] args)
	{
		int vertex;
		int v1,v2;

		v1=v2=0;;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of vertex");
		vertex = sc.nextInt();

		int[][] adj_matrix = new int[vertex][vertex];

		while (true)
		{
		
			System.out.println("Enter two vertex (eg. 2 3) to create egde or (0 0)to terminate");
			v1 = sc.nextInt();
			v2 = sc.nextInt();

			if (v1==0 && v2==0)
			{
				break;
			}
			
			else
			{
				adj_matrix[v1][v2]=1;
				adj_matrix[v2][v1]=1;
			}
		}
				
		print(vertex, adj_matrix);
		
		System.out.print("BFS:  ");
		BFS(0, vertex, adj_matrix);
		
	}

	
	//Print Adjency Matrix
	public static void print(int vertex, int[][]adj_matrix)
	{
	
	 System.out.println("The adajency matrix is given as follows:\n\n");

		for(int i=0 ; i < vertex; i++) 
		{
			if (i==0)
			{
				System.out.print("    " + (i));
			}
			else
				System.out.print("  " + (i));
					
		}

		System.out.println();

		for(int i=0 ; i < vertex; i++) 
		{
			if (i==0)
			{
				System.out.print("    " + "_");
			}
			else
				System.out.print("  " + "_");

		}

		System.out.println("\n");
		
		for(int i=0 ; i < vertex; i++)
		{
			System.out.print( i + 1 + " | ");

			for (int j=0; j < vertex ;j++ )
			 {
			 System.out.print(adj_matrix[i][j] + "  ");
			 }

			System.out.println("\n");
		}
	
	}

	//BFS Algortihm
	public static void BFS(int s, int vertex, int[][]graph)
	{
            ArrayList<Integer> bfs = new ArrayList();
            ArrayList<Integer> queue = new ArrayList();
            boolean [] visited = new boolean[vertex];
            
            int queue_front = 0;
            int u;

            for(int i = 0; i < vertex ; i++)
                visited[i] = false; //visited = 0 means false/not visited/i is the vertex name
            
            queue.add(s); //adding to queue  

            while(queue_front < queue.size())
            {                
               // System.out.print("okay\n");
                u = queue.get(queue_front);//removing from queue
                queue_front++;
      
                if(visited[u] == false)
                {
                    bfs.add(u); //bfs 0 = source vertex 
                    System.out.print(u + " ");
                    visited[u] = true;
                }  
                
                for(int w = 0; w < vertex ; w++)
                {
                    if(graph[u][w] == 1 && visited[w] == false)
                     {
                         //System.out.print(w + "  ");                        
                         queue.add(w); //adding to queue
                     }
                }
                
            }
	}

}