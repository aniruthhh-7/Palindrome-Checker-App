interface PalindromeStrategy {
    boolean isPalindrome(String word);
}

class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word) {

        java.util.Deque<Character> deque = new java.util.LinkedList<>();

        for(char c : word.toCharArray()) {
            deque.add(c);
        }

        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        PalindromeStrategy strategy = new DequeStrategy();

        if(strategy.isPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}
