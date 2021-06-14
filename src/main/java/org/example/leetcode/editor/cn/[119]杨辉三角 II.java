//给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 3
//输出: [1,3,3,1]
// 
//
// 进阶： 
//
// 你可以优化你的算法到 O(k) 空间复杂度吗？ 
// Related Topics 数组 
// 👍 294 👎 0


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex+=1;
        List<List<Integer>> list = new ArrayList<>();
        if (rowIndex >=1) list.add(Arrays.asList(1));
        if (rowIndex >=2) list.add(Arrays.asList(1,1));
        for (int i = 3; i <= rowIndex; i++) {
            list.add(new ArrayList<Integer>());
            list.get(i-1).add(1);
            for (int j = 2; j <= i-1; j++) list.get(i-1).add(list.get(i-2).get(j - 1) + list.get(i-2).get(j - 2));
            list.get(i-1).add(list.get(i-2).get(i - 2));
        }
        return list.get(rowIndex-1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
