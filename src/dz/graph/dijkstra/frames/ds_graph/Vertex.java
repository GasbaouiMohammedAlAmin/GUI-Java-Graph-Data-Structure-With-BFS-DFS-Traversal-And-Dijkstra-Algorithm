/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.graph.dijkstra.frames.ds_graph;

import java.util.ArrayList;

/**
 *
 * @author amine gasa
 */
public class Vertex {
     private String data;
    private ArrayList<Edge> edges;

    public Vertex(String inputData) {
        this.data = inputData;
        this.edges = new ArrayList<Edge>();
    }
     public void addEdge(Vertex endVertex, Integer weight) {
        this.edges.add(new Edge(this, endVertex, weight));
    }
     public void removeEdge(Vertex endVertex) {
        this.edges.removeIf(edge->edge.getEnd().equals(endVertex));
    }

    public String getData() {
		return this.data;
	}

	public ArrayList<Edge> getEdges(){
		return this.edges;
	}
public String print(boolean showWeight) {
		String message = "";
		
		if (this.edges.size() == 0) {
			System.out.println(this.data + " -->");
			return"";
		}
		
		for(int i = 0; i < this.edges.size(); i++) {
			if (i == 0) {
				message += this.edges.get(i).getStart().data + " -->  ";
			}

			message += this.edges.get(i).getEnd().data;

			if (showWeight) {
				message += " (" + this.edges.get(i).getWeight() + ")";
			}

			if (i != this.edges.size() - 1) {
				message += ", ";
			}
		}
		System.out.println(message);
	return message;}
}
