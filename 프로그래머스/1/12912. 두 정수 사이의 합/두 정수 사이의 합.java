class Solution {
    public long solution(int a, int b) {
        long min = a, max = b;
        
        long answer = 0;
        
        if (a == b) {
            return a;
        }
        
        if (a > b) {
            min = b;
            max = a;
        }
        
        while (min <= max) {
            answer += min;
            min++;
        }
        
        return answer;
    }
}