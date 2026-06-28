import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        for (int i = 1; i < max + min; i++) {
            if (i > max) { // i가 최댓값일 때            
                if (max + min > i) {
                    answer++;
                }
            }
            else {
                if (i + min > max) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}