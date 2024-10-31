package ru.leetcode.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution69 {

    @Test
    public void test() {
        Solution69 solution69 = new Solution69();
        assertEquals(2, solution69.mySqrt(4));
        assertEquals(2, solution69.mySqrt(8));
    }

    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int start = 1;
        int end = x;
        int mid = 0;
        while (start != end) {
            int middle = start + (end - start) / 2;

            mid = middle * middle;
            if (mid == x) {
                return middle;
            }
            if (mid < x) {
                if (start == middle) {
                    end = middle;
                }
                start = middle;
            } else {
                end = middle;
            }
        }
        return start;
    }

}
