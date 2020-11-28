/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Determine start val
        int startVal = l1.val + l2.val;
        ListNode retval = new ListNode(startVal % 10);
        
        //Set runners
        ListNode currR = retval;
        ListNode curr1 = l1.next;
        ListNode curr2 = l2.next;
        
        //Set switches
        boolean overflow = startVal > 9;
        boolean keep1 = curr1 != null;
        boolean keep2 = curr2 != null;
        while (keep1 || keep2 || overflow) {
            //Determine next value
            int val = 0;
            if (keep1) { val += curr1.val; } 
            if (keep2) { val += curr2.val; }
            if (overflow) { val++; }

            //Add new node
            currR.next = new ListNode(val % 10);
            currR = currR.next;
            
            //Adjust switches and runners
            if (keep1) {
                curr1 = curr1.next;
                keep1 = curr1 != null;
            }
            if (keep2) {
                curr2 = curr2.next;
                keep2 = curr2 != null;
            }
            overflow = val > 9;
        }
        
        return retval;
    }
}
