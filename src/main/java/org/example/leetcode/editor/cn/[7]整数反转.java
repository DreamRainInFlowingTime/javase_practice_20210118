//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics 数学 
// 👍 2719 👎 0

package org.example.leetcode.editor.cn;

import java.util.ArrayList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
/*        String a = Math.abs(x) + "";
        int b;
        try {
            b = Integer.parseInt(new StringBuffer(a).reverse().toString());
        }catch (NumberFormatException e){
            System.out.println("环境存不了64位的");
            return 0;
        }
        return  x < 0 ? (int)-b : (int)b;*/

            int rev = 0;
            while (x != 0) {
                int pop = x % 10;
                x /= 10;
/*              if (rev > 0 && rev > (Integer.MAX_VALUE - pop)/10) return 0;
                if (rev < 0 && rev < (Integer.MIN_VALUE - pop)/10) return 0;*/
                if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
                if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;


                rev = pop + rev * 10;

            }
            return rev;
        }
}


//leetcode submit region end(Prohibit modification and deletion)
