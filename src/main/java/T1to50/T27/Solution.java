package T1to50.T27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int q =nums.length-1;
        for (int i = 0; i <= q ; i++) {
            if (nums[i] == val){
                int tmp = nums[q];
                nums[q--] = nums[i];
                nums[i--] = tmp;
            }
        }
        return q+1;

    }
}
