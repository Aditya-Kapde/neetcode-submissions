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
        ListNode temp=head;//creating a duplicate node as the original node shold not be changed
        int length=getlength(head);//getting the length of the node 
        int count=0,iteration=length-n;//iteration tells that the how much more should we traverse
        if(count==iteration)
        {
            temp=temp.next;
            return temp;
        }
        ListNode prev=temp;
        while(temp!=null)//to traverse to the target node
        {
            prev=temp;
            temp=temp.next;
            count++;
            if(count==iteration)
            {
                break;
            }
        }
        prev.next=temp.next;

        return head;
    }
    int getlength(ListNode head)
    {
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
}
