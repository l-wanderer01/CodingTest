class Solution {
    public long solution(int n) {
        // DP로 해결!
        // 피보나치 수열 (점화식: f(n) = f(n-1) + f(n-2))
        
        // 수도코드
//         dp[0] = 1
//         dp[1] = 1
        
//         for i from 2 to n:
//             dp[i] = (dp[i-1] + dp[i-2]) % 1234567
//         return dp[n]
        if (n <= 1) return 1;
        
        int mod = 1234567;
        int prev1 = 1; // dp[0]
        int prev2 = 1; // dp[1]
        int current = 0; // dp[i] 값을 저장하는 변수
        
        for (int i = 2; i <= n; i++) {
            // 점화식을 사용하려면 dp[2] = dp[1] + dp[0]이기 때문에 dp[0], dp[1]이 필요하고
            // 이 두 개는 이미 우리가 직접 초기화해줬기 때문에 2부터 시작!
            current = (prev1 + prev2) % mod; // 점화식
            prev1 = prev2;
            prev2 = current;
        }
        
        return current;
    }
}