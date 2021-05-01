//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 104 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 
// 👍 2370 👎 0

package org.example.leetcode.editor.cn;

import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution6 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack stack = new Stack();
        Map<Character,Character> map = new HashMap();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        boolean temp =false;
        int num =0;
        for (int i = 0 ; i < chars.length ; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '['){
                num += 1;
                stack.push(chars[i]);
            }else if (chars[i] == ')' || chars[i] == '}' || chars[i] == ']'){
                num -= 1;
                temp = true;
                if (stack.isEmpty()) return false;
                if (!stack.pop().equals(map.get(chars[i]))) return false;
            }
        }
        if (!temp) return false;
        if (num !=0) return false;
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)