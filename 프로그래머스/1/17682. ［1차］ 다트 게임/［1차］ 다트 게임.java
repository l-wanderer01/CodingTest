import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        Stack<Integer> st = new Stack<>();
        
        // Stack에 정수 저장
        for (int i = 0; i < dartResult.length(); i++) {
            int num = 0;
            if (dartResult.charAt(i) == 'S' || dartResult.charAt(i) == 'D' || dartResult.charAt(i) == 'T') {
                if (i >= 2 && dartResult.charAt(i - 2) == '1') num = 10;
                else {
                    num = dartResult.charAt(i - 1) - '0';
                }
                if (dartResult.charAt(i) == 'D') num = num * num;
                else if (dartResult.charAt(i) == 'T') num = num * num * num;
                st.add(num);
            }
        }
        
        int star = 1; // 누적 곱
        
        for (int i = dartResult.length() - 1; i >= 0; i--) {
            if (dartResult.charAt(i) == '*') {
                star *= 2;
            }
            if (dartResult.charAt(i) == 'S' || dartResult.charAt(i) == 'D' || dartResult.charAt(i) == 'T') {
                int shap = i + 1 != dartResult.length() && dartResult.charAt(i + 1) == '#' ? -1 : 1;
                // 가장 마지막이 *라면 첫 숫자를 결과에서 뺌 (*는 해당 수와 직전의 수에 각각 2를 곱하기에 총 3개의 숫자 중 첫 숫자는 포함이 되지 않음)
                if (dartResult.charAt(dartResult.length() - 1) == '*' && st.size() == 1) {
                    star /= 2;
                }
                answer += st.pop() * star * shap;
                System.out.println(answer);
            }
        }
        
        return answer;
    }
}