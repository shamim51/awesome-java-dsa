package org.example.graphs.graph_utils;

import java.util.*;

public class Graph {
    public Map<Integer, GraphNode> nodes;

    public Graph() {
        this.nodes = new HashMap<>();
    }

    public GraphNode addNode(int value) {
        nodes.putIfAbsent(value, new GraphNode(value));
        return nodes.get(value);
    }

    public void addEdge(int from, int to) {
        GraphNode fromNode = addNode(from);
        GraphNode toNode = addNode(to);
        fromNode.addNeighbor(toNode);
    }

    public void addUndirectedEdge(int a, int b) {
        addEdge(a, b);
        addEdge(b, a);
    }

    public void printGraph() {
        for (GraphNode node : nodes.values()) {
            System.out.print(node + " -> ");
            for (GraphNode neighbor : node.neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public void bfs(int StartValue){
        GraphNode startNode = nodes.get(StartValue);
        if (startNode == null) {
            return;
        }

        Set<GraphNode> visited = new HashSet<>();
        Queue<GraphNode> queue = new LinkedList<>();

        visited.add(startNode);
        queue.add(startNode);

        System.out.print("BFS: ");
        while (!queue.isEmpty()) {
            GraphNode current = queue.poll();
            System.out.print(current.value + " ");

            for (GraphNode neighbor : current.neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int value){
        GraphNode startNode = nodes.get(value);
        if (startNode == null) {
            return;
        }
        Set<GraphNode> visited = new HashSet<>();
        System.out.print("DFS: ");

        dfsHelper(startNode, visited);

        System.out.println();
    }

    private void dfsHelper(GraphNode startNode, Set<GraphNode> visited) {
        visited.add(startNode);
        System.out.print(startNode.value + " ");
        for (GraphNode neighbor : startNode.neighbors) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

}
