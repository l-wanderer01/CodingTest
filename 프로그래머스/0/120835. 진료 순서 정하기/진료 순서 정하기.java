import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        int[] copy = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(copy);
        
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] == copy[j]) {
                    answer[i] = emergency.length - j;
                }
            }
        }
        
        return answer;
    }
}