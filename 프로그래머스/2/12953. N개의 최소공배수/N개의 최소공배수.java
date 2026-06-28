class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]); // 두 수의 lcm 계산 (answer가 arr[i]보다 항상 작음)
        }
        
        return answer;
    }
    
    public int gcd(int a, int b) { // 유클리드 호제법
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        
        return a;
    }
    
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}