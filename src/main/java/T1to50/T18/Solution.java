package T1to50.T18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        if (len < 4){
            return new ArrayList<>() ;
        }
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < len-3; i++) {
            while (i>0 && nums[i] == nums[i-1] && i<len-3) i++;
            for (int j = i+1; j < len -2 ; j++) {
                while (j>i+1 && nums[j] == nums[j-1] && j<len-2) j++;
                int l = j+1, r= len-1;
                while (l<r){
                    int tmp = nums[i]+nums[j]+nums[l]+nums[r];
                    if (tmp == target){
                        lists.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        while (l<r && nums[l]==nums[l+1]) l++;
                        while (l<r && nums[r]==nums[r-1]) r--;
                        l++;
                        r--;
                    }else if (tmp > target){
                        r--;
                    }else {
                        l++;
                    }
                }
            }
        }
        return lists;
    }
}
