import java.util.Arrays;
// import java.util.Collectors;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        // 문자열 중간에 바꾸기
        char[] myArr = my_string.toCharArray();
        
        char[] overArr = overwrite_string.toCharArray();
        
        for (int i = 0; i < overArr.length; i++) {
            myArr[s + i] = overArr[i];
        }
        
        return String.valueOf(myArr);
    }
}