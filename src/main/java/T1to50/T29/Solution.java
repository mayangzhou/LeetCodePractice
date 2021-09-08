package T1to50.T29;

public class Solution {
    public int divide(int dividend, int divisor) {
        long a = dividend;
        long b = divisor;
        if (b == 1){
            return dividend;
        }else if (b == -1){
            if (a > Integer.MIN_VALUE) return -dividend;
            else return Integer.MAX_VALUE;
        }
        boolean isBelowZero = false;
        if ((a < 0 && b >0)  || (a>0 && b<0)){
            isBelowZero =true;
        }

        a = a>0?a:-a;
        b = b>0?b:-b;
        if (isBelowZero){
            return -div(a,b);

        }else return div(a,b);
    }

    public int div(long a , long b){
        if (a < b){
            return 0;
        }else {
            int count = 1;
            long temp = b;
            while ((temp+temp) <= a){
                count += count;
                temp += temp;
            }
            return count + div(a-temp,b);
        }

    }
}
