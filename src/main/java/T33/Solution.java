package T33;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1){
            return target == nums[0]?0:-1;
        }else if (nums.length<1){
            return -1;
        }
        int k = findK(nums,0,nums.length-1);
        if (k == -1){
            return divSearch(nums,target,0,nums.length-1);
        }
        if (nums[0] <= target && nums[k] >= target){
            return divSearch(nums,target,0,k);
        }else {
            return divSearch(nums,target,k+1,nums.length-1);
        }

    }
    public int divSearch(int[] nums,int target,int start,int end){
        if (end - start == 0){
            return nums[start]==target?start:-1;
        }else if (end - start ==1){
            return nums[start] == target? start:nums[end] == target?end:-1;
        }else {
            int med = (start+end)/2;
            if (nums[med] >= target && target >= nums[start]){
                return divSearch(nums,target,start,med);
            }else {
                return divSearch(nums,target,med+1,end);
            }
        }

    }
    public int findK(int[] nums,int start,int end){
        if (end - start == 1){
            if (nums[start] > nums[end]){
                return start;
            }else if (end< nums.length-1 && nums[end] > nums[end+1]){
                return end;
            }else {
                return -1;
            }
        } else if (end ==start){
            if (end< nums.length-1 && nums[end] > nums[end+1]){
                return end;
            }else {
                return -1;
            }
        }else {
            int med = (start+end)/2;
            if (nums[start] > nums[med]){
                return findK(nums,start,med-1);
            }else {
                return findK(nums,med,end);
            }

        }

    }
}
