//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 注意：给定 n 是一个正整数。 
//
// 示例 1： 
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶 
//
// 示例 2： 
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
// 
// Related Topics 动态规划 
// 👍 1663 👎 0

package org.example.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution16 {
    Map map = new HashMap<Integer,Integer>();
    public int climbStairs(int n) {
        //翻车了，明天。，这tm就是easy么，i了
        //这个时间复杂度是多少？我自己都不知道，100%，61%
        if (n == 1){
            return 1;
        }else if (n == 2){
            return 2;
        }else if (map.containsKey(n)){
            return (Integer)map.get(n);
        } else {
            map.put(n,climbStairs(n - 1) + climbStairs(n - 2));
            return (Integer)map.get(n);
        }
    }

    public static void main(String[] args) {
        //System.out.println(new Solution().climbStairs(100));
    }
}

//leetcode submit region end(Prohibit modification and deletion)
