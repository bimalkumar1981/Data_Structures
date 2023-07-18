import java.util.Scanner;
import java.util.*;

 
public class Dfs
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

				
		System.out.print("\nDFS:  ");
		DFS(0, vertex, adj_matrix);
	}


	//DFS
	 public static void  DFS(int source, int vertex, int adjacency_matrix[][])
    {
         Stack<Integer> stack =new Stack<Integer>();

		int number_of_nodes = adjacency_matrix[source].length - 1;
 
        int visited[] = new int[number_of_nodes + 1];		
        int element = source;		
        int i = source;		
        System.out.print(element + " ");		
        visited[source] = 1;		
        stack.push(source);
 
        while (!stack.isEmpty())
        {
            element = stack.peek();
            i = element;	
	    while (i <= number_of_nodes)
	    {
     	        if (adjacency_matrix[element][i] == 1 && visited[i] == 0)
	        {
                    stack.push(i);
                    visited[i] = 1;
                    element = i;
                    i = 1;
                    System.out.print(element + " ");
	            continue;
                }
                i++;
	    }
            stack.pop();	
        }	
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
}