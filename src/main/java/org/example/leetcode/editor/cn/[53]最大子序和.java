//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出：6
//解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：0
// 
//
// 示例 4： 
//
// 
//输入：nums = [-1]
//输出：-1
// 
//
// 示例 5： 
//
// 
//输入：nums = [-100000]
//输出：-100000
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 3 * 104 
// -105 <= nums[i] <= 105 
// 
//
// 
//
// 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。 
// Related Topics 数组 分治算法 动态规划 
// 👍 3221 👎 0
package org.example.leetcode.editor.cn;


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution13 {
    public int maxSubArray(int[] nums) {
/*      int temp = -100000;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
             result = 0;
            for (int j = i; j < nums.length; j++) {
                result += nums[j];
                if (result >= temp ){
                    temp = result;
                }
            }
        }
        return temp;*/
        int pre = nums[0];
        int max  = 0;
        for (int num : nums) {
            pre += num;
            pre = Math.max(pre, num);
            max = Math.max(max,pre);
        }
        return max;
    }

/*    public static void main(String[] args) {
        new Solution().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    }*/
}

//leetcode submit region end(Prohibit modification and deletion)
