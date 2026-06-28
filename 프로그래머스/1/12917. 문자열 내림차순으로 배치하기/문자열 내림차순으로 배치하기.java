import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        Arrays.sort(c); // 정렬 성공
        
        // 배열 뒤집기
        for (int i = 0; i < c.length/2; i++) {
            char ch = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = ch;
        }
        
        for (char ch : c) {
            answer += ch;
        }
        
        return answer;
    }
}