/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.graph.dijkstra.frames.ds_graph;

/**
 *
 * @author amine gasa
 */
public class QueueObject implements Comparable<QueueObject>{
    public Vertex vertex;
    public int priority;

    public QueueObject(Vertex v, int p){
        this.vertex = v;
        this.priority = p;
    }
    @Override
    public int compareTo(QueueObject o) {
         if (this.priority == o.priority){
            return 0;
        }
        else if (this.priority > o.priority){
            return 1;
        }
        else {
            return -1;
        }
    }
    
}
