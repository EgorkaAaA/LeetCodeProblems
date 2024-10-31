package ru.leetcode.solutions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Solution26 {

    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int counter = 0;
        for (Integer i : set) {
            nums[counter] = i;
            counter++;
        }
        return set.size();
    }

}
