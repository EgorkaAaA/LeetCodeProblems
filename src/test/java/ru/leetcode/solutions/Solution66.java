package ru.leetcode.solutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution66 {

    @Test
    public void test() {
        Solution66 solution66 = new Solution66();
        assertArrayEquals(new int[]{9,9,0}, solution66.plusOne(new int[]{9, 8, 9}));
    }

    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }
        int point = 1;
        int[] ints = new int[digits.length];
        int j = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == 0 && point == 1 && digits[0] == 9) {
                ints = Arrays.copyOf(ints, digits.length + 1);
                ints[j + 1] = 1;
            }
            if (digits[i] != 9 || point == 0) {
                ints[j] = digits[i] + point;
                point = 0;
            } else {
                ints[j] = 0;
            }
            j++;
        }
        for(int i = 0; i < ints.length / 2; i++)
        {
            int temp = ints[i];
            ints[i] = ints[ints.length - i - 1];
            ints[ints.length - i - 1] = temp;
        }
        return ints;
    }
}
