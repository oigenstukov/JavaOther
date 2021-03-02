package org.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import static org.example.app04.ConsoleMenu.sequenceCheck;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class App04Test {

    /**
     * Chek for different sequences.
     */
    @Test
    public void seqCheckTest1() {
        String s = "()";
        assertTrue(sequenceCheck(s));
    }
    @Test
    public void seqCheckTest2() {
        String s = "()[]";
        assertTrue(sequenceCheck(s));
    }

    @Test
    public void seqCheckTest3() {
        String s = "([])";
        assertTrue(sequenceCheck(s));
    }

    @Test
    public void seqCheckTest4() {
        String s = "(((()(()))))";
        assertTrue(sequenceCheck(s));
    }

    @Test
    public void seqCheckTest5() {
        String s = "(]";
        assertFalse(sequenceCheck(s));
    }

    @Test
    public void seqCheckTest6() {
        String s = "([)]";
        assertFalse(sequenceCheck(s));
    }

    @Test
    public void seqCheckTest7() {
        String s = "[((())()(())]]";
        assertFalse(sequenceCheck(s));
    }
}
