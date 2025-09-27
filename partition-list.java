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
    public ListNode partition(ListNode head, int x) {
        ListNode greater = new ListNode(0);
        ListNode grt = greater;
        ListNode temp = new ListNode(0);
        ListNode tmp = temp;
        ListNode smaller = new ListNode(0);
        ListNode sml = smaller;
        while(head!=null){
            if(head.val<x) {
                smaller.next=head;
                smaller=smaller.next;
            }
            else {
                temp.next=head;
                temp=temp.next;
            }
            head=head.next;
        }
        temp.next=null;
        if(tmp.next!=null){
            smaller.next=tmp.next;
        }
        return sml.next;
    }
}