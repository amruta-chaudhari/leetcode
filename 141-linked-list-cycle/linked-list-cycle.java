/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
           if(head == null){
               return false;
           }

           ListNode curr = head;
           ListNode currNext = head.next;

           while ( curr != currNext ){
               if ( currNext == null || currNext.next == null){
                   return false;
               }
                curr = curr.next;
                currNext = currNext.next.next;
           }
           return true;
    }
}