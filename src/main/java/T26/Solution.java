package T26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int p =0, q =1;
        while (q < nums.length){
            if (nums[p] == nums[q]){
                q++;
            }else {
                int tmp = nums[p+1];
                nums[p+1] = nums[q];
                nums[q] = tmp;
                q++;
                p++;
            }
        }
        return p+1;
    }
}
