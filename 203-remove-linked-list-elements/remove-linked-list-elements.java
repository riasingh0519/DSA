class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node before the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                // Skip the node with value = val
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return dummy.next;
    }
}