import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // commands의 길이
        int len = commands.length;
        
        int[] answer = new int[len];
        
        for (int cnt = 0; cnt < len; cnt++) {
            // 배열 시작
            int start = commands[cnt][0]-1;
            // 배열 끝
            int end = commands[cnt][1];
            // 찾을 인덱스
            int idx = commands[cnt][2]-1;

            int[] tmp = Arrays.copyOfRange(array, start, end);
            Arrays.sort(tmp);
            answer[cnt] = tmp[idx];
        }
        
        return answer;
    }
}