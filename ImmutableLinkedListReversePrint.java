/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * interface ImmutableListNode {
 *     public void printValue(); // print the value of this node.
 *     public ImmutableListNode getNext(); // return the next node.
 * };
 */

class Solution {
    public void printLinkedListInReverse(ImmutableListNode head) {
        helper(head);
    }
    
    private void helper(ImmutableListNode curr) {
        if (curr != null) {
            helper(curr.getNext());
            curr.printValue();
        }
    }
}
