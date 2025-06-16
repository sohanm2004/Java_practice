/// Delete at Beginning, End, Specific Position

void deleteAtBeginning() {
    if (head != null) head = head.next;
}

void deleteAtEnd() {
    if (head == null || head.next == null) { head = null; return; }
    Node temp = head;
    while (temp.next.next != null) temp = temp.next;
    temp.next = null;
}

void deleteAtPosition(int pos) {
    if (pos == 1) { head = head.next; return; }
    Node temp = head;
    for (int i = 1; i < pos - 1 && temp != null; i++) temp = temp.next;
    if (temp == null || temp.next == null) return;
    temp.next = temp.next.next;
}
