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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null)
            return null;
        
        if (head.next == null)
            return null;

        ListNode curr = head;
        int len = 0;
        while (curr.next != null){
            curr = curr.next;
            len++;
        }

        int mid = 0;
        if ((len % 2) == 0)
            mid = len/2;
        else
            mid = (len/2) + 1;

        ListNode node = head;
        while(mid > 1){
           node = node.next;
           mid--;
        }

        node.next = node.next.next;
        //curr.next.next = null;
       
        return head;

    }
}