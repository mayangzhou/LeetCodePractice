package T51to100.T54;
/*54. 螺旋矩阵
给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。*/
public class mainApp {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Solution s = new Solution();
        System.out.println(s.spiralOrder(matrix).toString());
    }
}
