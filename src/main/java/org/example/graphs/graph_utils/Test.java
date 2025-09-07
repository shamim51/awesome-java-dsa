package org.example.graphs.graph_utils;

public class Test {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Example: undirected graph
        graph.addUndirectedEdge(1, 2);
        graph.addUndirectedEdge(1, 3);
        graph.addUndirectedEdge(2, 4);
        graph.addUndirectedEdge(3, 5);

        graph.printGraph();

        graph.bfs(1);
        graph.dfs(1);
    }
}
