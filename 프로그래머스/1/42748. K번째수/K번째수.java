import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int cnt = 0; cnt < commands.length; cnt++) {
            int i = commands[cnt][0], j = commands[cnt][1], k = commands[cnt][2];
            if (j - i == 0) { // 요소가 1개라면 해당 요소를 answer에 넣고 반복
                answer[cnt] = array[i - 1];
                continue;
            }
            int[] tmp = new int[j - i + 1]; // 자른 배열
            for (int num = 0; num < j - i + 1; num++) {
                tmp[num] = array[num + i - 1];
            }
            Arrays.sort(tmp);
            answer[cnt] = tmp[k - 1];
        }
        
        return answer;
    }
}