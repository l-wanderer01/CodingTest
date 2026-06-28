import java.util.*;
import java.util.stream.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> result = new Stack<>();
        
        result.push(arr[0]); // 첫 번째 값은 무조건 저장
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]){
                result.push(arr[i]);
            }
        }
        
        int[] answer = result.stream()
            .mapToInt(i -> i)
            .toArray();
        return answer;
    }
}