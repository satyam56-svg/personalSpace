class Solution {

    public ListNode reverse(ListNode head) {
        ListNode prev = null, agla;
        ListNode curr = head;
        while (curr != null) {
            agla = curr.next;    // Store the next node
            curr.next = prev;    // Reverse the link
            prev = curr;         // Move prev to current node
            curr = agla;         // Move to next node
        }
        return prev;             // Return the new head of reversed list
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // 1. Find the middle of the linked list (slow & fast pointer)
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Split list into two halves and reverse second half
        ListNode second = slow.next;
        slow.next = null;        // Break the list into two parts
        second = reverse(second);

        // 3. Merge the two halves alternately
        ListNode first = head;
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
