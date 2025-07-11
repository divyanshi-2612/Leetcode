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
        ListNode curr = head;
        int len=0;
        while (curr != null)
        {
            len++;
            curr = curr.next;
        }
        if (len == 1)
        return null;
        int middle = len/2;
        curr = head;
        for (int i=0; i<middle-1; i++)
        {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}