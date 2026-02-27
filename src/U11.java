class PalindromeChecker {
    public boolean checkPalindrome(String input) {
        if (input == null)
            return false;
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
public class U11 {
    public static void main(String[] args) {
        System.out.println("UC11 - Object Oriented Palindrome Service");
        String input = "level";
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);
        System.out.println("Input String : " + input);
        System.out.println(result ? "Result: Palindrome" : "Result: Not Palindrome");
    }
}