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
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode follower = start;
        ListNode runner = start;

        for(int i = 1; i <= n + 1; i++)   {
            runner = runner.next;
        }

        while(runner != null) {
            follower = follower.next;
            runner = runner.next;
        }

        //Skip the desired node
        follower.next = follower.next.next;
        return start.next;
    }
}
