import java.util.Arrays;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        
        // 만들어야하는 문자열 길이
        int length = number.length() - k;
        
        // 그리디
        int flag = 0; // 탐색해야하는 인덱스 (while문 안에서 업데이트)
        int next = 0;
        if (number.length() - k == 1) {
            char[] cArr = number.toCharArray();
            Arrays.sort(cArr);
            answer += cArr[number.length()-1];
            return answer;
        }
        
        if (number.length() - k == 2) {
            int max = 0;
            int idx = -1;
            for (int i = 0; i < number.length()-1; i++) {
                if (number.charAt(i)-'0' > max) {
                    max = number.charAt(i)-'0';
                    idx = i;
                }
            }
            answer += max;
            max = 0;
            for (int i = idx+1; i < number.length(); i++) {
                if (number.charAt(i)-'0' > max) {
                    max = number.charAt(i)-'0';
                    idx = i;
                }
            }
            answer += max;
            return answer;
        }
        while (k > 0) {
            int max = number.charAt(next)-'0';
            
            for (int i = next+1; i <= number.length() - length; i++) {
                int current = number.charAt(i)-'0';
                if (current > max) {
                    max = current;
                    next = i;
                }
            }
            
            answer += max;
            int cutLen = next - flag; // 앞에서 잘라낸 문자 길이
            // System.out.println("잘라야 하는 문자 길이: " + cutLen);
            // System.out.println("k: " + k);
            k -= cutLen; // 잘라야하는 문자 길이
            length--; // 만들어야하는 문자열 길이가 줄어듦
            flag = next;
            flag++;
            next++; // 지금 찾은 제일 큰 숫자 다음부터 탐색하도록
        }
        
        // System.out.println("length: " + length);
        if (length > 0) {
            String remain = number.substring(next, number.length());
            answer += remain;
        }
        
        return answer;
    }
}

// 만들 수 있는 문자의 길이
// numbers.length() - k
// 지금까지 뽑은 글자 수 : answer.length()
// 다음 탐색 대상 인덱스 : next = 0 (while문 안에서 업데이트)
// 첫째자리 수: 뒤에 남은 글자 수가 k-뽑은 글자수이면서 가장 큰 수
// 이걸 cnt가 k를 넘지 않을때까지 반복 while(answer.length() <= length)

//         while (answer.length() < number.length() - k) {
//             int max = number.charAt(next)-'0';
            
//             System.out.println(length + "  ");
//             for (int i = next+1; i < length; i++) {
//             // for (int i = next; i < number.length() - k; i++) {
//                 int current = number.charAt(i)-'0';
//                 if (current > max) {
//                     max = current;
//                     System.out.println("(current > max) max: " + max);
//                     next = i; // 현재 최대인 숫자의 인덱스
//                 }
//             }
            
//             answer += number.charAt(next);
//             next += 1; // 다음 시작 인덱스 이동
//             length += 1;
//             System.out.println("next: " + next);
//         }