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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        Stack<ListNode> st = new Stack<>();
        while(head!=null){
            ListNode next = head.next;
            head.next = null;
            st.push(head);
            head=next;
        }
        if(st.isEmpty()){return null;}
        prev = st.pop();
        ListNode curr = prev;
        while(!st.isEmpty()){
            curr.next=st.pop();
            curr = curr.next;
        }
        return prev;
    }
}