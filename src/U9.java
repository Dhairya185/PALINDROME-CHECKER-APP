public class U9 {
    public static void main(String[] args) {
        System.out.println("UC9 - Recursive Palindrome Checker");
        String input = "madam";
        boolean result = isPalindrome(input, 0, input.length() - 1);
        System.out.println("Input String : " + input);
        System.out.println(result ? "Result: Palindrome" : "Result: Not Palindrome");
    }
    // Recursive method
    public static boolean isPalindrome(String str, int start, int end) {
        // Base condition
        if (start >= end) {
            return true;
        }
        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }
}