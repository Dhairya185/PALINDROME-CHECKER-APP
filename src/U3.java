public class U3 {

    public static void main(String[] args) {

        System.out.println("UC3 - Palindrome Check Using String Reverse");

        String input = "level";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        if (input.equals(reversed)) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not Palindrome");
        }
    }
}