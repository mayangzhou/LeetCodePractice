package T1to50.T34;


import java.util.Arrays;

/*34. 在排序数组中查找元素的第一个和最后一个位置
给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。

如果数组中不存在目标值 target，返回 [-1, -1]。

进阶：
输入：nums = [5,7,7,8,8,10], target = 8
输出：[3,4]
你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？*/
public class mainApp {
    public static void main(String[] args) {
        int[]nums = {5,7,7,8,8,10};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.searchRange(nums,8)));
    }
}
