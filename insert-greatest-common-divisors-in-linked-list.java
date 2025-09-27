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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null){
            int num1 = slow.val;
            int num2 = fast.val;
            int gcd = findGcd(num1, num2);
            ListNode gcdNode = new ListNode(gcd, fast);
            slow.next = gcdNode;
            slow = slow.next.next;
            fast = fast.next;
        }
        return head;
    }

    public int findGcd(int num1, int num2){
        int max = Integer.MIN_VALUE;
        int minNum = Math.min(num1, num2);
        for(int i=1; i<=minNum; i++){
            if(num1%i==0 && num2%i==0){
                max = Math.max(max, i);
            }
        }
        return max;
    }
}