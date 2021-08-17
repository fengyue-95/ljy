package com.ljy.labuladong.doublepoint;

import com.ljy.leetcode.datastructure.ListNode;

/**
 * 快慢指针
 * @author fengyue
 * @date 2021/8/16
 */
public class FastSlowDoublePoint {

    /**
     * 快慢指针（解决存在环问题）
     */
    boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (null != fast && null != fast.getNext()) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    /**
     * 已知链表中含有环，返回这个环的起始位置
     * 
     * @param head
     * @return
     */
    ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (null != fast && null != fast.getNext()) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            // 找到环点
            if (fast == slow) {
                break;
            }
        }
        slow = head;
        while (slow != fast) {
            slow = slow.getNext();
            fast = fast.getNext();
        }
        return slow;
    }

    /**
     * 寻找链表的中点
     * 
     * @param head
     * @return
     */
    ListNode midList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }

        return slow;
    }

    /**
     * 寻找倒数第k个数
     * 
     * @param head
     * @return
     */
    ListNode searchK(ListNode head, int k) {
        // 先让快指针跑k个数，再让慢指针一起跑，当快指针跑完，慢指针就是倒数第k个数
        ListNode slow = head;
        ListNode fast = head;

        while (k-- > 0) {
            fast = fast.getNext();
        }

        while (fast != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }
        return slow;
    }
}
