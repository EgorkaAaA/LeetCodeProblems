package ru.leetcode.solutions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution559 {

    @Test
    public void test() {
        Solution559 solution559 = new Solution559();
        Node node = new Node(
                1,
                List.of(
                        new Node(
                                3,
                                List.of(
                                        new Node(5),
                                        new Node(6)
                                )
                        ),
                        new Node(2),
                        new Node(4)
                )
        );
        assertEquals(3, solution559.maxDepth(node));
    }

    private static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 1;
        }
        List<Node> children = root.children;
        if (children == null || children.isEmpty()) {
            return 1;
        }
        int max = Integer.MIN_VALUE;
        for (Node child : children) {
            max = Math.max(maxDepth(child), max);
        }
        return max + 1;
    }
}
