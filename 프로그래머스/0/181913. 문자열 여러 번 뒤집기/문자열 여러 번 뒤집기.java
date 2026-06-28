import java.util.Stack;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        String[] sarr = my_string.split("");
        
        for (int[] q : queries) {
            for (int i = 0; i <= (q[1] - q[0])/2; i++) {
                String tmp = sarr[i + q[0]];
                sarr[i + q[0]] = sarr[q[1] - i];
                sarr[q[1] - i] = tmp;
            }
        }
        
        return String.join("", sarr);
    }
}