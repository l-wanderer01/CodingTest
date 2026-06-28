import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        // 문자열을 split으로 나눈다.
        String[] input = s.split(" ");
        
        // split된 문자열을 정수형으로 변환
        int[] tmp = Arrays.stream(input)
            .mapToInt(Integer::parseInt)
            .toArray();
        
        // tmp에서 최댓값, 최솟값 찾기
        int max = Arrays.stream(tmp)
            .max() // OptionalInt로 값을 가지고 옴
            .getAsInt(); // max()로 가지고 올 때, OptionalInt로 값을 가지고 오기 때문에 getAsInt()로 OptionalInt의 값을 꺼내야 함
        
        int min = Arrays.stream(tmp)
            .min()
            .getAsInt();
        
        
        String answer = min + " " + max;
        // 중복을 제거
        return answer;
    }
}