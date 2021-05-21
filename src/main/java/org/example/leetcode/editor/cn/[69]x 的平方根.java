//实现 int sqrt(int x) 函数。 
//
// 计算并返回 x 的平方根，其中 x 是非负整数。 
//
// 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。 
//
// 示例 1: 
//
// 输入: 4
//输出: 2
// 
//
// 示例 2: 
//
// 输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842..., 
//     由于返回类型是整数，小数部分将被舍去。
// 
// Related Topics 数学 二分查找 
// 👍 680 👎 0

package org.example.leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
/*        long x1 = x;
        for (long i = 0; i<=x1+1; i++) {
            if (i*i==x1)return (int)i;
            if (i*i>x1)return (int)i-1;
        }
        return 0;
    }*/
    }

    public static void main(String[] args) {
       // System.out.println(2147483647);
        new Solution().mySqrt(2147483647);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
