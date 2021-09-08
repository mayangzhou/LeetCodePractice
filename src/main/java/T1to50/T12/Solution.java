package T1to50.T12;

public class Solution {
    public String intToRoman(int num) {
        String[][] matrix= new String[4][10];
        matrix[0] = new String[]{"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        matrix[1] = new String[]{"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        matrix[2] = new String[]{"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        matrix[3] = new String[]{"","M", "MM", "MMM", "", "", "", "", "", "", ""};

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append( matrix[3][num / 1000]);
        num = num%1000;
        stringBuilder.append( matrix[2][num / 100]);
        num = num%100;
        stringBuilder.append( matrix[1][num / 10]);
        num = num%10;
        stringBuilder.append( matrix[0][num ]);

        return  stringBuilder.toString();
    }
}
