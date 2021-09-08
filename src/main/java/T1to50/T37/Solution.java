package T1to50.T37;

public class Solution {
    private boolean[][] rows;
    private boolean[][] cols;
    private boolean[][] box;
    public void solveSudoku(char[][] board) {
        rows= new boolean[9][9];//第x个row 有无 数字y的出现
        cols= new boolean[9][9];
        box = new boolean[9][9];
        //Map<Integer, Set<Character>> box = new HashMap<>();
        int len = board.length;
        if (len != 9) return;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] != '.'){
                    int tmp = board[i][j]-'1';//那个出现的数字  转成index
                    rows[i][tmp] = true;
                    cols[j][tmp] = true;
                    int k = (i/3)*3 + j/3;
                    box[k][tmp] = true;
                }
            }
        }
        //初始化完成 开始递归
//        if (Recurrent(0,board)){
//            return;
//        }else {
//            System.out.println("meaningless sudo");
//        }
        Recurrent(0,board);


    }
    public boolean Recurrent(int n/*可以转换成ijk*/,char[][] board){
        if (n == 81) return true;
        int i = n/9;
        int j = n%9;
        int k = (i/3)*3 + j/3;
        if ( board[i][j] != '.' ) return Recurrent(n+1,board);
        for (int m = 0;m < 9;m++){
            if (!rows[i][m] && !cols[j][m] && !box[k][m]){
                board[i][j] = (char)(m+'1');
                rows[i][m] = cols[j][m] = box[k][m] =true;
                if(Recurrent(n + 1, board)) return true;
                rows[i][m] = cols[j][m] = box[k][m] =false;
            }
        }
        board[i][j] = '.';
        return false;
    }
}
