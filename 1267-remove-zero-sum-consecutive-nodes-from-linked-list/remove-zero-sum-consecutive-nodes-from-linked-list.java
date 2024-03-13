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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        int prefixSum = 0;

        Map<Integer, ListNode> prefixSumMap = new HashMap<>();

        for (ListNode i = temp; i != null; i = i.next) {
            prefixSum += i.val;
            prefixSumMap.put(prefixSum, i);
        }

        prefixSum = 0;
        for (ListNode i = temp; i != null; i = i.next) {
            prefixSum += i.val;
            i.next = prefixSumMap.get(prefixSum).next;
        }

        return temp.next;
    }
}