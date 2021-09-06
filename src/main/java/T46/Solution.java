package T46;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        recurrent(new HashSet<>(), new ArrayList<>(), nums);
        return ans;
    }
    public void recurrent(Set<Integer> set , List<Integer> input ,int[] nums){
        if (set.size() == nums.length){
            List<Integer> tmp = new ArrayList<>(input);
            ans.add(tmp);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i)){
                set.add(i);
                input.add(nums[i]);
                recurrent(set,input,nums);
                set.remove(i);
                input.remove(i);
            }
        }

    }
}
