//给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。 
//
// 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。 
//
// 
//
// 示例 1： 
//
// 
//输入：p = [1,2,3], q = [1,2,3]
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：p = [1,2], q = [1,null,2]
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：p = [1,2,1], q = [1,1,2]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 两棵树上的节点数目都在范围 [0, 100] 内 
// -104 <= Node.val <= 104 
// 
// Related Topics 树 深度优先搜索 
// 👍 627 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution20 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q) return true;
        else if (p == null || q == null) return false;
        return foreach(p, q);
    }

    boolean foreach(TreeNode p, TreeNode q) {
        if (p.left != null && q.left != null) {
            return foreach(p.left, q.left);
        } else if (p.left == q.left) ;
        else return false;

        if (p.val != q.val) return false;

        if (p.right != null && q.right != null) {
            return foreach(p.right, q.right);
        } else if (p.right == q.right) ;
        else return false;

        return true;
    }
//???模拟的是false，测试是是true？我这个模拟有问题？[4,5,null,1,null,2,null,3],[5,4,null,1,null,2,null,3]

    public static void main(String[] args) {
/*        TreeNode p = new Solution.TreeNode();
        p.val = 4;
        p.left = new Solution.TreeNode(5);
        p.right = null;
        p.left.left = new Solution.TreeNode(1);
        //p.left.right = null;
        p.left.left.left = new Solution.TreeNode(2);
        //p.left.left.right = null;
        p.left.left.left.left = new Solution.TreeNode(3);

        TreeNode q = new Solution.TreeNode();
        q.val = 5;
        p.left = new Solution.TreeNode(4);
        p.left.left = new Solution.TreeNode(1);
        //p.left.right = null;
        p.left.left.left = new Solution.TreeNode(2);
        p.left.left.left.left = new Solution.TreeNode(3);
        System.out.println(new Solution().isSameTree(p, q));*/
    }


    static class TreeNode {
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
}







//leetcode submit region end(Prohibit modification and deletion)
