package ru.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Solution9 {

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1- i)) {
                return false;
            }
        }
        return true;
    }

}
