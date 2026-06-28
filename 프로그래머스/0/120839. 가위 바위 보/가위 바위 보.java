import java.util.*;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        Map<String, String> map = new HashMap<String, String>();
        
        map.put("0", "5"); map.put("2", "0"); map.put("5", "2");
        
        String[] sArr = rsp.split("");
        
        for (String str : sArr) {
            answer += map.get(str);
        }
        
        return answer;
    }
}