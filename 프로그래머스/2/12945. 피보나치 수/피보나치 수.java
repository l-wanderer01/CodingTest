// class Solution {
//     public int solution(int n) {
                
//         int num = fib(n);
        
//         int answer = num % 1234567;
        
//         return answer;
//     }
    
//     // 이렇게 단순 반복은 시간초과가 발생!
//     public int fib(int n) {
//         if (n == 0) return 0;
//         else if (n == 1) return 1;
        
//         return fib(n - 1) + fib(n - 2);
//     }
// }

class Solution {
    public int solution(int n) {
        
        if (n == 0) return 0;
        else if (n == 1) return 1;
        int a = 0, b = 1;
        
        for (int i = 2; i <= n; i++) {
            int temp = (a + b) % 1234567;
            a = b;
            b = temp;
        }
        
        return b;
    }
}