package org.example.backtracking.find_path_sum;

import org.example.tree.tree_utils.TreeFactory;
import org.example.tree.tree_utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = TreeFactory.createTreeFromLevelOrder(List.of(1, 2, 3, 4, 5, 6, 7));
        //TreeFactory.preorderDfs(root);
        Solution solution = new Solution();
        System.out.println(solution.pathSum(root, 7));

    }

    public List<List<Integer>> pathSum(TreeNode root, int target){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(root, new ArrayList<>(), 0, target, result);
        return result;
    }

    private void backtrack(TreeNode node, ArrayList<Integer> path, int total, int target, List<List<Integer>> result) {
        if(node == null) return;

        path.add(node.getVal());
        total+=node.getVal();

        if(total > target){
            path.remove(path.size()-1);
            return;
        }

        if(node.getLeft() == null && node.getRight() == null){
            if(total==target){
                System.out.println("hit");
                result.add(new ArrayList<>(path));
            }

        }else {
            backtrack(node.getLeft(), path, total, target, result);
            backtrack(node.getRight(), path, total, target, result);
        }

        path.remove(path.size()-1);
    }
}
