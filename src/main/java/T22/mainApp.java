package T22;
/*22. 括号生成
数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
示例 1：

输入：n = 3
输出：["((()))","(()())","(())()","()(())","()()()"]
有效括号组合需满足：左括号必须以正确的顺序闭合。*/
public class mainApp {
    public static void main(String[] args) {
        Solution s= new Solution();
        System.out.println(s.generateParenthesis(3).toString());
    }
}
