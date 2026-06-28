import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String[] carr = my_string.split("");
        
        String[] answer = new String[index_list.length];
        
        for (int idx = 0; idx < index_list.length; idx++) {
            answer[idx] = carr[index_list[idx]];
        }

        return String.join("", answer);
    }
}