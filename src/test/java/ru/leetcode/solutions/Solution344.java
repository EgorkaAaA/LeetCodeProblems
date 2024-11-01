package ru.leetcode.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution344 {

    @Test
    public void test() {
        Solution344 solution344= new Solution344();
        assertArrayEquals(new char[]{'o','l','l','e','h'}, solution344.reverseString(new char[]{'h','e','l','l','o'}));
        assertArrayEquals(new char[]{'h','a','n','n','a','H'}, solution344.reverseString(new char[]{'H','a','n','n','a','h'}));
    }

    public char[] reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char that = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = that;
        }
        return s;
    }
}
