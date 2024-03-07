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
        if (head == null || head.next == null)
            return null;

        ListNode curr = head;
        int len = 0;
        while (curr != null){
            curr = curr.next;
            len++;
        }

        ListNode prev = null;
        curr = head;
        for (int i = 0; i < len / 2; i++) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
       
        return head;
    }
}