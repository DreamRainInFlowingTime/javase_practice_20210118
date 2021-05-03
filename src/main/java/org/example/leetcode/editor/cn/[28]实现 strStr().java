//实现 strStr() 函数。 
//
// 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如
//果不存在，则返回 -1 。 
//
// 
//
// 说明： 
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。 
//
// 
//
// 示例 1： 
//
// 
//输入：haystack = "hello", needle = "ll"
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：haystack = "aaaaa", needle = "bba"
//输出：-1
// 
//
// 示例 3： 
//
// 
//输入：haystack = "", needle = ""
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= haystack.length, needle.length <= 5 * 104 
// haystack 和 needle 仅由小写英文字符组成 
// 
// Related Topics 双指针 字符串 
// 👍 885 👎 0
package org.example.leetcode.editor.cn;


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);   //100%  84%

        //下次在想
/*        int point = 0;
        int i ;
        if (needle.equals("")) {
            return 0;
        }

        for (i = 0; i < haystack.length(); i++) {
            if (point == needle.length()-1){
                return i-point;
            }
            if (needle.charAt(point)==haystack.charAt(i)) {
                point+=1;
            } else if (point != 0 && needle.charAt(point)!=haystack.charAt(i)) {
                point = 0;
            }
        }
        return -1;*/


    }
}
//leetcode submit region end(Prohibit modification and deletion)
