package leetcode;

import java.util.*;

public class Solution51 {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    public  static List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int[] queens = new int[n];
        Arrays.fill(queens,-1);
        Set<Integer> clos = new HashSet<>();
        Set<Integer> diagonals1 = new HashSet<>();
        Set<Integer> diagonals2 = new HashSet<>();
        isExists(res,queens,0,n,clos,diagonals1,diagonals2);
        return res;


    }

    public static void isExists(List<List<String>> res,int[] queens,int row, int n, Set<Integer> cols, Set<Integer> dia1, Set<Integer> dia2) {
        if (row == n) {
            res.add(generate(queens));
            return;
        }
        //y -x = b
        //y +x = b
        for (int i = 0 ; i < n ; i ++) {
            int d1 = row - i;
            int d2= row + i;
            if (cols.contains(i) || dia1.contains(d1) || dia2.contains(d2)) {
                continue;
            }
            queens[row] = i;
            cols.add(i);
            dia1.add(d1);
            dia2.add(d2);
            isExists(res,queens,row + 1,n,cols,dia1,dia2);
            queens[row] = -1;
            cols.remove(i);
            dia1.remove(d1);
            dia2.remove(d2);

        }

    }
    public static List<String> generate(int[] queens) {
        List<String> res = new LinkedList<>();
        for (int i= 0 ;i <queens.length ; i ++) {
            char[] col = new char[queens.length];
            Arrays.fill(col,'.');
            col[queens[i]] = 'Q';

            res.add(new String(col));
        }
        return res;
    }


    public static void backtrack(List<List<String>> solutions, int[] queens, int row, int n, Set<Integer> columns, Set<Integer> diagonals1, Set<Integer> diagonals2) {
        if (row == n) {
            solutions.add(generate(queens));
            return;
        }
            for (int i = 0; i < n; i++) {
                int d1 = row - i;
                int d2= row + i;
                if (columns.contains(i) || diagonals1.contains(d1) || diagonals2.contains(d2)) {
                    continue;
                }
                queens[row] = i;
                columns.add(i);
                diagonals1.add(d1);
                diagonals2.add(d2);
                backtrack(solutions, queens,  row + 1, n,columns, diagonals1, diagonals2);
                queens[row] = -1;
                columns.remove(i);
                diagonals1.remove(d1);
                diagonals2.remove(d2);
            }

    }

}
