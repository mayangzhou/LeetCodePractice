package T1to50.T31;

import java.util.Arrays;

/*31. 下一个排列
实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
必须 原地 修改，只允许使用额外常数空间。
示例 1：
输入：nums = [1,2,3]
输出：[1,3,2]
示例 2：
输入：nums = [3,2,1]
输出：[1,2,3]
示例 3：
输入：nums = [1,1,5][1,2,4,5,3]
输出：[1,5,1]
示例 4：
输入：nums = [1]
输出：[1]*/
public class mainApp {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        Solution s = new Solution();
        s.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
