import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Map<String, Integer> num = new HashMap<String, Integer>();
        // s를 배열로 저장
        num.put("zero", 0);
        num.put("one", 1);
        num.put("two", 2);
        num.put("three", 3);
        num.put("four", 4);
        num.put("five", 5);
        num.put("six", 6);
        num.put("seven", 7);
        num.put("eight", 8);
        num.put("nine", 9);
        
        for (String key : num.keySet()) {
            s = s.replace(key, String.valueOf(num.get(key)));
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}