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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ListNode res = lists[0];
        
        for(int i=1; i<lists.length; i++){
            ListNode dummy = new ListNode(0);
            ListNode curr= dummy;
            while(res!=null && lists[i]!=null){
                if(lists[i].val<=res.val){
                    curr.next = lists[i];
                    lists[i]=lists[i].next;
                }
                else{
                    curr.next = res;
                    res=res.next;
                }
                curr=curr.next;
            }
            curr.next = res==null ? lists[i] : res;
            
           res = dummy.next;
        }
        return res;
    }
}