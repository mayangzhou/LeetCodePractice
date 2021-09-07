package T51;

import java.util.*;

public class Solution {
    List<List<String>> lists;
    public List<List<String>> solveNQueens(int n) {
        //List<HashSet<Integer>> setList = new ArrayList<>(n);
//        List<List<String>> lists = new ArrayList<>();
//        if (n < 1){
//            return lists;
//        }
//        List<Set<Integer>> setList = new ArrayList<>(n);
//        //Set<Integer>[] sets = new HashSet[n];
//        for (int i = 0; i < n; i++) {
//            setList.get(0).add(i);
//        }
//        for (int i = 1; i < n; i++) {
//            setList.get(i).addAll(setList.get(0));
//        }
        lists = new ArrayList<>();
        if (n < 1){
            return lists;
        }
        char[][] plate = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                plate[i][j] = '.';
            }
        }
        for (int i = 0; i < n; i++) {

        }
        return lists;
    }
    public void Recurrent(char[][] plate,int i,int n){
        if (i == n){
            List<String> myList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                //myList = new ArrayList<String>(Collections.singleton(plate[j].toString()));
                //myList = plate[j].toString();
                myList.add(plate[j].toString());
            }
            lists.add(myList);
        }
        for (int k = 0; k < n; k++) {
            if (check(plate, i, k, n)){
                plate[i][k] = 'Q';
                Recurrent(plate,i+1,n);
                plate[i][k] = '.';
            }
        }
    }

    public boolean check(char[][] plate,int i,int j,int n){
        return true;
    }
}
