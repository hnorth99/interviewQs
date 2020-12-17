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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Find the length of the list
        int length = getLength(head);
        System.out.println(length);
        
        //Iterate through the list and stop after length - n - 1 iterations
        int iterCount = 0;
        ListNode curr = head;
        while(iterCount < length - n - 1) {
            curr = curr.next;
            iterCount++;
        }
        
        //skip the next node
        if (length == n) {
            head = head.next;
        } else if (curr.next != null) {
            curr.next = curr.next.next;
        } else {
            head = null;
        }
        
        //return the head
        return head;
    }
    
    private int getLength(ListNode head) {
        ListNode curr = head;
        int length = 0;
        
        while (curr != null) {
            curr = curr.next;
            length++;
        }
        
        return length;
    }
}
