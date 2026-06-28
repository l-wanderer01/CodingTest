import java.lang.Math;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        
        String result1 = s1 + s2;
        String result2 = s2 + s1;
        
        // if (Integer.valueOf(result1) > Integer.valueOf(result2)) {
        //     answer = Integer.valueOf(result1);
        // }
        // else {
        //     answer = Integer.valueOf(result2);
        // }
        
        answer = Math.max(Integer.parseInt(result1), Integer.parseInt(result2));
        
        return answer;
    }
}