import java.util.Deque;
import java.util.LinkedList;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        Deque<Character> deque = new LinkedList<>();

        for(char c : word.toCharArray()) {
            deque.add(c);
        }

        boolean palindrome = true;

        while(deque.size() > 1) {

            if(deque.removeFirst() != deque.removeLast()) {
                palindrome = false;
                break;
            }
        }

        if(palindrome)
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is NOT a Palindrome");
    }
}