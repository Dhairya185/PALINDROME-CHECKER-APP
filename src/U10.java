public class U10 {
    public static void main(String[] args) {
        System.out.println("UC10 - Case Insensitive & Space Ignored Palindrome");
        String input = "A man a plan a canal Panama";
        // Normalize:
        // 1. Convert to lowercase
        // 2. Remove non-alphanumeric characters (spaces included)
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        boolean result = isPalindrome(normalized);
        System.out.println("Original String  : " + input);
        System.out.println("Normalized String: " + normalized);
        System.out.println(result ? "Result: Palindrome" : "Result: Not Palindrome");
    }
    // Two-pointer palindrome check
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}