/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.graph.dijkstra;

import dz.graph.dijkstra.frames.ds_graph.Edge;
import dz.graph.dijkstra.frames.ds_graph.Queue;
import dz.graph.dijkstra.frames.ds_graph.Vertex;
import java.util.ArrayList;

/**
 *
 * @author amine gasa
 */
public class GraphTraverser {
    public static String resDFS="";
    public static String resBFS="";
    public static void depthFirstTraversal(Vertex start, ArrayList<Vertex> visitedVertices) {
		System.out.println(start.getData());
                resDFS+=start.getData()+"\n";

		for (Edge e: start.getEdges()) {
			Vertex neighbor = e.getEnd();

			if (!visitedVertices.contains(neighbor)) {
				visitedVertices.add(neighbor);
				GraphTraverser.depthFirstTraversal(neighbor, visitedVertices);
			}
		}
	}
    public static void breadthFirstSearch(Vertex start, ArrayList<Vertex> visitedVertices) {
		Queue visitQueue = new Queue();
		visitQueue.enqueue(start);
		while (!visitQueue.isEmpty()) {
			Vertex current = visitQueue.dequeue();
			System.out.println(current.getData());
                        resBFS+=current.getData()+"\n";

			for (Edge e: current.getEdges()) {
				Vertex neighbor = e.getEnd();
				if (!visitedVertices.contains(neighbor)) {
					visitedVertices.add(neighbor);
					visitQueue.enqueue(neighbor);
				}
			}
		}
	}
}
