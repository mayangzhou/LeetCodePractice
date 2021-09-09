package T51to100.T66;

public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int acc = 1;
        for (int i = len-1; i >= 0 ; i--) {

            digits[i] = (digits[i]+acc);
            acc = digits[i]/10;
            if (acc == 0){
                break;
            }else {
                digits[i] = digits[i]%10;
            }

        }
        if (acc == 1){
            int[] res = new int[len+1];
            res[0] = acc;
            for (int i = 1; i < res.length; i++) {
                res[i] = digits[i-1];
            }
            return res;
        }else {
            return digits;
        }
    }
}
