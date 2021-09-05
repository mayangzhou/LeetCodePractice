package T31;

public class Solution {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length-1 ; i > 0 ; i--) {
            if (nums[i-1] < nums[i]){
                if (i == nums.length-1){
                    int tmp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] = tmp;
                    return;
                }
                for (int j = nums.length-1 ; j > i ; j--) {
                    if (j == nums.length-1 && nums[j] > nums[i-1]){
                        //第一个就大于  不存在右边小 左边大的情况
                        int tmp = nums[j];
                        nums[j] = nums[i-1];
                        nums[i-1] = tmp;
                        reverse(nums,i,nums.length-1);
                        return;
                    }
                    if (nums[j] <= nums[i-1] && nums[j-1] > nums[i-1]){
                        int tmp = nums[i-1];
                        nums[i-1] = nums[j-1];
                        nums[j-1] = tmp;
                        reverse(nums,i,nums.length-1);
                        return;
                    }
                }
            }
        }
        reverse(nums,0,nums.length-1);
        return;
    }

    //构建一个reverse函数
    public void reverse(int[] nums , int start,int end){
        //将数组中从start 到 end 的部分反转
        while (start < end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
