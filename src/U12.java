import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;
interface PalindromeStrategy {
    boolean check(String input);
}
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
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
}
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
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
class PalindromeContext {
    private PalindromeStrategy strategy;
    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }
    public boolean execute(String input) {
        return strategy.check(input);
    }
}
public class U12 {
    public static void main(String[] args) {
        System.out.println("UC12 - Strategy Pattern Palindrome Checker");
        String input = "racecar";
        PalindromeStrategy strategy = new DequeStrategy();
        PalindromeContext context = new PalindromeContext(strategy);
        boolean result = context.execute(input);
        System.out.println("Input String : " + input);
        System.out.println(result ? "Result: Palindrome" : "Result: Not Palindrome");
    }
}