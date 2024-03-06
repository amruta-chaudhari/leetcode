/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode curr = head;
        ListNode currNext = head;
        boolean hasCycle = false;

        while (currNext != null && currNext.next != null) {
            curr = curr.next;
            currNext = currNext.next.next;

            if (curr == currNext) {
                hasCycle = true;
                break;
            }
        }

        if (hasCycle) {
            curr = head;
            while (curr != currNext) {
                curr = curr.next;
                currNext = currNext.next;
            }
            return curr;
        } else {
            return null;
        }
    }
}