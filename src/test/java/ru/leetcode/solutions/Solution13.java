package ru.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution13 {

    private static final Map<String, Integer> map = Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000
    );
    private static final Map<String, Set<String>> minusMap = Map.of(
            "I", Set.of("V", "X"),
            "X", Set.of("L", "C"),
            "C", Set.of("D", "M")
    );


    public int romanToInt(String s) {
        int result = 0;
        int minus = 0;
        String currentMinus = "";
        Set<String> expected = Set.of();
        for (int i = 0; i < s.length(); i++) {
            String charAt = String.valueOf(s.charAt(i));
            Integer intValue = map.get(charAt);
            if (minusMap.containsKey(charAt) && !expected.contains(charAt)) {
                if (!currentMinus.equals(charAt)) {
                    result += minus;
                    minus = 0;
                }
                minus += intValue;
                expected = minusMap.get(charAt);
                currentMinus = charAt;
                continue;
            }
            if (expected.contains(charAt)) {
                result += intValue - minus;
            } else {
                result += intValue + minus;
            }
            minus = 0;
            expected = Set.of();
        }
        return result + minus;
    }

}
