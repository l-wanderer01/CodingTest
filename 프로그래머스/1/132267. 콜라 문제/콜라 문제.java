class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        // 새 콜라를 받을 수 있는 빈 병 개수 : a
        // 빈 병을 a개 줬을 때, 주는 콜라 수 : b
        // 빈 병 개수 : n
        
        while (n >= a) {
            answer += (n / a) * b;
            n = (n / a) * b + (n % a);
        }
        
        return answer;
    }
}