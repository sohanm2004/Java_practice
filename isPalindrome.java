/// Check if Palindrome

boolean isPalindrome(Node head) {
    Stack<Integer> stack = new Stack<>();
    Node temp = head;
    while (temp != null) {
        stack.push(temp.data);
        temp = temp.next;
    }
    while (head != null) {
        if (head.data != stack.pop()) return false;
        head = head.next;
    }
    return true;
}
