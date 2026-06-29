class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode len = head;
        int length = 0;
        while (len != null) {
            len = len.next;
            length++;
        }

        int count = length / k;

        if (count == 0) {
            return head;
        }

        // Reverse the first k nodes and set new head
        head = reverse(head, k);
        ListNode current = head;

        // Move current to the end of the first reversed group
        for (int i = 1; i < k && current != null; i++) {
            current = current.next;
        }

        for (int i = 1; i < count; i++) {
            ListNode start = current.next;
            ListNode nextGroupHead = start;

            // Move nextGroupHead k steps ahead to find the tail
            int j = 0;
            while (nextGroupHead != null && j < k) {
                nextGroupHead = nextGroupHead.next;
                j++;
            }

            ListNode reversed = reverse(start, k);
            current.next = reversed;

            // Move current to the end of the reversed group
            for (int z = 0; z < k && current != null; z++) {
                current = current.next;
            }
        }

        return head;
    }

    public ListNode reverse(ListNode node, int k) {
        ListNode prev = null;
        ListNode curr = node;
        while (curr != null && k > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }
        // 'node' is now the tail of the reversed group
        node.next = curr; // Connect to the remaining part
        return prev; // New head after reverse
    }
}
