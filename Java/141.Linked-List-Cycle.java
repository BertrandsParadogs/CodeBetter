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
        // Floyd's Cycle Detection Algorithm
        ListNode tail = head;
        while (head!=null && head.next!=null) {
            head = head.next.next;
            tail = tail.next;
            if (head == tail && head != null) return true;
        }
        return false;
    }
}