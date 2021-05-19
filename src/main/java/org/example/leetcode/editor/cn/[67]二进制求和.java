//给你两个二进制字符串，返回它们的和（用二进制表示）。 
//
// 输入为 非空 字符串且只包含数字 1 和 0。 
//
// 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
//
// 
//
// 提示： 
//
// 
// 每个字符串仅由字符 '0' 或 '1' 组成。 
// 1 <= a.length, b.length <= 10^4 
// 字符串如果不是 "0" ，就都不含前导零。 
// 
// Related Topics 数学 字符串 
// 👍 609 👎 0
package org.example.leetcode.editor.cn;


//leetcode submit region begin(Prohibit modification and deletion)
class Solution11 {
    public String addBinary(String a, String b) {
        //方式一(改进) 时间98%,内存76%：
        int aLength = a.length() - 1, bLength = b.length() - 1,tempSum = 0;
        StringBuilder sb = new StringBuilder();
        while (aLength >= 0 || bLength >= 0) {
            if (aLength < 0) tempSum += b.charAt(bLength) - '0';
            else if (bLength < 0) tempSum += a.charAt(aLength) - '0';
            else tempSum += b.charAt(bLength) + a.charAt(aLength) - 2 * '0';
            sb.append((tempSum) % 2);
            tempSum = tempSum / 2;
            aLength--;bLength--;
        }
        if (tempSum != 0) sb.append(tempSum); //sb.insert(0,temp);
        sb.reverse();
        return sb.toString();
    }

    /*if (aLength < 0)tempSum = Character.getNumericValue(b.charAt(bLength));
else if (bLength < 0)tempSum = Character.getNumericValue(a.charAt(aLength));
else tempSum = Character.getNumericValue(b.charAt(bLength)) + Character.getNumericValue(a.charAt(aLength));*/
    /*            if (tempSum + temp == 2) {
                    sb.insert(0, "0");
                    temp = 1;
                } else if (tempSum + temp == 3) {
                    sb.insert(0, "1");
                    temp = 1;
                } else {
                    sb.insert(0, tempSum + temp);
                    temp = 0;
                }*/

    //int sum = tempSum + temp;//sb.insert(0,(sum) % 2);
    //tempSum = tempSum + temp;
    //int temp = 0,
    public static void main(String[] args) {
        //System.out.println(new Solution().addBinary("11", "1"));
        System.out.println(Integer.highestOneBit(14));
        char x = '1';
        char b = '1';

        System.out.println(x + b - '0' - '0');
    }
}
//leetcode submit region end(Prohibit modification and deletion)
