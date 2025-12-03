package org.example.backtracking.find_bst_paths;

import org.example.tree.tree_utils.TreeFactory;
import org.example.tree.tree_utils.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = TreeFactory.createTreeFromLevelOrder(Arrays.asList(1, 2, 3, null, 5));
        //TreeFactory.inorderDfs(root);

        Solution solution = new Solution();
        System.out.println(solution.binaryTreePaths(root));
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        backtrack(root, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(TreeNode node, ArrayList<Integer> path, List<String> result) {
        if (node == null) return;

        path.add(node.getVal());

        if(node.getLeft() == null && node.getRight() == null){

            StringBuilder str = new StringBuilder();

            for(int i = 0; i < path.size()-1; i++){
                str.append(path.get(i)).append("->");
            }
            str.append(path.get(path.size()-1));

            result.add(String.valueOf(str));
        }
        else{
            backtrack(node.getLeft(), path, result);
            backtrack(node.getRight(), path, result);
        }

        path.remove(path.size() - 1);
    }
}
