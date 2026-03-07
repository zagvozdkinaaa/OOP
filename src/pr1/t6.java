package pr1;

import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2 ; i++) {
            if  (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
