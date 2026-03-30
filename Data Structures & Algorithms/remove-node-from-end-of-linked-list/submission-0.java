class Solution {

    // public ListNode reverse(ListNode head) {
    //     ListNode prev = null, curr = head;
    //     while (curr != null) {
    //         ListNode agla = curr.next; // Store next node
    //         curr.next = prev;           // Reverse pointer
    //         prev = curr;                // Move prev forward
    //         curr = agla;                // Move curr forward
    //     }
    //     return prev; // New head after reverse
    // }

    // // Delete the nth node starting from head (1-indexed)
    // public ListNode delete(ListNode head, int n) {
    //     // Agar n=1 matlab pehli node delete karni hain
    //     if (n == 1) {
    //         return head.next; // Head skip kar do, dusra node new head
    //     }

    //     ListNode temp = head;
    //     // Move (n-2) times to reach node just before the one to delete
    //     for (int i = 1; i < n - 1; i++) {
    //         temp = temp.next;
    //     }

    //     // Skip the nth node
    //     temp.next = temp.next.next;
    //     return head;
    // }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // // Agar sirf ek node hai aur usi ko hataana hai
        // if (head.next == null && n == 1) {
        //     return null;
        // }

        // // Step 1: Reverse the linked list
        // ListNode reversedList = reverse(head);

        // // Step 2: Delete the nth node from start (which is nth from end in original list)
        // ListNode afterDeletion = delete(reversedList, n);

        // // Step 3: Reverse the list again to restore original order (without the deleted node)
        // return reverse(afterDeletion);

        ListNode slow=head;
        ListNode fast=head;

        for(int i=1; i<=n; i++) {
            fast=fast.next;
        }

        // Agar fast null ho gaya to matlab head ko delete karna hai
    if (fast == null) {
        // Head ko skip karo, dusra node naya head
        return head.next;
    }

        while(fast.next!=null) {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;

        return head;
    }
}
