package T41;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ( (nums[i] > 0) && (nums[i] <= nums.length) && (nums[i] != nums[nums[i]-1]) ){
                swap(nums,nums[i]-1,i);
                i--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != (i+1)){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public void swap(int[] nums ,int i , int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
