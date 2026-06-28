import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        while(!s.equals("1")) {
            String tmp = s.replace("0", "");
            answer[1] += s.length() - tmp.length(); // 제거된 0의 개수
            s = binary(tmp.length()); // s에 자리수를 이진수로 변환하는 함수의 리턴 값을 준다
            answer[0]++;
        }
        
        return answer;
    }
    
    public String binary(int len) { // 자리수를 이진수로 변환하는 함수
        StringBuilder sb = new StringBuilder();
        
        while(len > 0) {
            if (len == 1) { // 값이 1이라면 1을 이진수에 추가 후 len을 0으로 초기화
                sb.append("1");
                break;
            }
            int remain = len % 2;
            len = len / 2;
            sb.append(remain);
        }
        
        // 전체 배열을 뒤집어 return
        sb.reverse();
        
        return sb.toString();
    }
}