package graph;

/**
 * Based on this video
 * https://www.youtube.com/watch?v=fjT3WDKiAkI
 */

import java.util.LinkedList;
import java.util.List;

public class GraphWithAdjacencyList {
	
	// Own user define type, instead of integer array
	class Edge{
		// v is the n vertex
		// w is the weight
		int v, w;
		
		public Edge(int v, int w){
			this.v = v;
			this.w = w;
		}
		
		@Override
		public String toString(){
			return "(" + v + "," + w + ")";
		}
	}
	
	// Array of list of type Edge
	// Could've used LinkedList class instead
	List<Edge>[] G;
	
	// Graph constructor where n is the size of the array
	public GraphWithAdjacencyList(int n){
		// Create an array with size n
		G = new LinkedList[n];
		
		// Create new object for each element in array
		for(int i = 0; i < G.length; i++){
			G[i] = new LinkedList<>();
		}
		
	}
	
	// A method that add a new object of edge into current array
	void addEdge(int u, int v, int w){
		// Adding at the beginning of index is O(1)
		// If adding at the end of index is O(N)
		G[u].add(0, new Edge(v,w));
		
		// Or we could've used linkedlist 
		// G[u].addFirst(new Edge(v,w));
	}
	
	
	
	@Override
	public String toString(){
		String result = "";
		
		for(int i = 0; i < G.length; i++){
			result += i + " ==>" + G[i] + "\n";
		}
		
		return result;
	}
}
