//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = [1,2,3]
//输出：[1,2,4]
//解释：输入数组表示数字 123。
// 
//
// 示例 2： 
//
// 
//输入：digits = [4,3,2,1]
//输出：[4,3,2,2]
//解释：输入数组表示数字 4321。
// 
//
// 示例 3： 
//
// 
//输入：digits = [0]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// 
// Related Topics 数组 
// 👍 685 👎 0
package org.example.leetcode.editor.cn;


import org.example.Array;

import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution10 {
    public int[] plusOne(int[] digits) {
        /**
         * 方法三
         * 顺便发现一个问题：判断上面不要写公式，计算出来的结果会占用空间。
         *  改成59行这样就好了。
         */
        for (int i = digits.length-1; i >= 0; i--) {
            digits[i] += 1;
            digits[i] = digits[i]%10;
            if ( digits[i]> 0) return digits;
            else digits[i]=0;
        }
        digits = new int[digits.length + 1];
        digits[0]=1;
        return digits;
    }

    //方案二：
/*        if (digits[0]==0 && digits.length==1){
            digits[0]=1;
            return digits;
        }
        if (digits[digits.length - 1] == 9) {
            digits[digits.length - 1] = 0;
            for (int i = digits.length - 2; i >= 0; i--) {
                if (digits[i] == 9){
                    digits[i] = 0;
                } else {
                    digits[i]+=1;
                    break;
                }
            }
        }else digits[digits.length - 1] += 1;
        if (digits[0] == 0){
            int[] newDigits = new int[digits.length+1];
            newDigits[0]=1;
            return newDigits;
        }
        return digits;*/


    //方案一：
        /*        String a = Arrays.toString(digits);
        a=a.replaceAll("\\[|\\]|,| ","");
        Long longs = Long.parseLong(a)+1;
        a=Long.toString(longs);
        int[] ints = new int[a.length()];
        for (int i = 0; i < digits.length; i++) {
            ints[i]=Character.getNumericValue(a.charAt(i));
        }
        return ints;*/



}
//leetcode submit region end(Prohibit modification and deletion)
