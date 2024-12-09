package com.lavish;

import java.util.*;

public class GraphCycle {

    private List<Vertex> vertices = new ArrayList<>();

    public void addVertex(Vertex vertex){
        this.vertices.add(vertex);
    }

    public void addEdge(Vertex from, Vertex to){
        from.addNeighbour(to);
    }

    public static void main(String[] args) {
        Vertex node1 = new Vertex("Delhi");
        Vertex node2 = new Vertex("Mumbai");
        Vertex node3 = new Vertex("Zurich");
        Vertex node4 = new Vertex("Amsterdam");
        GraphCycle graphCycle = new GraphCycle();
        graphCycle.addVertex(node1);
        graphCycle.addVertex(node2);
        graphCycle.addVertex(node3);
        graphCycle.addVertex(node4);

        graphCycle.addEdge(node1, node2);
        graphCycle.addEdge(node2, node3);
        //graphCycle.addEdge(node3, node1);
        graphCycle.addEdge(node4, node3);

        System.out.println(graphCycle.isCyclic());
    }

    private boolean isCyclic() {
        for(Vertex vertex:this.vertices){
            if(!vertex.visited && hasCycle(vertex)){
                return true;
            }
        }
        return false;
    }

    private boolean hasCycle(Vertex vertex) {
        vertex.beingVisited = true;
        for(Vertex neighbour: vertex.adjacent){
            if(neighbour.beingVisited) {return true;}
            else if(!neighbour.visited && hasCycle(neighbour)){
                return true;
            }
        }
        vertex.beingVisited = false;
        vertex.visited = true;
        return false;
    }
}

class Vertex {
    private String data;

    public boolean visited;

    public boolean beingVisited;
    public List<Vertex> adjacent = new ArrayList<>();
    public Vertex(String data){
        this.data = data;
    }

    public void addNeighbour(Vertex adjacent){
        this.adjacent.add(adjacent);
    }
}