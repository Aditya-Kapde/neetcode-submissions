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
        int n=lists.length;
        if(lists==null || lists.length==0) return null;
        ListNode head=new ListNode();
        ListNode ml=head;
        while(true)
        {
            int minind=-1;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                if(lists[i]!=null && lists[i].val<min)
                {
                    min=lists[i].val;
                    minind=i;
                }
            }
            if(minind==-1) break;
            ml.next=new ListNode(min);
            ml=ml.next;
            lists[minind]=lists[minind].next;
        }
        return head.next;
    }
}
