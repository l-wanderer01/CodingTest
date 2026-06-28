import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        Stack<String> stack1 = new Stack();
        Stack<String> stack2 = new Stack();
        
        for (int i = cards1.length - 1; i >= 0; i--) {
            stack1.push(cards1[i]);
        }
        
        for (int i = cards2.length - 1; i >= 0; i--) {
            stack2.push(cards2[i]);
        }      
        
        int cnt = 0; // goal의 요소 수와 pop한 요소의 개수 비교 저장 변수
        for (String s : goal) {
            if (!stack1.empty() && stack1.peek().equals(s)) {
                stack1.pop();
                cnt++;
            }
            else if (!stack2.empty() && stack2.peek().equals(s) ) {
                stack2.pop();
                cnt++;
            }
        }
        
        // 2 ≤ goal의 길이 ≤ cards1의 길이 + cards2의 길이
        
        answer = (cnt == goal.length) ? "Yes" :"No";
        
        return answer;
    }
}