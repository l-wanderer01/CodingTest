import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        int len = numbers.length;
        String[] arr = new String[len];
        
        for (int i = 0; i < len; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        
        // String배열을 정렬할 때, 앞뒤 순서를 보고 큰 걸 앞에 두게 만듦
        Arrays.sort(arr, (s1, s2) -> (s1+s2).compareTo(s2+s1));
        StringBuilder sb = new StringBuilder();
        
        for (int i = len - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        
        answer = sb.toString();
        if (answer.charAt(0) == '0') answer = "0";
        
        return answer;
    }
}

// 자료구조?
// 알고리즘? 정렬
// 조건? 일의자리가 큰 순 + 십의자리로 큰 순