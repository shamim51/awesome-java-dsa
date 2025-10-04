package org.example.tree.tree_utils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeFactory {
    public static void main(String[] args) {

        TreeNode tree = TreeFactory.createTree(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("BST Tree:");
        TreeFactory.preorderDfs(tree);

        // Level-order array representation
        List<Integer> levelOrder = Arrays.asList(4, 2, 7, 1, null, 6, 9, null, 8, null, null, null, null, null, null);
        TreeNode tree2 = TreeFactory.createTreeFromLevelOrder(levelOrder);
        System.out.println("\n\nLevel-Order Tree:");
        TreeFactory.preorderDfs(tree2);
    }

    public static TreeNode createTree(List<Integer> values){

        TreeNode root = null;
        for(int value : values){
            root = insertTreeNode(root, value);
        }

        return root;
    }


    public static TreeNode createTreeFromLevelOrder(List<Integer> values) {
        if (values == null || values.isEmpty() || values.get(0) == null) {
            return null;
        }

        TreeNode root = new TreeNode(values.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.size()) {
            TreeNode current = queue.poll();

            // Process left child
            if (i < values.size()) {
                if (values.get(i) != null) {
                    current.setLeft(new TreeNode(values.get(i)));
                    queue.offer(current.getLeft());
                }
                i++;
            }

            // Process right child
            if (i < values.size()) {
                if (values.get(i) != null) {
                    current.setRight(new TreeNode(values.get(i)));
                    queue.offer(current.getRight());
                }
                i++;
            }
        }

        return root;
    }

    private static TreeNode insertTreeNode(TreeNode root, int value) {
        if (root == null) return new TreeNode(value);

        if(root.getVal() == value) return root;

        if(value > root.getVal()) root.setRight(insertTreeNode(root.getRight(), value));

        else root.setLeft(insertTreeNode(root.getLeft(), value));

        return root;
    }

    public static void preorderDfs(TreeNode root){
        if (root == null) return;
        System.out.println(root.getVal());
        preorderDfs(root.getLeft());
        preorderDfs(root.getRight());
    }

    public static void inorderDfs(TreeNode root){
        if (root == null) return;

        inorderDfs(root.getLeft());
        System.out.println(root.getVal());
        inorderDfs(root.getRight());

    }
    public static void postorderDfs(TreeNode root){
        if (root == null) return;
        postorderDfs(root.getLeft());
        postorderDfs(root.getRight());
        System.out.println(root.getVal());
    }
}
