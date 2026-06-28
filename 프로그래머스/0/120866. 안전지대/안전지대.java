import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0, row = board.length, col = board.length;
        
        boolean[][] warning = new boolean[row][col];
        
        for (int i = 0; i < row; i++) {
            Arrays.fill(warning[i], true);
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 1) {
                    for (int k = -1; k < 2; k++) {
                        for (int l = -1; l < 2; l++) {
                            if (i + k >= 0 && j + l >= 0 && i + k < row && j + l < col) warning[i + k][j + l] = false;
                        }   
                    }
                }
            }
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (warning[i][j]) answer++;
            }
        }
        
        return answer;
    }
}