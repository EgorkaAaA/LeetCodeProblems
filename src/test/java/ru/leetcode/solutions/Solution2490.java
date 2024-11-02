package ru.leetcode.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution2490 {

    @Test
    public void test() {
        Solution2490 solution2490= new Solution2490();
        assertTrue(solution2490.isCircularSentence("leetcode exercises sound delightful"));
        assertTrue(solution2490.isCircularSentence("eetcode"));
        assertFalse(solution2490.isCircularSentence("Leetcode is cool"));
        assertFalse(solution2490.isCircularSentence("Leetcode"));
    }

    public boolean isCircularSentence(String sentence) {
        String[] split = sentence.split(" ");
        if (split.length == 1) {
            return split[0].charAt(split[0].length() - 1) == split[0].charAt(0);
        }
        for (int i = 0; i < split.length - 1; i++) {
            if (split[i].charAt(split[i].length() - 1) != split[i + 1].charAt(0)) {
                return false;
            }
        }
        return split[split.length - 1].charAt(split[split.length - 1].length() - 1) == split[0].charAt(0);
    }
}
