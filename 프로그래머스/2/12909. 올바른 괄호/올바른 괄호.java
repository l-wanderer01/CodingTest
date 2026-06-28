import java.util.ArrayList;
import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // 내가 생각한 알고리즘
        // "(" 이 괄호라면 stack에 저장
        // ")" 이 괄호라면 stack에 값을 pop
        // 만약 stack에 값이 없을 시 false
        // 끝까지 다 했는데 stack에 값이 남아있을 시 false
        String[] input = s.split(""); // input에 문자열 split
        
        // stack 생성
        Stack<String> stack =  new Stack<String>();
        
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("(")) {
                stack.push(input[i]);
            }
            else if (stack.isEmpty()) {
                answer = false;
                break;
            }
            else {
                stack.pop();
                answer = true;
            }
        }
        
        if (!stack.isEmpty()) {
            answer = false;
        }


        return answer;
    }
}