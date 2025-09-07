package org.example.graphs.graph_utils;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    public int value;
    public List<GraphNode> neighbors;

    public GraphNode(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }
    public void addNeighbor(GraphNode node) {
        neighbors.add(node);
    }

    @Override
    public String toString() {
        return "Node(" + value + ")";
    }
}
