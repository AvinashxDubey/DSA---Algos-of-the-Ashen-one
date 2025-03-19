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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode temp = head;

        int n=1;
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        
        temp.next = head;
        ListNode newTail = head;
        k%=n;
        int stepsAhead = n-k;
        
        for(int i=1; i<stepsAhead; i++){
            newTail = newTail.next;
        }

        head = newTail.next;
        newTail.next = null;

        return head;
    }
}