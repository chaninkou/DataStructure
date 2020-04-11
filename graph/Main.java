package graph;

public class Main {
	public static void main(String[] args) {
		// For practice with integer type for array
//		List<Integer>[] list = new LinkedList[10];
//		
//		for(int i = 0; i < list.length; i++){
//			list[i] = new LinkedList<>();
//		}
//		
//		list[0].add(3); list[0].add(5); list[0].add(6);
//		
//		list[1].add(5); list[1].add(6); list[1].add(7);
//		
//		for(int i = 0; i < list.length; i++){
//			System.out.println(i + " ==> " + list[i]);
//		}

		GraphWithAdjacencyList g = new GraphWithAdjacencyList(10);
		
		g.addEdge(0, 2, 10);
		g.addEdge(0, 5, 15);
		g.addEdge(2, 5, 10);
		g.addEdge(9, 3, 16);
		
		System.out.println(g);
	}
}
