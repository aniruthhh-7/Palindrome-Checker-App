public class UseCase13PalindromeCheckerApp {

    public static boolean isPalindrome(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        long startTime = System.nanoTime();

        boolean result = isPalindrome(word);

        long endTime = System.nanoTime();

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }

        System.out.println("Execution Time: " + (endTime - startTime) + " nanoseconds");
    }
}