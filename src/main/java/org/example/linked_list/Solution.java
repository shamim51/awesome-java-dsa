package org.example.linked_list;

import org.example.linked_list.linked_list_utils.ListNode;

public class Solution {

    public void print(ListNode node){
        if (node == null){
            node = new ListNode(0);
        }
        System.out.println(node.val);

        node.val = 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode node1 = new ListNode(1);
        solution.print(node1);
        System.out.println(node1.val);

        System.out.println("-----------------------------------------------");

        ListNode node2 = null;
        solution.print(node2);
        System.out.println(node2.val);
    }
}
