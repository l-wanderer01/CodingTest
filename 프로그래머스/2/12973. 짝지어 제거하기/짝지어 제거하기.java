import java.util.Stack;

class Solution
{
    public int solution(String s)
    {   
        // 값이 다른 문자열을 저장
        Stack<Character> stack = new Stack<>();
        
        for (char word : s.toCharArray()) { // s를 CharArray로 변경
            // stack이 비어있지 않고, word가 stack의 가장 상단의 값과 같은지
            if (!stack.isEmpty() && word == stack.peek()) {
                stack.pop();
            }
            else {
                stack.push(word);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
    
}