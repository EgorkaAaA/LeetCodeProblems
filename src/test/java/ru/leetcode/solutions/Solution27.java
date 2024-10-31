package ru.leetcode.solutions;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution27 {

    public int removeElement(int[] nums, int val) {
        List<Integer> integers = new LinkedList<>();
        for (int num : nums) {
            if (num != val) {
                integers.add(num);
            }
        }
        int i = 0;
        for (Integer integer : integers) {
            nums[i] = integer;
            i++;
        }
        return integers.size();
    }

}
