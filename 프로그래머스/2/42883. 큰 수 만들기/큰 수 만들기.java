import java.util.*;

class Solution {
    // Stack 사용!
    public String solution(String number, int k) {
        String answer = "";
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        st.push(number.charAt(0));
        
        for (int i = 1; i < number.length(); i++) {
            // 스택에 들어있는 값과 지금 넣을 값을 비교한다.
            char current = number.charAt(i);
            
            // 
            while(!st.isEmpty() && st.peek() < current) {
                if (k == 0) break;
                // System.out.println(i + ": " + st.peek() + " | " + current);
                st.pop();
                k--;                
            }
            
            st.push(current);
        }
        
        for (int i = 0; i < k; i++) {
            st.pop();
        }
        
        while(!st.isEmpty()) {
            char c = st.pop();
            sb.append(c);
        }
        
        answer = sb.reverse().toString();
        return answer;
    }
}