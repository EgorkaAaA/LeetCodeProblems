package ru.leetcode.solutions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Solution231 {

    @Test
    public void test() {
        Solution231 solution231 = new Solution231();
        assertTrue(solution231.isPowerOfTwo(1));
        assertTrue(solution231.isPowerOfTwo(16));
        assertFalse(solution231.isPowerOfTwo(3));
    }

    public boolean isPowerOfTwo(int n) {
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
}
