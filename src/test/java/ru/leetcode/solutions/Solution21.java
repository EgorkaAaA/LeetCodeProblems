package ru.leetcode.solutions;

import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class Solution21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = null;
            ListNode listNode = null;
            while (list1 != null || list2 != null) {
                Integer val1 = list1 == null ? null : list1.val;
                Integer val2 = list2 == null ? null : list2.val;
                if (val1 != null && Objects.equals(val1, val2)) {
                    dummy = setListNode(dummy, val1);
                    list1 = list1.next;
                } else if (val2 == null || val1 != null && val1 < val2) {
                    dummy = setListNode(dummy, val1);
                    list1 = list1.next;
                } else {
                    dummy = setListNode(dummy, val2);
                    list2 = list2.next;
                }
                if (listNode == null) {
                    listNode = dummy;
                }
            }
            return listNode;
    }

    public ListNode setListNode(ListNode dummy, int val) {
        if (dummy == null) {
            return new ListNode(val);
        }
        dummy.next = new ListNode(val);
        return dummy.next;
    }

    public static class ListNode {
        public int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
