import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2]; // 단어의 위치 (index의 위치 % n + 1, index의 위치 / n + 1)
        int idx = -1; // 멈춘 index의 위치 저장
        Stack<String> st = new Stack<>();
        st.push(words[0]);
        // 이전 요소의 끝 문자와 요소의 시작 문자가 다른 경우
        // 이미 언급한 단어를 다시 한번 사용하는 경우
        for (int i = 1; i < words.length; i++) {
            String before = st.peek(); // stack의 가장 상단 요소를 뽑음
            if (before.charAt(before.length() - 1) != words[i].charAt(0)) {
                idx = i;
                break;
            }
            if (st.contains(words[i])) {
                idx = i;
                break;
            }
            st.push(words[i]);
        }
        
        if (idx != -1) {
            answer[0] = idx % n + 1;
            answer[1] = idx / n + 1;
        } 

        return answer;
    }
}