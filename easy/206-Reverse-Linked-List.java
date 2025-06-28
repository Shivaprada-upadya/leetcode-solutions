// Problem: Reverse Linked List
// Link: https://leetcode.com/problems/reverse-linked-list/
// Date: 2025-04-28
// Approach: Using Rotation and Temp Node

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
         ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;  // Store next node
            curr.next = prev;  // Reverse current node's pointer
            prev = curr;       // Move prev and curr one step forward
            curr = next;
        }

        return prev;

        
    }
}
