/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dz.graph.dijkstra;

import dz.graph.dijkstra.frames.ds_graph.Graph;
import dz.graph.dijkstra.frames.ds_graph.Vertex;
import java.util.ArrayList;

/**
 *
 * @author amine gasa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
//        TestGraph testGraph = new TestGraph();
//        testGraph.printTestGraph();
//        Vertex startingVertex = testGraph.getStartingVertex();
//        ArrayList<Vertex> visitedVertices1 = new ArrayList();
//        ArrayList<Vertex> visitedVertices2 = new ArrayList();
//        System.out.println("DFS:");
//        GraphTraverser.depthFirstTraversal(startingVertex, visitedVertices1);
//        System.out.println("BFS:");
//        GraphTraverser.breadthFirstSearch(startingVertex, visitedVertices2);
  Graph testGraph = new Graph(true, true);
        Vertex a = testGraph.addVertex("A");
        Vertex b = testGraph.addVertex("B");
        Vertex c = testGraph.addVertex("C");
        Vertex d = testGraph.addVertex("D");
        Vertex e = testGraph.addVertex("E");
        Vertex f = testGraph.addVertex("F");
        Vertex g = testGraph.addVertex("G");

        testGraph.addEdge(a, c, 100);
        testGraph.addEdge(a, b, 3);
        testGraph.addEdge(a, d, 4);
        testGraph.addEdge(d, c, 3);
        testGraph.addEdge(d, e, 8);
        testGraph.addEdge(e, b, -2);
        testGraph.addEdge(e, f, 10);
        testGraph.addEdge(b, g, 9);
        testGraph.addEdge(e, g, -50);
        testGraph.print();
         System.out.println("DFS:");
          ArrayList<Vertex> visitedVertices1 = new ArrayList();
        GraphTraverser.depthFirstTraversal(a, visitedVertices1);
       
        Dijkstra.dijkstraResultPrinter(Dijkstra.dijkstra(testGraph, a));
        Dijkstra.shortestPathBetween(testGraph, a, d);
    }

}
