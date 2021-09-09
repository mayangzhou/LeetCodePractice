package T51to100.T63;
public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[m-1][n-1] == 1 || obstacleGrid[0][0] == 1){
            return 0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1){
                    obstacleGrid[i][j] =-1;
                }
            }
        }
        obstacleGrid[0][0] = 1;
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == -1) continue;
            if (obstacleGrid[i-1][0] != -1){
                obstacleGrid[i][0] = obstacleGrid[i-1][0] ;
            }else {
                obstacleGrid[i][0] = 0;
            }
        }
        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i] == -1) continue;
            if (obstacleGrid[0][i-1] != -1){
                obstacleGrid[0][i] = obstacleGrid[0][i-1];
            }else {
                obstacleGrid[0][i] = 0;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < m; j++) {
                if (obstacleGrid[i][j] != -1){
                    int a = obstacleGrid[i-1][j]==-1?0:obstacleGrid[i-1][j];
                    int b = obstacleGrid[i][j-1]==-1?0:obstacleGrid[i][j-1];
                    obstacleGrid[i][j] = a+b;

                }
            }
        }
        return obstacleGrid[m-1][n-1];
    }
}
