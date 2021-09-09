package T51to100.T67;
/*67. 二进制求和
给你两个二进制字符串，返回它们的和（用二进制表示）。
输入为 非空 字符串且只包含数字 1 和 0。
示例 1:
输入: a = "11", b = "1"
输出: "100"
示例 2:
输入: a = "1010", b = "1011"
输出: "10101"*/
public class mainApp {
    public static void main(String[] args) {
        Solution s = new Solution();
        String a = "1010", b = "1011";
        System.out.println(s.addBinary(a,b));
    }
}
