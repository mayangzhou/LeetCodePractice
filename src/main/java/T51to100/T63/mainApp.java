package T51to100.T63;
/*63. 不同路径 II
一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。

现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？*/
public class mainApp {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] nums={{0,1},{0,0}};
        System.out.println(s.uniquePathsWithObstacles(nums));
    }

}
