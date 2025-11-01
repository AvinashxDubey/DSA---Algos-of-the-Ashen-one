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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy;
        ListNode fast = dummy.next;

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        while(fast!=null){
            if(set.contains(fast.val)){
                slow.next = fast.next;
                fast = fast.next;
            }
            else{
                slow = slow.next;
                fast = fast.next;
            }
        }

        return dummy.next;
    }
}