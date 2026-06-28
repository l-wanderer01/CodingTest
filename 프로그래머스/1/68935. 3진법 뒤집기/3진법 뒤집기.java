import java.util.Queue;
import java.util.LinkedList;
import java.lang.Math;

class Solution {
    public int solution(int n) {
        int answer = 0, remainder = 0, cnt = 0, result = 0;
        
        Queue<Integer> q = new LinkedList<>();
        
        while(n > 2) {
            remainder = n % 3; // int -> Integer형이 되어야 한다.
            
            // q.add(Integer.valueOf(remainder)); // 수동 boxing
            q.add(remainder);
            n /= 3;
            cnt++;
        }
        
        // 최종적으로 남은 n을 가장 마지막에 enqueue
        q.add(n);
        
        // 역순으로 꺼내어 answer에 값을 더한다.
        for (int i = cnt; i >= 0; i--) {
            result = (int)Math.pow(3, i) * q.remove(); // 제곱 : pow (결과값: double 형), double -> int
            answer += result;
        }
        
        return answer;
    }
}