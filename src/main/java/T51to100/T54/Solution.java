package T51to100.T54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int shot = Math.min(m,n);
        int times = 0;
        List<Integer> list = new ArrayList<>(m*n);
        //int nextLen = shot-2*times;
        while (shot-2*times >0){
            //上
            for (int i = times; i < n-times; i++) {
                list.add(matrix[times][i]);
            }
            //右
            for (int i = times+1; i < m-times; i++) {
                list.add(matrix[i][n-1-times]);
            }
            //下
            for (int i = n-2-times; i > times  && (m-2*times)!= 1; i--) {
                list.add(matrix[m-1-times][i]);
            }
            //左
            for (int i = m-1-times; i > times && (n-2*times)!= 1; i--) {
                list.add(matrix[i][times]);
            }
            times++;
        }
        return list;
    }
}
