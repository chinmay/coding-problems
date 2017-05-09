package com.problems.palindrome;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by chinmay on 5/9/2017.
 */
public class PalindromeTest {

    @Test
    public void testNumbersAsString() {

        assertEquals(false, Palindrome.isPalindrome("1212"));
        assertEquals(true, Palindrome.isPalindrome("1221"));
    }

    @Test
    public void testSimpleCharacterString() {

        assertEquals(false, Palindrome.isPalindrome("abcabcab"));
        assertEquals(true, Palindrome.isPalindrome("abcddcba"));
    }

    @Test
    public void testFullSentenceWithSpecialCharacters() {

        assertEquals(true, Palindrome.isPalindrome("a man, a plan, a canal panama"));
        assertEquals(true, Palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
