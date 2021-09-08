package T1to50.T7;

public class Solution {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        if (x < 0){
            sb.append("-");
        }
        String s = String.valueOf(x).replace("-","");
        //StringBuilder reverse = new StringBuilder();
        for (int i = s.length()-1; i > -1; i--) {
            sb.append(s.charAt(i));
        }
        try{
            int ret = Integer.parseInt(sb.toString());
            return ret;
        }catch (NumberFormatException e){
            return 0;
        }




    }
}
