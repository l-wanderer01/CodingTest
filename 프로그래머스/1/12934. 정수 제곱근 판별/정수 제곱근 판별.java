import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = -1;

        // 제곱을 판별하는 방법!
        if(Math.sqrt(n) % 1 == 0) { // 정수인가? 어떻게 판별?
            answer = (long)Math.pow(Math.sqrt(n) + 1, 2);
        }
            
        return answer;
    }
}