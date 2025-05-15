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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = new ListNode();
        ListNode dummy = temp;
        int sum=0;
        while(head!=null){
            if(head.val==0){
                sum=0;
            }
            else{
                sum+=head.val;
            }
            if((head.next!=null && head.next.val==0) || (head.next==null && sum!=0)){
                dummy.next = new ListNode(sum);
                dummy = dummy.next;
            }
            head = head.next;
        }
        return temp.next;
    }
}