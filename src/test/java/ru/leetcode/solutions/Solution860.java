package ru.leetcode.solutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.*;

public class Solution860 {

    @Test
    public void test() {
        Solution860 solution860 = new Solution860();
        assertTrue(solution860.lemonadeChange(new int[]{5, 5, 5, 10, 20}));
        assertFalse(solution860.lemonadeChange(new int[]{5, 5, 10, 10, 20}));
        assertTrue(solution860.lemonadeChange(new int[]{5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5}));
    }

    public boolean lemonadeChange(int[] bills) {
        final Map<Integer, Integer> cassa = new HashMap<>();
        for (int bill : bills) {
            if (bill == 5) {
                cassa.merge(5, 1, Integer::sum);
            }

            if (bill == 10) {
                cassa.merge(10, 1, Integer::sum);
                if (cassa.getOrDefault(5, 0) >= 1) {
                    cassa.merge(5, 1, (f, s) -> f - s);
                    continue;
                }
                return false;
            }

            if (bill == 20) {
                if (cassa.getOrDefault(10, 0) >= 1 && cassa.getOrDefault(5, 0) >= 1) {
                    cassa.merge(5, 1, (f, s) -> f - s);
                    cassa.merge(10, 1, (f, s) -> f - s);
                    continue;
                }
                if (cassa.getOrDefault(5, 0) >= 3) {
                    cassa.merge(5, 3, (f, s) -> f - s);
                    continue;
                }
                return false;
            }

        }
        return true;
    }
}
