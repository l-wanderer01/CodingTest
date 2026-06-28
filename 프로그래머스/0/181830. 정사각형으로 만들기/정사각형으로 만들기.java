import java.lang.Math;

class Solution {
    public int[][] solution(int[][] arr) {
        int col = 0, row = 0;
        if (arr.length != arr[0].length) {
            int max = Math.max(arr.length, arr[0].length);
            col = max;
            row = max;
        }
        else {
            return arr;
        }
        
        int[][] answer = new int[col][row];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}