import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        
        String[] answer = {};
        List<String> al = new ArrayList<>();
        for (String str : strArr) {
            if (!str.contains("ad")) al.add(str);
        }
        
        return al.toArray(String[]::new);
    }
}