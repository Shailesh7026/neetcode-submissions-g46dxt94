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
    public ListNode middleNode(ListNode head) {
        ListNode s = head ;
        ListNode f = head ;

        while(f.next != null){
            if(f.next.next != null){
                f = f.next.next;
            }else{
                f = f.next;
            }
            s = s.next;
        }

        return s;

    }
}