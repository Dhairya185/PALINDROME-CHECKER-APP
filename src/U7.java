import java.util.Deque;
import java.util.LinkedList;
public class U7 {
    public static void main(String[] args) {
        System.out.println("UC7 - Deque Based Optimized Palindrome Checker");
        String input = "racecar";
        Deque<Character> deque = new LinkedList<>();
        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }
        boolean isPalindrome = true;
        // Compare front and rear
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();
            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input String : " + input);
        System.out.println(isPalindrome ? "Result: Palindrome" : "Result: Not Palindrome");
    }
}