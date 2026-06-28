import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0, diff = 100; // 차이를 저장
        
        for (int num : array) {
            if (Math.abs(num - n) < diff) {
                diff = Math.abs(num - n);
                answer = num;
            }
            else if (Math.abs(num - n) == diff) {
                answer = Math.min(num, answer);
            }
        }
        
        return answer;
    }
}