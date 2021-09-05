package T35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        return recurrent(nums,0,nums.length-1,target);
    }
    public int recurrent(int[] nums,int left,int right,int target){
        if (left ==right){
            if (nums[left] == target){
                return left;
            }else if (nums[left] < target){
                return left+1;
            }else {
                return left;
            }
        }else {
            int med = (left+right)/2;
            if (nums[med] == target ){
                return med;
            }else if(nums[med] < target){
                return recurrent(nums,med+1,right,target);
            }else {
                return recurrent(nums,left,med,target);
            }
        }
    }
}
