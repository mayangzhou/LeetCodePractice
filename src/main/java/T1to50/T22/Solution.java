package T1to50.T22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        add(new StringBuilder(),n,0,ans);
        return ans;
    }

    public void add(StringBuilder sb, int n , int m , List<String> ans){
        if (n == 0){
            if (m == 0){
                ans.add(sb.toString());
                return;
            }else {
                add(sb.append(')'),n,m-1,ans);
                sb.deleteCharAt(sb.length()-1);
            }

        }else {
            add(sb.append('('),n-1,m+1,ans);
            sb.deleteCharAt(sb.length()-1);
            if (m > 0){
                add(sb.append(')'),n,m-1,ans);
                sb.deleteCharAt(sb.length()-1);
            }

        }
    }
}
