import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // 격자 개수
        int total = brown + yellow;
        for (int i = 1; i <= Math.sqrt(total); i++){
            if (total % i == 0) {
                int row = i;
                int col = total/i;
                if (yellow == countYellow(row,col)) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }   
            }
        }
        // 가로
        int max = Math.max(answer[0], answer[1]);
        // 세로
        int min = Math.min(answer[0], answer[1]);
        answer[0] = max;
        answer[1] = min;
        return answer;
    }
    
    // 노란 카펫 개수
    public int countYellow(int a, int b) {
        return (a-2)*(b-2);
    }
}