package T51to100.T62;
/*62. 不同路径
一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
问总共有多少条不同的路径？*/
public class mainApp {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.uniquePaths(3,7));
    }
}
