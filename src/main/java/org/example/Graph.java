package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Graph {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    Set<Integer> visited = new HashSet<>();
    public Graph(List<Integer> nodes){
       nodes.forEach(n -> graph.put(n, new ArrayList<>()));
    }

    public void addEdge(int a, int b){
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    public void dfs(int node){
        if(visited.contains(node)) return;

        visited.add(node);
        graph.get(node).forEach(this::dfs);
    }

    public Set<Integer> search(int startNode){
        dfs(startNode);

        return visited;
    }

    public static void main(String[] args) {
        Graph graph = new Graph(List.of(1,2,3,4,5));

        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,4);
        graph.addEdge(2,5);
        graph.addEdge(3,4);
        graph.addEdge(4,5);

        System.out.println(graph.search(1));
    }
}
