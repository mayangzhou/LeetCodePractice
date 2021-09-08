package T1to50.T43;

public class Solution {
    public String multiply(String num1, String num2) {
        if (num1.length() == 0 || num2.length() == 0 || num1.equals("0") || num2.equals("0")){
            return "0";
        }
        StringBuilder offset = new StringBuilder();
        StringBuilder realAns = new StringBuilder();
        for (int i = num2.length()-1; i >=0; i--) {
            StringBuilder multiAns = new StringBuilder();
            int acc = 0;
            for (int j = num1.length()-1 ; j >=0 ; j--) {
                int tmp = multi2chars(num1.charAt(j),num2.charAt(i));
                tmp += acc;
                multiAns.insert(0,tmp%10);
                acc = tmp/10;
            }
            if (acc!= 0){
                multiAns.insert(0,acc);
            }
            multiAns.append(offset);
            realAns = addStr(realAns,multiAns);
            offset.append(0);
        }

        return realAns.toString();

    }
    public int multi2chars(char i,char j){
        return (i-'0')*(j-'0');
    }
    public StringBuilder addStr(StringBuilder sb1,StringBuilder sb2){
        //StringBuilder sb1 = new StringBuilder(str1);
        //StringBuilder sb2 = new StringBuilder(str2);
        int length = sb2.length() - sb1.length();
        if (sb1.length() < sb2.length()){
            for (int i = 0; i < length; i++) {
                sb1.insert(0,0);
            }
        }else if (sb2.length() < sb1.length()){
            for (int i = 0; i < -length; i++) {
                sb2.insert(0,0);
            }
        }
        StringBuilder ans = new StringBuilder();
        int offset = 0,tmpSum = 0,flag = 1;
        for (int i = sb1.length()-1; i >= 0 ; i--) {
            tmpSum = sb1.charAt(i)-'0' + sb2.charAt(i)-'0';
            tmpSum += offset;
            offset = tmpSum/10;
            tmpSum = tmpSum%10;
            ans.insert(0,tmpSum);
        }
        if (offset != 0){
            ans.insert(0,offset);
        }

        return ans;
    }
}
