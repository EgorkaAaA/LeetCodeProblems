package ru.leetcode.solutions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution303 {

    @Test
    public void test() {
        NumArray numArray= new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        assertEquals(1, numArray.sumRange(0, 2));
        assertEquals(-1, numArray.sumRange(2, 5));
        assertEquals(-3, numArray.sumRange(0, 5));
    }

    class NumArray {

        final int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public int sumRange(int left, int right) {
            int result = 0;
            for (int i = left; i <= right; i++) {
                result += nums[i];
            }
            return result;
        }
    }
}
