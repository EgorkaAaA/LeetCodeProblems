package ru.leetcode.solutions;

public class Solution35 {

    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == target || nums[i] < target) {
                return i;
            }
            i++;
        }
        return ++i;
    }
}
