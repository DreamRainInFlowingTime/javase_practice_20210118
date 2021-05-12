//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [1,2,4], l2 = [1,3,4]
//输出：[1,1,2,3,4,4]
// 
//
// 示例 2： 
//
// 
//输入：l1 = [], l2 = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [], l2 = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 两个链表的节点数目范围是 [0, 50] 
// -100 <= Node.val <= 100 
// l1 和 l2 均按 非递减顺序 排列 
// 
// Related Topics 递归 链表 
// 👍 1696 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
package org.example.leetcode.editor.cn;

class Solution11 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1.next == null) return l2;
        else if (l2.next == null) return l1;
        ListNode pre;
        ListNode temp;

        if (l1.val > l2.val) {
            pre = l2;
            l2 = l2.next;
        }
        else {
            pre = l1;
            l1=l1.next;
        }
        temp = pre;
        while (l1.next != null || l2.next != null){
            if (l1.val > l2.val) {
                temp.next = l2;
                l2 = l2.next;
            }else {
                temp.next = l1;
                l1=l1.next;
            }
        }
        return pre;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
