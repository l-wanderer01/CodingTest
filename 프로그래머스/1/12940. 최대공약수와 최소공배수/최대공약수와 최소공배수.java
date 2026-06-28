import java.lang.Math;

class Solution {
    public int gcd(int min, int max) {
        if (min == 0) return max;
        return gcd(max % min, min); // 유클리드 호제법
    }

    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // 배열의 제일 앞에 최대공약수, 배열의 가장 뒤에 최소공배수
                
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        
        // 최대공약수 계산법 -> 이를 유클리드로 작성해야함
        answer[0] = gcd(min, max);
        
        // 최소공배수 계산법
        int lcm = min * max / answer[0];
        answer[1] = lcm;
        
        return answer;
    }
}


        // 3, 12
        // max % min == 0 -> 최대공약수 : min
        // 12 27
        // max % min = 3
        // 24 36 최대공약수 -> 72
        // max % min = 12
        // 102 24
        // gcd : 6, lcm : 408