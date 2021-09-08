package T1to50.T40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ans = new ArrayList<>();
        Recurrent(target,-1,candidates,new ArrayList<>());
        return ans;
    }
    public void Recurrent(int target , int lastIndex ,int[] candidates , List<Integer> array){
        for (int i = lastIndex+1 ; i < candidates.length; i++) {
//            if (i <= lastIndex) continue;
//            lastIndex = i;
            while (i > lastIndex+1 && i< candidates.length && candidates[i] == candidates[i-1]){
                i++;
            }
            if (i >= candidates.length) return;
            int tmp = target - candidates[i];
            if (tmp < 0) break;
            array.add(candidates[i]);
            if (tmp == 0){
                List<Integer> a = new ArrayList<>(array);
                ans.add(a);
                array.remove(array.size()-1);
                break;
            }else {
                Recurrent(tmp,i,candidates,array);
            }
            array.remove(array.size()-1);

        }
    }
}

//            if (tmp < 0){
//                array.remove(array.size()-1);
//                break; //剪枝 后面的数只会比前面的大
//            }else if (tmp == 0){
//                while (i > 0 && i< candidates.length && candidates[i] == candidates[i-1]){
//                    i++;
//                }
//                List<Integer> a = new ArrayList<>(array);
//                ans.add(a);
//            }else {
//                while (i > 0 && i< candidates.length && candidates[i] == candidates[i-1]){
//                    i++;
//                }
//                Recurrent(tmp,i,candidates,array);
//            }
//            array.remove(array.size()-1);