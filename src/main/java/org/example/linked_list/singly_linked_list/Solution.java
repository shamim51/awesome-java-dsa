package org.example.linked_list.singly_linked_list;

import org.example.linked_list.linked_list_utils.ListNode;

public class Solution {
   //private ListNode head;

   public ListNode insert(ListNode head, int val) {
       if (head == null) {
           return new ListNode(val);
       }

       ListNode cur = head;
       while (cur.next != null) {
           cur = cur.next;
       }
       cur.next = new ListNode(val);

       return head;
   }

   public void print(ListNode head) {
       ListNode cur = head;
       while (cur != null) {
           System.out.println(cur.val);
           cur = cur.next;
       }
   }
    public static void main(String[] args) {
       ListNode head = null;
        Solution solution = new Solution();

        head = solution.insert(head, 5);
        head = solution.insert(head, 4);
        head = solution.insert(head, 3);
        head = solution.insert(head, 2);
        head = solution.insert(head, 1);
        head = solution.insert(head, 0);
        head = solution.insert(head, 6);
        head = solution.insert(head, 8);
        head = solution.insert(head, 7);
        head = solution.insert(head, 10);

        System.out.println("Printing linked_list");
        solution.print(head);
    }
}
