import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            String[] sArr = s.split("[0-9]");
            if (sArr.length != 0) answer = false;
        }
        else return false;

        return answer;
    }
}