class Solution {
    public int solution(int n) {
        int answer = 1;
        int result = 0;
        
        while (factorial(answer + 1) <= n) { // 가장 큰 정수 i를 찾으려면 그 다음의 factorial 값이 n보다 작아야한다!
            answer++;
        }
        
        return answer;
    }
    
    public int factorial(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        else {
            return n * factorial(n - 1);
        }
    }
}