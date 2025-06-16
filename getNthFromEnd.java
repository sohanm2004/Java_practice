///Find Nth Node from End

int getNthFromEnd(int n) {
    Node main = head, ref = head;
    for (int i = 0; i < n; i++) {
        if (ref == null) return -1;
        ref = ref.next;
    }
    while (ref != null) {
        main = main.next;
        ref = ref.next;
    }
    return main.data;
}
