//给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。 
//
// 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "Hello World"
//输出：5
// 
//
// 示例 2： 
//
// 
//输入：s = " "
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 104 
// s 仅有英文字母和空格 ' ' 组成 
// 
// Related Topics 字符串 
// 👍 313 👎 0


import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
/*        String[] arrS = s.split(" ");
        return arrS.length == 0 ? 0 : arrS[arrS.length - 1].length();*/
        char[]  chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ' && flag != 0){
                break;
            }
            else {
                flag = 1;
                if (chars[i] == ' ') continue;
                sb.append(chars[i]);
            }
        }
        return flag == 0 ? 0 : sb.length();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
