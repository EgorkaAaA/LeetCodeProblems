package ru.leetcode.solutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution67 {

    @Test
    public void test() {
        Solution67 solution66 = new Solution67();
        assertEquals("100", solution66.addBinary("11", "1"));
        assertEquals("10101", solution66.addBinary("1010", "1011"));
    }

    public String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int over = 0;
        while (a.length() < b.length()) {
            a = "0" + a;
        }
        while (b.length() < a.length()) {
            b = "0" + b;
        }
        for (int i = a.length() - 1; i >= 0 ; i--) {
            Integer c1 = atIndex(a, i);
            Integer c2 = atIndex(b, i);
            int result = c1 + c2 + over;
            stringBuilder.append(result % 2);
            over = result / 2;
        }
        stringBuilder.append(over > 0 ? over : "");
        return stringBuilder.reverse().toString();
    }

    private Integer atIndex(String s, int index) {
        return Integer.parseInt(String.valueOf(s.charAt(index)));
    }
}
