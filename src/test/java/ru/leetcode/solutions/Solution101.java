package ru.leetcode.solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution101 {

    @Test
    public void test() {
        Solution101 solution101 = new Solution101();
        assertTrue(
                solution101.isSymmetric(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        2,
                                        new TreeNode(3),
                                        new TreeNode(4)
                                ),
                                new TreeNode(
                                        2,
                                        new TreeNode(4),
                                        new TreeNode(3)
                                )
                        )
                )
        );
        assertFalse(
                solution101.isSymmetric(
                        new TreeNode(
                                1,
                                new TreeNode(
                                        2,
                                        null,
                                        new TreeNode(3)
                                ),
                                new TreeNode(
                                        2,
                                        null,
                                        new TreeNode(3)
                                )
                        )
                )
        );
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right != null || right == null && left != null) {
            return false;
        }
        if (left == null) {
            return true;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
