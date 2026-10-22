import java.util.*;

class Solution {
    // Stack 사용!
    public String solution(String number, int k) {
        String answer = "";
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        // 첫 번째 숫자는 비교할 이전 숫자가 없으므로 먼저 추가
        st.push(number.charAt(0));
        // 두 번째 숫자부터 순서대로 탐색
        for (int i = 1; i < number.length(); i++) {
            // 스택에 들어있는 값과 지금 넣을 값을 비교한다.
            char current = number.charAt(i);
            
            // 앞자리를 크게 만들기 위해 현재 숫자보다 작은 이전 숫자들을 제거
                // 단, 스택이 비어 있지 않고 제거 가능 횟수(k)가 남아 있어야 함
            while(!st.isEmpty() && st.peek() < current && k != 0) {
                st.pop();
                k--;                
            }
            
            // 이전 숫자들 중 제거할 수 있는 숫자를 정리한 뒤
            // 현재 숫자를 다음 자릿수 후보로 추가
            st.push(current);
        }
        
        // 모든 숫자를 확인한 후에도 k가 남았다면 뒤쪽부터 제거
        // 제거할 기회가 남아 있다는 것은 남은 숫자들이 내림차순(같은 숫자 포함)이라는 뜻
        // 따라서 뒤쪽 숫자를 제거해야 더 큰 수를 유지할 수 있음
        // ex) 9876, k=2 → 뒤에서 6, 7 제거 → 98
        for (int i = 0; i < k; i++) {
            st.pop();
        }
        
        // 만들어진 숫자를 스택에서 뽑는다.
        while(!st.isEmpty()) {
            char c = st.pop();
            sb.append(c);
        }
        // 스택은 LIFO니까 reverse로 뒤집는다!
        answer = sb.reverse().toString();
        return answer;
    }
}