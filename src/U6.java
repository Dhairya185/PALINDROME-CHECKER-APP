import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class U6 {

    public static void main(String[] args) {

        System.out.println("UC6 - Queue and Stack Based Palindrome Check");

        String input = "racecar";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not Palindrome");
        }
    }
}