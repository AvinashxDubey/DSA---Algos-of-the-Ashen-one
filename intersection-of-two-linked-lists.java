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
        // Best Explaination
        // Romantic two pointers
        // "If I wander to the end of the world and still cannot find you,
        // I will take another path and search anew.
        // And I shall do the same, my love."
        // Actual intuition:
        // both head A and B move together and whenever one reaches null they restart
        // they are bound to intersect sometime
        // and wherever they meet will be the intersection point
        
        if(headA==null || headB==null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1!=temp2){
            temp1 = temp1==null ? headA : temp1.next;
            temp2 = temp2==null? headB : temp2.next;
        }
        return temp1;
    }
}