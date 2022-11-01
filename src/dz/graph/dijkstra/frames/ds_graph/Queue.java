/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz.graph.dijkstra.frames.ds_graph;

import java.util.LinkedList;

/**
 *
 * @author amine gasa
 */
public class Queue {
   

    public LinkedList<Vertex> queue;
    public int size;
  
    public Queue() {
      this.queue = new LinkedList();
      this.size = 0;
    }
  
    public boolean isEmpty() {
      return this.size == 0;
    }
  
    public void enqueue(Vertex data) {
      this.queue.addLast(data);
      this.size++;
    }
  
    public Vertex peek() {
      if (this.isEmpty()) {
        return null;
      } else {
        return this.queue.element();
      }    
    }
  
    public Vertex dequeue() {
      if (!this.isEmpty()) {
        Vertex data = this.queue.removeFirst();
        this.size--;
        return data;
      } else {
        throw new Error("LinearDataStructures.Queues.Queue is empty!");
      }
    }
  
  }
