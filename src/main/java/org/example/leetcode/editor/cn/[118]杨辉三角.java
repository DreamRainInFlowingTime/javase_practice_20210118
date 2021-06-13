//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//] 
// Related Topics 数组 
// 👍 507 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows >=1) list.add(Arrays.asList(1));
        if (numRows >=2) list.add(Arrays.asList(1,1));
        for (int i = 3; i <= numRows; i++) {
            list.add(new ArrayList<Integer>());
            list.get(i-1).add(1);
            for (int j = 2; j <= i-1; j++) list.get(i-1).add(list.get(i-2).get(j - 1) + list.get(i-2).get(j - 2));
            list.get(i-1).add(list.get(i-2).get(i - 2));
        }
        return list;
     }
}
//leetcode submit region end(Prohibit modification and deletion)
