package list;

import interfaces.IGraphL;
import interfaces.Tree;
import matrix.GraphM;

public class Main {
	
public static void main(String[] args) throws Exception {
		
		IGraphL<Integer> g = new GraphL<Integer>(7);
//		Heap<Integer> h = new Heap<Integer>(10);
//		
//		h.insertMin(4, 4);
//	//	h.insertMin(1, 1);
//		h.insertMin(3, 3);
//		h.insertMin(6, 6);
//		h.insertMin(5, 5);
//		h.insertMin(7, 7);
//		h.insertMin(10, 10);
//		
//		System.out.println(h.removeMin());
//		
//		g.addNode(1);
//		g.addNode(30);
//		g.addNode(22);
//		g.addNode(6);
//		g.addNode(4);
//		g.addNode(10);
//		g.addNode(11);
//		
//		
//		g.addEdge(1, 30, 2);
//		g.addEdge(30, 4, 7);
//		g.addEdge(4, 30, 50);
//		g.addEdge(1, 22, 6);
//		g.addEdge(30, 6, 12);
//		g.addEdge(4, 6, 5);
//		g.addEdge(6, 4, 9);
//		g.addEdge(22, 4, 1);
	
		
		g.addNode(1);
		g.addNode(2);
		g.addNode(3);
		g.addNode(4);
		g.addNode(5);
		
		g.addEdge(1, 2, 1);
		g.addEdge(2, 3, 2);
		g.addEdge(3, 4, 3);
		g.addEdge(4, 5, 4);
		g.addEdge(2, 5, 1);
		g.addEdge(1, 3, 2);
		
//		int[] disktraj = g.dijkstra(22);
//		NodeM<Integer> n = g.searchNodeM(6);
//		
//		
//		System.out.println(disktraj[n.getPos()]);
//		
//		
//		int[][] floyd = g.floydWarshall();
//		
//		NodeM<Integer> n1 = g.searchNodeM(4);
//		NodeM<Integer> n2 = g.searchNodeM(6);
//		
//		System.out.println(floyd[n1.getPos()][n2.getPos()]);
//		

		GraphL<Integer> g1 = new GraphL<Integer>(7);
		System.out.println("Hola1");
		g1 = (GraphL<Integer>) g.prim();
		
//		
		System.out.println("Hola");
		System.out.println(g1.getAdjacents(1));
//		System.out.println(g.DFS(1));
		
		
	}

}
