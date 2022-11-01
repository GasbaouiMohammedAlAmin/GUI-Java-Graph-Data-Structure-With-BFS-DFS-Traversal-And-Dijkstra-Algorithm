/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.graph.dijkstra.frames.ds_graph;

/**
 *
 * @author amine gasa
 */
public class Edge {
    private Vertex start;
	private Vertex end;
	private Integer weight;

	public Edge(Vertex startV, Vertex endV, Integer inputWeight) {
		this.start = startV;
		this.end = endV;
		this.weight = inputWeight;
	}

	public Vertex getStart() {
		return this.start;
	}
	
	public Vertex getEnd() {
		return this.end;
	}
	
	public Integer getWeight() {
		return this.weight;
	}
}
