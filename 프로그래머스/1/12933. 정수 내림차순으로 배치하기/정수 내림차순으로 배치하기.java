import java.util.stream.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = Long.toString(n);
        
        String[] str1 = str.split("");
        
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < str1.length; i++) {
            list.add(str1[i]);
        }
        
        list = list.stream()
            .sorted(Comparator.reverseOrder()) // 정렬 (내림차순은 어떻게?)
            .collect(Collectors.toList()); // List로 반환
        
        // 문자열 배열을 문자열로 합하기..
        str = String.join("", list);
            
        // 문자열을 long 형으로 파싱
        answer = Long.parseLong(str);
        
        return answer;
    }
}