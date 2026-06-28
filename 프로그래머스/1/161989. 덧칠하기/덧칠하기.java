import java.util.stream.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int last_painted = 0; // 가장 마지막에 칠해진 포인트 기억
        
        // 제일 앞쪽 라인부터 칠한다.
        for (int paint : section) {
            if (paint <= last_painted) continue;
            last_painted = paint + m - 1;
            answer++;
        }
        
        
        return answer;
    }
}