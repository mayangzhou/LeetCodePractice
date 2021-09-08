package T1to50.T16;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        if (len < 3){
            return 0;
        }
        int ans = Math.abs(nums[0]+nums[1]+nums[2] - target);
        int ret = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < len-2; i++) {
            int l = i+1,r = len-1;
            while (l<r){
                int tmp = nums[i]+nums[l]+nums[r];
                if (tmp > target){
                    while (l<r && nums[r] == nums[r-1]) r--;
                    //ans = Math.min(Math.abs(tmp-target),ans);
                    if (Math.abs(tmp-target)< ans){
                        ret = tmp;
                        ans = Math.abs(tmp-target);
                    }
                    r--;
                }else if (tmp < target){
                    while (l<r && nums[l] == nums[l+1]) l++;
                    if (Math.abs(tmp-target)< ans){
                        ret = tmp;
                        ans = Math.abs(tmp-target);
                    }
                    l++;
                }else {
                    return target;
                }
            }

        }
        return ret;
    }
}
