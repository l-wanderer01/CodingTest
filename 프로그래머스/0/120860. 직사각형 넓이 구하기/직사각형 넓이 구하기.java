import java.lang.Math;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int row = Math.abs(dots[0][0] - dots[3][0]);
        int col = Math.abs(dots[0][1] - dots[3][1]);
        
        for (int i = 1; i < dots.length - 1; i++) {
            int a = Math.abs(dots[i][0] - dots[i + 1][0]);
            row = a > row ? a : row;
            int b = Math.abs(dots[i][1] - dots[i + 1][1]);
            col = b > col ? b : col;
        }
        
        answer = row * col;
        
        return answer;
    }
}