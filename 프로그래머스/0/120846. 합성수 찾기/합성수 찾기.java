class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 전체 수 - 소수
        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            for (int j = 2; j <= i; j++) {
                if (i != j && i % j == 0) {
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}