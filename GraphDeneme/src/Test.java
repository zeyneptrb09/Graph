
public class Test {
	public static void main(String[] args) {

		Graph graph = new Graph(9);
		graph.addEdge("A", "D", 4);
		graph.addEdge("A", "B", 8);
		graph.addEdge("A", "E", 11);
		graph.addEdge("B", "E", 8);
		graph.addEdge("C", "B", 7);
		graph.addEdge("D", "G", 1);
		graph.addEdge("E", "F", 2);
		graph.addEdge("E", "H", 6);
		graph.addEdge("F", "C", 7);
		graph.addEdge("F", "H", 4);
		graph.addEdge("G", "H", 2);
		graph.addEdge("H", "I", 14);
		graph.addEdge("I", "F", 9);
		
        System.out.println("Original Graph: ");
        graph.print();
        graph.BFS("A");
        System.out.println();
        graph.DFS("A");
	}
}
