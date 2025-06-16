///Detect and Remove Loop

void detectAndRemoveLoop(Node head) {
    Node slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            removeLoop(slow, head);
            return;
        }
    }
}

void removeLoop(Node loopNode, Node head) {
    Node ptr1 = head;
    while (true) {
        Node ptr2 = loopNode;
        while (ptr2.next != loopNode && ptr2.next != ptr1) ptr2 = ptr2.next;
        if (ptr2.next == ptr1) break;
        ptr1 = ptr1.next;
    }
    ptr2.next = null;
}
