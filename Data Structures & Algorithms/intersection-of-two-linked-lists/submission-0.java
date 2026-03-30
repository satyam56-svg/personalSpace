public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA = headA;
        ListNode tempB = headB;

        int l1 = 0;
        while(tempA != null) {
            l1++;
            tempA = tempA.next;
        }

        int l2 = 0;
        while(tempB != null) {
            l2++;
            tempB = tempB.next;
        }

        // 🔥 RESET pointers (IMPORTANT)
        tempA = headA;
        tempB = headB;

        if(l1 > l2) {
            int steps = l1 - l2;
            for(int i=0; i<steps; i++) {
                tempA = tempA.next;
            }
        } else {
            int steps = l2 - l1;
            for(int i=0; i<steps; i++) {
                tempB = tempB.next;
            }
        }

        while(tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
    }
}
