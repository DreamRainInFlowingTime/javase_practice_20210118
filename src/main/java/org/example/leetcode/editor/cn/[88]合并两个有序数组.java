//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。 
//
// 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nu
//ms2 的元素。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//输出：[1,2,2,3,5,6]
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1], m = 1, nums2 = [], n = 0
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m + n 
// nums2.length == n 
// 0 <= m, n <= 200 
// 1 <= m + n <= 200 
// -109 <= nums1[i], nums2[i] <= 109 
// 
// Related Topics 数组 双指针 
// 👍 960 👎 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution18 {
    //100% , 91%没啥优化的了，这内存是因为用例不同导致的？就多用了一个int变量怎么会只有91？
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex = m + n - 1;
        m = m - 1;
        n = n - 1;
        while (true) {
            if (m == -1 || n == -1) break;
            if (nums1[m] > nums2[n]) {
                nums1[lastIndex] = nums1[m];
                m = m-1;
            } else {
                nums1[lastIndex] = nums2[n];
                n = n-1;
            }
            lastIndex--;
        }
        if (m == -1) {
            for (int i = 0; i <= n; i++) {
                nums1[i] = nums2[i];
            }
        }

        //if (nums1Index == -1) System.arraycopy(nums2, 0, nums1, 0, nums2Index + 1);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
        int[] nums2 = new int[]{1, 2, 3};
        new Solution().merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}

//leetcode submit region end(Prohibit modification and deletion)
