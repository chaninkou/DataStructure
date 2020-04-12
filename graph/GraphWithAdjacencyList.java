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
		// v is the vertex
		// w is the weight
		int vertex, weight;
		
		public Edge(int vertex, int weight){
			this.vertex = vertex;
			this.weight = weight;
		}
		
		@Override
		public String toString(){
			return "(" + vertex + "," + weight + ")";
		}
	}
	
	// Array of list of type Edge
	// Could've used LinkedList class instead
	List<Edge>[] graph;
	
	// Graph constructor where n is the size of the array
	public GraphWithAdjacencyList(int size){
		// Create an array with size n
		graph = new LinkedList[size];
		
		// Create new object for each element in array
		for(int i = 0; i < graph.length; i++){
			graph[i] = new LinkedList<>();
		}
		
	}
	
	// A method that add a new object of edge into current array
	public void addEdge(int startVertex, int endVertex, int weight){
		// Adding at the beginning of index is O(1)
		// If adding at the end of index is O(N)
		graph[startVertex].add(0, new Edge(endVertex,weight));
		
		// Or we could've used linkedlist 
		// graph[startVertex].addFirst(new Edge(endVertex,weight));
	}
	
	public boolean checkConnected(int startVertex, int endVertex){
		
		for(Edge current : graph[startVertex]){
			if(current.vertex == endVertex){
				return true;
			}
		}
		
		return false;
	}
	

	@Override
	public String toString(){
		String result = "";
		
		for(int i = 0; i < graph.length; i++){
			result += i + " ==>" + graph[i] + "\n";
		}
		
		return result;
	}
}
