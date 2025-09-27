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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumList = new ListNode();
        ListNode res = sumList;
        int carry = 0;
        while(l1!=null || l2!=null){
            int sum =0;
            if(l1!=null && l2!=null){
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1!=null){
                sum = l1.val + carry;
                l1 = l1.next;
            }
            else{
                sum = l2.val + carry;
                l2 = l2.next;
            }
            carry = sum/10;
            sum%=10;
            ListNode temp = new ListNode(sum);
            sumList.next = temp;
            sumList = sumList.next;
        }

        if(carry>0){
            ListNode temp = new ListNode(carry);
            sumList.next = temp;
            sumList = sumList.next;
        }
        return res.next;
    }
}