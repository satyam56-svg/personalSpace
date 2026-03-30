// Definition for a Node.
// class Node {
//     int val;
//     Node next;
//     Node random;

//     public Node(int val) {
//         this.val = val;
//         this.next = null;
//         this.random = null;
//     }
// }

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Original list ke har node ke baad uska copy node insert karo.
        Node temp1 = head;
        while (temp1 != null) {
            Node copyNode = new Node(temp1.val);
            copyNode.next = temp1.next;
            temp1.next = copyNode;
            temp1 = copyNode.next;
        }

        // Step 2: Copy nodes ke random pointer set karo.
        temp1 = head;
        while (temp1 != null) {
            if (temp1.random != null) {
                temp1.next.random = temp1.random.next;
            } else {
                temp1.next.random = null;
            }
            temp1 = temp1.next.next;
        }

        // Step 3: Original aur copied list ko alag karo.
        temp1 = head;
        Node newNode = head.next;      // copied list ka head
        Node temp2 = newNode;
        while (temp1 != null) {
            temp1.next = temp1.next.next;
            if (temp2.next != null) {
                temp2.next = temp2.next.next;
            } else {
                temp2.next = null;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        // Step 4: Copied list ka head return karo.
        return newNode;
    }
}
