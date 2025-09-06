package org.example.graphs.graph_utils;

import java.util.HashMap;
import java.util.Map;

public class Graph {
    public Map<Integer, GraphNode> nodes;

    public Graph() {
        this.nodes = new HashMap<>();
    }

    public void addNode(int value) {
        this.nodes.put(value, new GraphNode(value));
    }


}
