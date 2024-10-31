package ru.leetcode.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution20 {

    public boolean isValid(String s) {
        if (s.length() <= 1 ) {
            return false;
        }
        Map<String, String> openClose = Map.of(
                "(", ")",
                "[", "]",
                "{", "}"
        );
        Stack<String> brackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String bracket = String.valueOf(s.charAt(i));
            if (openClose.containsKey(bracket)) {
                brackets.push(bracket);
            } else {
                if (brackets.empty()) {
                    return false;
                }
                String pop = brackets.pop();
                if (!bracket.equals(openClose.get(pop))) {
                    return false;
                }
            }
        }
        return brackets.empty();
    }

}
