/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Both pointers A and B traverse their respective lists.
        // When one reaches the end, it restarts at the head of the other list.
        // so they both traverse exactly A + B steps
        // If there is an intersection, they will meet at the common node.
        // If not, both will eventually reach null at the same time.

        if (headA == null || headB == null)
            return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while (temp1 != temp2) {
            temp1 = temp1 == null ? headA : temp1.next;
            temp2 = temp2 == null ? headB : temp2.next;
        }
        return temp1;
    }
}