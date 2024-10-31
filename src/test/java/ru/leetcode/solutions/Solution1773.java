package ru.leetcode.solutions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Solution1773 {

    @Test
    public void test() {
        Solution1773 solution1773 = new Solution1773();
        assertEquals(1, solution1773.countMatches(List.of(List.of("phone","blue","pixel"), List.of("computer","silver","lenovo"), List.of("phone","gold","iphone")), "color", "silver"));
        assertEquals(2, solution1773.countMatches(List.of(List.of("phone","blue","pixel"), List.of("computer","silver","phone"), List.of("phone","gold","iphone")), "type", "phone"));
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        switch (ruleKey) {
            case "type" -> counter += count(items, ruleValue, 0);
            case "color" -> counter += count(items, ruleValue, 1);
            case "name" -> counter += count(items, ruleValue, 2);
            default -> throw new IllegalStateException("Unexpected value: " + ruleKey);
        }
        return counter;
    }

    private int count(List<List<String>> items, String ruleValue, int index) {
        int counter = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                counter++;
            }
        }
        return counter;
    }
}
