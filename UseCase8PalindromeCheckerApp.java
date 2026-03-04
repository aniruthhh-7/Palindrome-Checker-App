import java.util.LinkedList;

public class UseCase8PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        LinkedList<Character> list = new LinkedList<>();

        // Convert string to linked list
        for (char c : word.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare first and last characters
        while (list.size() > 1) {

            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}