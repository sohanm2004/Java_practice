///Intersection Point of Two Lists

Node getIntersectionNode(Node headA, Node headB) {
    Node a = headA, b = headB;
    while (a != b) {
        a = (a == null) ? headB : a.next;
        b = (b == null) ? headA : b.next;
    }
    return a;
}

