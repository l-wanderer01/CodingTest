import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        if (before.length() != after.length()) return 0;
        
        String[] sArr1 = before.split("");
        String[] sArr2 = after.split("");
        
        Arrays.sort(sArr1);
        Arrays.sort(sArr2);
        
        int cnt = 0;
        
        for (int i = 0; i < sArr1.length; i++) {
            if (!sArr1[i].equals(sArr2[i])) {
                break;
            }
            else {
                cnt++;
            }            
        }
        
        if (cnt == after.length()) answer = 1;
        
        return answer;
    }
}