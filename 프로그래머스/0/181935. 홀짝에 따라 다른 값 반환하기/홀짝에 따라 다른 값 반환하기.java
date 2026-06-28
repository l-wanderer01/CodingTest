import java.lang.Math;

class Solution {
    public int solution(int n) {
        // n % 2 == 1 이라면, n - 2를 n이 0이하가 될 때 까지
        // n % 2 == 0 이라면, n - 2를 n이 0이 될 때까지 Math.pow(n, 2)
        int answer = 0, num = n;
        
        while (n >= 0) {
            if (n % 2 == 1) {
                answer += n;
            }
            else {
                answer += Math.pow(n, 2);
            }
            n -= 2;
        }
        return answer;
    }
}