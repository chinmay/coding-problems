package com.problems.palindrome;

/**
 * Created by chinmay on 5/9/2017.
 */
public class Palindrome {

    /*
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n/2; ++i) {
            if (str.charAt(i) != str.charAt(n-i-1)) return false;
        }
        return true;
    }*/

    public static boolean isPalindrome(String input) {
        if (input.isEmpty()) {
            return true;
        }
        int head = 0, tail = input.length() - 1;
        char characterHead, characterTail;
        while (head <= tail) {
            characterHead = input.charAt(head);
            characterTail = input.charAt(tail);
            if (!Character.isLetterOrDigit(characterHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(characterTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(characterHead) != Character.toLowerCase(characterTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }

        return true;
    }
}

