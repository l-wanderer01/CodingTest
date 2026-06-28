import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] top = new int[k];
        Arrays.fill(top, 2000);
        
        if (k > score.length) {
            for (int i = 0; i < score.length; i++) {
                top[i] = score[i];
                Arrays.sort(top);
                answer[i] = top[0];
            }
            return answer;
        }
        
        for (int i = 0; i < k; i++) {
            top[i] = score[i];
            Arrays.sort(top);
            answer[i] = top[0];
        }   
        
        for (int i = k; i < score.length; i++) {
            if (score[i] > top[0]) {
                top[0] = score[i];
                Arrays.sort(top);
            }
            answer[i] = top[0];
        }
           
        return answer;
    }
}