/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode plusOne(ListNode head) {
        ListNode lastNotNine = null;
        ListNode sentinel = new ListNode(1);
        sentinel.next = head;
        while (head != null) {
            if (head.val != 9)
                lastNotNine = head;
            head = head.next;
        }
        if (lastNotNine == null) {
            ListNode node = sentinel.next;
            while(node != null) {
                node.val = 0;
                node = node.next;
            }
            return sentinel;
        } else {
            lastNotNine.val++;
            while (lastNotNine.next != null) {
                lastNotNine.next.val = 0;
                lastNotNine = lastNotNine.next;
            }
            return sentinel.next;
        }
    }
}

public ListNode plusOne(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    helper(dummy);
    return dummy.val == 0 ? head : dummy;
}

private int helper(ListNode node){
    if(node == null) return 1;
    node.val += helper(node.next);
    if(node.val <= 9) return 0;
    node.val = 0;
    return 1;
}