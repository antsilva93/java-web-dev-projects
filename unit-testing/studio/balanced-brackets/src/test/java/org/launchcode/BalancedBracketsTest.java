package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "An open and close bracket only returns true.";
        String str = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertTrue(result, message);
    }
    @Test
    public void singleOpenBracketTest() {
        String message = "A single open bracket returns false.";
        String str ="[";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertFalse(result, message);
    }
    @Test
    public void singleCloseBracketTest() {
        String message = "A single close bracket returns false.";
        String str = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertFalse(result, message);
    }
    @Test
    public void onlyBracketsInProperOrder() {
        String message = "If brackets are entered in an improper order return false.";
        String str = "][][";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertFalse(result, message);
    }
    @Test
    public void emptyStringReturnsTrue() {
        String message = "An empty string returns true.";
        String str = "";
        boolean result = BalancedBrackets.hasBalancedBrackets("");
        assertTrue(result, message);
    }
    @Test
    public void containsNoBracketsAtAll() {
        String message = "A string without brackets returns true.";
        String str = "ABCDEFG";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertTrue(result, message);
    }
    @Test
    public void containsEqualNumberOfOpenAndCloseBrackets() {
        String message = "A string with an unequal amount of each bracket returns false.";
        String str = "[[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertFalse(result, message);

    }
    @Test
    public void bracketsAlternateInOrder() {
        String message = "A string that alternates between an equal number of open and close brackets returns true.";
        String str = "[][][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertTrue(result, message);
    }
    @Test
    public void bracketsDoNotNest() {
        String message = "Nested brackets returns false.";
        String str = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertFalse(result, message);
    }
    @Test
    public void bracketsBalanceWithText() {
        String message = "A string with properly balanced brackets returns true.";
        String str = "Launch[Code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertTrue(result, message);
    }
    @Test
    public void bracketsDoNotBalanceWithText() {
        String message = "A string with improperly balanced returns false.";
        String str = "Launch[Code";
        boolean result = BalancedBrackets.hasBalancedBrackets(str);
        assertFalse(result, message);
    }

}