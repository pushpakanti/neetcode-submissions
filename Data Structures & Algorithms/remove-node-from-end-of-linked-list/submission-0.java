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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr= head;
        ListNode temp= head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }

        if(count==n)
        {
            head= head.next;
        }
        else
        {
            int del= count-n;
            int i=1;
            while(i!=del)
            {
                temp= temp.next;
                i++;
            }
            temp.next= temp.next.next;
        }
        return head;
    }
}
