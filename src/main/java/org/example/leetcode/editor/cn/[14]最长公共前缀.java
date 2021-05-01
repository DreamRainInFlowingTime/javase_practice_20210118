//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 0 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 
// 👍 1581 👎 0

package org.example.leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution5 {
    public String longestCommonPrefix(String[] strs) {
        char[] chars = strs[0].toCharArray();
        int index=0;
        if (strs[0].equals("")) return "";
        for (int j = 0; j < chars.length; j++) {
            for (int i = 1; i < strs.length; i++) {
                index = j;
                if (!strs[i].startsWith(String.valueOf(chars[j]),j)) {
                    return String.valueOf(chars,0,index);
                }
            }
        }
        //return strs[0].substring(0,index+1);
        return String.valueOf(chars,0,index+1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
