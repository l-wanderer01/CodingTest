import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        Stack st = new Stack();
        
        while (age > 0) {
            st.push(age % 10);
            age /= 10;
        }
        
        while (!st.isEmpty()) {
            int num = (int)st.pop();
            char c = (char)('a' + num);
            answer += "" + c;
        }
        
        return answer;
    }
}