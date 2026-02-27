import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;
public class U13 {
    public static void main(String[] args) {
        System.out.println("UC13 - Performance Comparison of Palindrome Algorithms");
        System.out.println("--------------------------------------------------------");
        String input = "racecar";
        long start1 = System.nanoTime();
        boolean result1 = stringReverseMethod(input);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();
        long start3 = System.nanoTime();
        boolean result3 = dequeMethod(input);
        long end3 = System.nanoTime();
        System.out.println("Input String: " + input);
        System.out.println();
        System.out.println("String Reverse Method : " + result1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method          : " + result2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Deque Method          : " + result3 + " | Time: " + (end3 - start3) + " ns");
    }
    public static boolean stringReverseMethod(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }
    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
    public static boolean dequeMethod(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}