import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        // phone_number의 길이 파악
        // 그 길이의 뒤 넷만 남기고 나머지는 * 처리
        
        String[] arr = phone_number.split("");
        List<String> list = new ArrayList<>();
        
        int last = arr.length - 4;
        int i = 0;
        
        while (i < last) {
            list.add("*");
            i++;
        }
        
        for (int j = 0; j < 4; j++) {
            list.add(arr[last + j]);
        }
        
        // list를 String으로 변환
        answer = String.join("", list);
        
        return answer;
    }
}