import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] solution(String s) {
        
        char[] c = s.toCharArray();
        int[] answer = new int[c.length];
        
        Stack<String> st = new Stack<>();
        
        for (int i = 0; i < c.length; i++) {
            String target = String.valueOf(c[i]); // char -> String으로 타입 변환
            if (st.contains(target)) {
                answer[i] = i - st.lastIndexOf(target);
                st.add(target);
            }
            else {
                answer[i] = -1;
                st.add(target);
            }
        }
        
        return answer;
    }
}