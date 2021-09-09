package T51to100.T67;

public class Solution {
    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        StringBuilder sb = new StringBuilder();
        if (aLen > bLen){
            StringBuilder sbt = new StringBuilder();
            for (int i = 0; i < aLen-bLen; i++) {
                sbt.append(0);
            }
            b = sbt +b;
            bLen = b.length();
        }else {
            StringBuilder sbt = new StringBuilder();
            for (int i = 0; i < bLen-aLen; i++) {
                sbt.append(0);
            }
            a = sbt +a;
            aLen = a.length();
        }
        int acc = 0;
        for (int i = aLen-1; i >= 0; i--) {
            if (a.charAt(i) == '1' && b.charAt(i)=='1'){
                sb.insert(0,acc);
                acc = 1;
            }else if (a.charAt(i) == '1' && b.charAt(i)=='0'){
                sb.insert(0,acc == 1 ?0:1);
            }else if (a.charAt(i) == '0' && b.charAt(i)=='1'){
                sb.insert(0,acc == 1 ?0:1);
            }else if (a.charAt(i) == '0' && b.charAt(i)=='0'){
                sb.insert(0,acc);
                acc = 0;
            }

        }
        if (acc == 1){
            sb.insert(0,acc);
        }
        return sb.toString();
    }
}
