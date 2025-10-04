package org.example.graphs.deep_copy;

import org.example.graphs.graph_utils.GraphNode;

import java.util.*;

public class Solution {
    public GraphNode deepCopyDsa(GraphNode startNode) {
        Map<GraphNode, GraphNode> visited = new HashMap<>();
        if (startNode == null) {
            return null;
        }
        return deepCopyHelper(startNode, visited);
    }

    private GraphNode deepCopyHelper(GraphNode startNode, Map<GraphNode, GraphNode> visited) {
        if(visited.containsKey(startNode)) {
            return visited.get(startNode);
        }

        return new GraphNode(1);
    }
}
