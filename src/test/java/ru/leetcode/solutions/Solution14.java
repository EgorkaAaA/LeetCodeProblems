package ru.leetcode.solutions;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class Solution14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String str = strs[0];
        StringBuilder suf = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (String s : strs) {
                if (s.length() == i || s.charAt(i) != c) {
                    return suf.toString();
                }
            }
            suf.append(c);
        }
        return suf.toString();
    }

}
