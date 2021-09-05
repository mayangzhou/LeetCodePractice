package T36;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int len = board.length;
        //1.行 lie
        for (int i = 0; i <len; i++) {
            Set<Character> setRows = new HashSet<>();
            Set<Character> setCols = new HashSet<>();
            for (int j = 0; j < len; j++) {
                if (board[i][j] != '.'){
                    if (setRows.contains(board[i][j])){
                        return false;
                    }else {
                        setRows.add(board[i][j]);
                    }
                }
                if (board[j][i] != '.'){
                    if (setCols.contains(board[j][i])){
                        return false;
                    }else {
                        setCols.add(board[j][i]);
                    }
                }


            }

        }

        for (int i = 0; i <= 6; i+= 3) {
            for (int j = 0; j < 7; j+=3) {
                Set<Character> set = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (board[i+k][j+l] != '.'){
                            if (set.contains(board[i+k][j+l])){
                                return false;
                            }else {
                                set.add(board[i+k][j+l]);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
