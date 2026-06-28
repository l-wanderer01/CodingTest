import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = Integer.toString(n); // 문자열 변환
        
        String[] str1 = str.split(""); // 문자열 분할
        
        for (int i = 0; i < str1.length; i++) {
            answer += Integer.parseInt(str1[i]); // 문자를 숫자로 변환
        }
        
        

        return answer;
    }
}