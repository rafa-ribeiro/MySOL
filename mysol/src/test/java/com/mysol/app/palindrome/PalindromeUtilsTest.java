package com.mysol.app.palindrome;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeUtilsTest {

    PalindromeUtils utils;

    @Before
    public void instantiatePalindromeUtils() {
        this.utils = new PalindromeUtils();
    }

    @Test
    public void testWithPalindromeWord() {
        boolean isPalindrome = utils.isAlmostPalindrome("kayak");
        assertTrue(isPalindrome);
    }

    @Test
    public void testWithAlmostPalindromeWord() {
        boolean isPalindrome = utils.isAlmostPalindrome("kaybk");
        assertTrue(isPalindrome);
    }

    @Test
    public void testWithNotAlmostPalindrome() {
        boolean isPalindrome = utils.isAlmostPalindrome("kayka");
        assertFalse(isPalindrome);
    }

    @Test
    public void testWithNotPalindrome() {
        boolean isPalindrome = utils.isAlmostPalindrome("abccfg");
        assertFalse(isPalindrome);
    }
}
