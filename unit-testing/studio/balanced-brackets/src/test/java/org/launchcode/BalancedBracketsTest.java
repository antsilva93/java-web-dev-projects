package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyBracketsInImproperOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(("]["))); //broken
    }
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void containsNoBracketsAtAll() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("ABCDE"));
    }
    @Test
    public void containsEqualNumberOfBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void bracketsAlternateInOrder() {
        //code
    }
    @Test
    public void bracketsDoNotNest() {
        //code
    }
    @Test
    public void bracketsBalanceWithText() {
        //code
    }
    @Test
    public void bracketsDontBalanceWithText() {
        //code
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}