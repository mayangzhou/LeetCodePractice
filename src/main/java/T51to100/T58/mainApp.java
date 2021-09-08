package T51to100.T58;
/*58. 最后一个单词的长度
给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度。
单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
示例 1：
输入：s = "Hello World"
输出：5*/
public class mainApp {
    public static void main(String[] args) {
        String myStr = "   fly me   to   the moon  ";
        Solution s = new Solution();
        System.out.println(s.lengthOfLastWord(myStr));

    }
}
