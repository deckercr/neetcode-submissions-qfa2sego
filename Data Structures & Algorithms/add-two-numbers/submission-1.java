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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //1. Initialize a dummy head
        // This gives us a stable starting point so we never have
        // to handle the very first node as a special case
        ListNode result = new ListNode(0);
        ListNode current = result;

        // The carry holds the overflow from each digit adding (0 or 1)
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            
            int digit1;
            if (l1 != null) {
                digit1 = l1.val;
            }else {
                digit1 = 0;
            }

            int digit2;
            if (l2 != null) {
                digit2 = l2.val;
            }else {
                digit2 = 0;
            }

            int sum = digit1 + digit2 + carry;

            carry = sum / 10;

            int newDigit = sum % 10;

            current.next = new ListNode(newDigit);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return result.next;
        
    }
}
