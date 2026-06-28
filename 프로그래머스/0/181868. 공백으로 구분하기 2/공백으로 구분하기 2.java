import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        List<String> al = new ArrayList<>();
        
        String[] strList = my_string.split(" ");
        
        for (String str : strList) {
            if (!str.equals("")) al.add(str);
        }
        
        return al.toArray(String[]::new);
    }
}