import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        
        Arrays.sort(numbers);
        
        // 음수끼리 곱의 최댓값과 양수끼리 곱의 최댓값 중 큰 값 return
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }
}