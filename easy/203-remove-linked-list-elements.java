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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode h1 = new ListNode(0);

        ListNode copy = h1;

        while(head!=null)
        {
            if(head.val!=val)
            {
                copy.next = new ListNode(head.val);
                copy =copy.next;
            }
            head=head.next;
        }

        return h1.next;

    }
}