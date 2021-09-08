package T1to50.T50;

public class Solution {
//    public double myPow(double x, int n) {
//        if (x == 0) return n==0?1:0;
//        if (x == 1) return 1;
//        if (n == 0) return 1;
//        long b = n;
//        if (b < 0) {
//            x = 1/x;
//            b = -b;
//        }
//        Map<Long,Double> result = new HashMap<>();
//        result.put((long)1,x);
//        result.put((long)2,x*x);
//
//        return recurrent(result,b);
//
//    }
//
//    public double recurrent(Map<Integer,Double>result,long n ){
//        if (n == 1){
//            return result.get(1);
//        }else if (n == 2){
//            return result.get(2);
//        }
//        if (n%2 == 0){
//            if (!result.containsKey(n/2)){
//                result.put(n/2,recurrent(result,n/2));
//            }
//            return result.get(n/2)*result.get(n/2);
//        }else {
//            if (!result.containsKey(n/2)){
//                result.put(n/2,recurrent(result,n/2));
//            }
//            if (!result.containsKey(n/2+1)){
//                result.put(n/2+1,recurrent(result,n/2+1));
//            }
//            return result.get(n/2)*result.get(n/2+1);
//        }
//
//    }
    public double myPow(double x, int n) {
         long b =n;
         if (x == (double) 0) return 0;

         if (b < 0){
             b = -b;
             x = 1/x;
         }
         double res = 1;
         while (b>0){
             if ((b&1) == 1){
                 res *= x;

             }
             x = x*x;
             b>>=1;
         }
         return res;
    }
}
