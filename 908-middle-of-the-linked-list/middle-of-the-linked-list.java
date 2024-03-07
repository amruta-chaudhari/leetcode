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
    public ListNode middleNode(ListNode head) {
        if (head == null)
            return null;
        
        if (head.next == null)
            return head;

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

        ListNode midNode = head;
        while(mid > 0){
            midNode = midNode.next;
            mid--;
        }

        return midNode;
    }
}