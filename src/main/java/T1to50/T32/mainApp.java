package T1to50.T32;
/*32. 最长有效括号
给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。



示例 1：

输入：s = "(()"
输出：2
解释：最长有效括号子串是 "()"
示例 2：

输入：s = ")()())"
输出：4
解释：最长有效括号子串是 "()()"*/
public class mainApp {

    public static void main(String[] args) {
        String s = "(())((()";
        Solution solution = new Solution();
        System.out.println(solution.longestValidParentheses(s));
    }
}
