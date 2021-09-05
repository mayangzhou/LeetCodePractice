package T34;

import java.util.Arrays;

public class Solution {
    private int indexStart;
    private int indexEnd;
    public int[] searchRange(int[] nums, int target) {
        indexEnd = -1;
        indexStart = -1;
        if (nums.length <1){
            return new int[]{-1,-1};
        }else if (nums.length == 1){
            indexStart = nums[0]==target?1:-1;
            indexEnd =indexStart;
            return new int[]{indexStart,indexEnd};
        }
        RecurrentSearch(nums,target,0, nums.length-1);
        return new int[]{indexStart,indexEnd};
    }
    public void RecurrentSearch(int[] nums,int target,int start,int end){
        if(start == end){
            if (nums[start] != target){
                return;
            }
            if (start == 0){
                indexStart = start;
                if (nums[start+1]!= target){
                    indexEnd = end;
                }
            }else if (start == nums.length-1){
                indexEnd = start;
                if (nums[start-1]!= target){
                    indexStart = start;
                }
            }else {
                if (nums[start-1]!= target){
                    indexStart = start;
                }
                if (nums[start+1]!= target){
                    indexEnd = end;
                }
            }
        }else {
            int med = (start+end)/2;
            if (nums[med] < target){
                RecurrentSearch(nums,target,med+1,end);
            }else if (nums[med] == target){
                RecurrentSearch(nums,target,med+1,end);
                RecurrentSearch(nums,target,start,med);
            }else {
                RecurrentSearch(nums,target,start,med);
            }
        }
    }
}
