package T1to50.T39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();

        Recurrent(target,new ArrayList<Integer>(),candidates[0],candidates,ans);

        return ans;
    }
    public void Recurrent(int target, List<Integer> array,int usedMin , int[] candidates,List<List<Integer>>ans){
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] < usedMin){
                continue;
            } else {
                usedMin = candidates[i];
            }
            int tmp = target-candidates[i];
            if (tmp == 0){
                array.add(candidates[i]);
                List<Integer> ar2 = new ArrayList<>(array);
                ans.add(ar2);//答案添加完后 需要回溯
                array.remove(array.size()-1);
                break;
            }else if (tmp >0){
                array.add(candidates[i]);
                //used.add(candidates[i]);
                Recurrent(tmp,array,usedMin,candidates,ans);
                //used.remove(candidates[i]);
                array.remove(array.size()-1);
            }else {
                break; //此时tmp已经小于0  后面的都比它大 肯定也小于0
            }
        }
    }
}
