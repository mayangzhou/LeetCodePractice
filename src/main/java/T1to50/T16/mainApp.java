package T1to50.T16;
/*16. 最接近的三数之和
给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。



示例：

输入：nums = [-1,2,1,-4], target = 1
输出：2
解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。*/
public class mainApp {
    public static void main(String[] args) {
        int[] nums = {0,1,2};
        Solution s = new Solution();
        System.out.println(s.threeSumClosest(nums,3));
    }
}