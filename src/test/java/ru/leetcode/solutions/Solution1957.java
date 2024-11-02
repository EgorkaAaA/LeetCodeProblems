package ru.leetcode.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution1957 {

    @Test
    public void test() {
        Solution1957 solution1957 = new Solution1957();
        assertEquals("leetcode", solution1957.makeFancyString("leeetcode"));
        assertEquals("aabbaa", solution1957.makeFancyString("aaaabbaaaa"));
    }

    public String makeFancyString(String s) {
        char[] charArray = s.toCharArray();
        int currentCount = 1;
        StringBuilder sb = new StringBuilder(String.valueOf(charArray[0]));
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i -1] != charArray[i]) {
                currentCount = 1;
                sb.append(charArray[i]);
                continue;
            }

            currentCount++;
            if (currentCount <= 2) {
                sb.append(charArray[i]);
            }
        }
        return sb.toString();
    }

}
