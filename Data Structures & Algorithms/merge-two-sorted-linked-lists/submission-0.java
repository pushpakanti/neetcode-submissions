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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy1= list1;
        ListNode dummy2= list2;
        ListNode dummy= new ListNode(0);
        ListNode tail= dummy;


        while(dummy1!=null && dummy2!=null)
        {
            if(dummy1.val>dummy2.val)
            {
                tail.next= dummy2;
                tail=tail.next;
                dummy2= dummy2.next;
            }
            else
            {
                tail.next= dummy1;
                tail=tail.next;
                dummy1= dummy1.next;

            }
        }
        if(dummy1==null && dummy2!=null)
        {
            tail.next=dummy2;
        }
        if(dummy2==null && dummy1!=null)
        {
            tail.next=dummy1;
        }

        return dummy.next;
    }
}



