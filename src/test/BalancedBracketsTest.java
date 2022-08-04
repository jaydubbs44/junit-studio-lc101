package test;

import org.junit.Test;
import main.BalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void stringWithBracketsSurroundingReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hi]"));
    }
    @Test
    public void bracketsSplittingStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("wi[ll]"));
    }
    @Test
    public void bracketsAfterTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("brackets coming right up[]"));
    }
    @Test
    public void bracketsInMiddleOfTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Apple[]sauce"));
    }
    @Test
    public void multipleSeparatedBracketPairsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Apple[]sauce, [my guy]"));
    }
    @Test
    public void bracketPairSurroundingBracketPairReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Apple[]sauce"));
    }
    @Test
    public void multipleBalancedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void onlyOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void leftBracketInMiddleOfStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("wi[ll"));
    }
    @Test
    public void rightBracketInsideStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("wi]ll"));
    }
    @Test
    public void bracketPairInWrongOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

}