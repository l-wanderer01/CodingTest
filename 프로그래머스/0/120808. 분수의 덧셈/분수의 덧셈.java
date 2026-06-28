import java.lang.Math;

class Solution {
    public int gcd(int a, int b) {
        int result = 0;
        
        int min = Math.min(a, b);
        
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        
        return result;
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int numer = denom2 * numer1 + denom1 * numer2;
        
        int denom = denom1 * denom2;
        
        int div = gcd(numer, denom);
        
        int[] answer = {(numer / div), (denom / div)};
            
        return answer;
    }
}