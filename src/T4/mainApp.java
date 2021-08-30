package T4;
/*给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 
示例 1：
输入：nums1 = [1,3], nums2 = [2]
输出：2.00000
解释：合并数组 = [1,2,3] ，中位数 2
示例 2：

输入：nums1 = [1,2], nums2 = [3,4]
输出：2.50000
解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
示例 3：

输入：nums1 = [0,0], nums2 = [0,0]
输出：0.00000
示例 4：

输入：nums1 = [], nums2 = [1]
输出：1.00000
示例 5：

输入：nums1 = [2], nums2 = []
输出：2.00000
 

提示：

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 

进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class mainApp {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,7,9};
        int[] nums2 = {2,4,6,8,10};
        Solution s = new Solution();
        //System.out.println(s.findMedianSortedArrays(nums1,nums2));

        int[] nums3 = {1,2,4};
        int[] nums4 = {5,6,7,8,9,10,11};
        int[] num5 = {1,2};
        int[] num6 = {3,4};
        //System.out.println(s.findMedianSortedArrays(num5,num6));

        s.nums1 = num5;
        s.nums2 = num6;
        s.isOdd = ((s.nums1.length + s.nums2.length)%2 == 1);
        System.out.println(s.myTwoInts(0,0,2));
    }

}
