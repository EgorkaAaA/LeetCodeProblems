package ru.leetcode;

import org.junit.jupiter.api.Test;
import ru.leetcode.solutions.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StarterTest {

    @Test
    public void testSolution9() {
        Solution9 solution9 = new Solution9();
        assertTrue(solution9.isPalindrome(121));
        assertFalse(solution9.isPalindrome(-121));
        assertFalse(solution9.isPalindrome(10));
    }

    @Test
    public void testSolution13() {
        Solution13 solution13 = new Solution13();
        assertEquals(3, solution13.romanToInt("III"));
        assertEquals(58, solution13.romanToInt("LVIII"));
        assertEquals(1994, solution13.romanToInt("MCMXCIV"));
        assertEquals(1884, solution13.romanToInt("MDCCCLXXXIV"));
    }

    @Test
    public void testSolution14() {
        Solution14 solution14 = new Solution14();
        String string1 = solution14.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        assertEquals("fl", string1);
        String string2 = solution14.longestCommonPrefix(new String[]{"dog","racecar","car"});
        assertEquals("", string2);
        String string3 = solution14.longestCommonPrefix(new String[]{"a"});
        assertEquals("a", string3);
    }

    @Test
    public void testSolution20() {
        Solution20 solution20 = new Solution20();
        assertFalse(solution20.isValid("){"));
        assertFalse(solution20.isValid("(("));
        assertTrue(solution20.isValid("()"));
        assertTrue(solution20.isValid("()[]{}"));
        assertFalse(solution20.isValid("(]"));
        assertTrue(solution20.isValid("([])"));
        assertFalse(solution20.isValid("([)]"));
    }

    @Test
    public void testSolution21() {
        Solution21 solution21 = new Solution21();
        Solution21.ListNode listNode123 = new Solution21.ListNode(1, new Solution21.ListNode(2, new Solution21.ListNode(4)));
        Solution21.ListNode listNode134 = new Solution21.ListNode(1, new Solution21.ListNode(3, new Solution21.ListNode(4)));
        Solution21.ListNode listNode112344 = new Solution21.ListNode(1, new Solution21.ListNode(1, new Solution21.ListNode(2, new Solution21.ListNode(3, new Solution21.ListNode(4, new Solution21.ListNode(4))))));
        Solution21.ListNode listNode = solution21.mergeTwoLists(null, new Solution21.ListNode());
        assertEquals(0, listNode.val);
        listNode = solution21.mergeTwoLists(new Solution21.ListNode(1),null );
        assertEquals(1, listNode.val);
    }

    @Test
    public void testSolution26() {
        Solution26 solution26 = new Solution26();
        int[] nums1 = {1, 2, 2, 3};
        int first = solution26.removeDuplicates(nums1);
        assertEquals(3, first);
        assertArrayEquals(new int[]{1, 2, 3, 3}, nums1);
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3,4};
        solution26.removeDuplicates(nums2);
    }

    @Test
    public void testSolution27() {
        Solution27 solution27 = new Solution27();
        int[] nums1 = {3, 2, 2, 3};
        int first = solution27.removeElement(nums1, 3);
        assertEquals(2, first);
        assertArrayEquals(new int[]{2, 2}, Arrays.copyOfRange(nums1, 0, first));
        int[] nums2 = {0,1,2,2,3,0,4,2};
        int second = solution27.removeElement(nums2, 2);
        assertEquals(5, second);
        assertArrayEquals(new int[]{0,1,4,0,3}, Arrays.copyOfRange(nums1, 0, second));
    }

    @Test
    public void testSolution58() {
        Solution58 solution58 = new Solution58();
        assertEquals(5,  solution58.lengthOfLastWord("Hello World"));
        assertEquals(5,  solution58.lengthOfLastWord("Hello           World"));
        assertEquals(5,  solution58.lengthOfLastWord("Hello adsad dasda World"));
        assertEquals(5,  solution58.lengthOfLastWord("Hello adsad dasda World                 "));
        assertEquals(0,  solution58.lengthOfLastWord(""));
        assertEquals(1,  solution58.lengthOfLastWord("a"));
    }
}
