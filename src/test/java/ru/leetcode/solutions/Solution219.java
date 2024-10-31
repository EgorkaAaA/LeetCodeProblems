package ru.leetcode.solutions;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Solution219 {

    @Test
    public void test() {
        Solution219 solution219 = new Solution219();
        assertTrue(solution219.containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
        assertTrue(solution219.containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
        assertFalse(solution219.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> positionMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (positionMap.containsKey(nums[i])) {
                Integer position = positionMap.get(nums[i]);
                if (Math.abs(i - position) <= k) {
                    return true;
                }
            }
            positionMap.put(nums[i], i);
        }
        return false;
    }
}
