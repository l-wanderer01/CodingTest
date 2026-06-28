import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = Arrays.stream(myStr.split("[abc]+"))
                            .filter(i -> !i.isEmpty())
                            .toArray(String[]::new); // new String[0] 과 무슨 차이?
        
        return answer.length == 0 ? new String[]{"EMPTY"} : answer;
    }
}