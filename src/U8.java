public class U8 {
    // Node class for Singly Linked List
    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        System.out.println("UC8 - Linked List Based Palindrome Checker");
        String input = "racecar";
        // Convert string to linked list
        Node head = null;
        Node tail = null;
        for (int i = 0; i < input.length(); i++) {
            Node newNode = new Node(input.charAt(i));
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        boolean isPalindrome = checkPalindrome(head);
        System.out.println("Input String : " + input);
        System.out.println(isPalindrome ? "Result: Palindrome" : "Result: Not Palindrome");
    }
    // Check palindrome using fast/slow pointer + reverse second half
    public static boolean checkPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;
        Node slow = head;
        Node fast = head;
        // Find middle of linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Reverse second half
        Node secondHalf = reverseList(slow);
        Node firstHalf = head;
        // Compare both halves
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    // Reverse linked list in-place
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}