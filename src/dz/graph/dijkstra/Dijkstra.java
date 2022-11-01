/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.graph.dijkstra;

import dz.graph.dijkstra.frames.ds_graph.Graph;
import dz.graph.dijkstra.frames.ds_graph.Edge;
import dz.graph.dijkstra.frames.ds_graph.QueueObject;
import dz.graph.dijkstra.frames.ds_graph.Vertex;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.PriorityQueue;

/**
 *
 * @author amine gasa
 */
public class Dijkstra {
    public static String resShortestPath="";
   public static Dictionary[] dijkstra(Graph g, Vertex startingVertex) {
       
        Dictionary<String, Integer> distances = new Hashtable<>();
        Dictionary<String, Vertex> previous = new Hashtable<>();
        PriorityQueue<QueueObject> queue = new PriorityQueue<QueueObject>();

        queue.add(new QueueObject(startingVertex, 0));

        for (Vertex v: g.getVertices()) {
            if (v != startingVertex) {
                distances.put(v.getData(), Integer.MAX_VALUE);
            }
            previous.put(v.getData(), new Vertex("Null"));
        }

        distances.put(startingVertex.getData(), 0);

        while (queue.size() != 0) {
            Vertex current = queue.poll().vertex;
            for (Edge e: current.getEdges()) {
                Integer alternative = distances.get(current.getData()) + e.getWeight();
                String neighborValue = e.getEnd().getData();
                if (alternative < distances.get(neighborValue)) {
                    distances.put(neighborValue, alternative);
                    previous.put(neighborValue, current);
                    queue.add(new QueueObject(e.getEnd(), distances.get(neighborValue)));
                }
            }
        }
        
        return new Dictionary[]{distances, previous};
    }   
    public static void dijkstraResultPrinter(Dictionary[] d){
        System.out.println("Distances:\n");
        for (Enumeration keys = d[0].keys(); keys.hasMoreElements();){
            String nextKey = keys.nextElement().toString();
             if((Integer)d[0].get(nextKey)==Integer.MAX_VALUE)
                System.out.println(nextKey + ": " + "infinity");
            else
                System.out.println(nextKey + ": " + d[0].get(nextKey));
            
        }
        System.out.println("\nPrevious:\n");
        for (Enumeration keys = d[1].keys(); keys.hasMoreElements();) {
            String nextKey = keys.nextElement().toString();
            Vertex nextVertex = (Vertex) d[1].get(nextKey);
            System.out.println(nextKey + ": " + nextVertex.getData());
        }
    }
     public static void shortestPathBetween(Graph g, Vertex startingVertex, Vertex targetVertex) {
        Dictionary[] dijkstraDictionaries = dijkstra(g, startingVertex);
        Dictionary distances = dijkstraDictionaries[0];
        Dictionary previous = dijkstraDictionaries[1];

        Integer distance = (Integer) distances.get(targetVertex.getData());
        if(distance==Integer.MAX_VALUE){
        System.out.println("There Is No Path between " + startingVertex.getData() + " and " + targetVertex.getData());
       
        resShortestPath+="There Is No Path between " + startingVertex.getData() + " and " + targetVertex.getData()+
              ""  ;
        }
        else{
        System.out.println("Shortest Distance between " + startingVertex.getData() + " and " + targetVertex.getData());
        System.out.println(distance);
        resShortestPath+="Shortest Distance between " + startingVertex.getData() + " and " + targetVertex.getData()
                +" is "+distance;
        }

        ArrayList<Vertex> path = new ArrayList<>();
        Vertex v = targetVertex;

        while (!v.getData() .equals("Null")) {
            path.add(0, v);
            v = (Vertex) previous.get(v.getData());
        }
        System.out.println("Shortest Path");
        resShortestPath+="\n The Path are :\n";
        for (Vertex pathVertex: path){
            System.out.println(pathVertex.getData());
            resShortestPath+=pathVertex.getData()+"\n";
        }
}
}