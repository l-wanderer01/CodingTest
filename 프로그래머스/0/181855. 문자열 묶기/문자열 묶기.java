import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[31];
        
        for (String str : strArr) {
            int i = str.length();
            arr[i] += 1;
        }
        
        answer = IntStream.of(arr).max().getAsInt();
        return answer;
    }
}