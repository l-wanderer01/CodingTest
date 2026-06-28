import java.lang.Math;
import java.util.Set;
import java.util.stream.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        // 값 3개를 비교하는 가장 좋은 방법
        // 단순 값 비교? 정렬?
        
//         int sum = a + b + c;
        
//         int max = Math.max(a, Math.max(b, c));
//         int min = Math.min(a, Math.min(b, c));
//         int mid = sum - max - min;
        
//         int pow2 = (int)Math.pow(max,2) + (int)Math.pow(mid,2) + (int)Math.pow(min,2);
//         int pow3 = (int)Math.pow(max,3) + (int)Math.pow(mid,3) + (int)Math.pow(min,3);
        
//         if (max == min) {
//             answer = sum * pow2 * pow3;
//         }
//         else if (max != mid && max != min && mid != min) {
//             answer = sum;
//         }
//         else {
//             answer = sum * pow2;
//         }
        
        Set<Integer> numbers = Stream.of(a, b, c).collect(Collectors.toSet());
				
        answer = (a + b + c)
            * (numbers.size() < 3 ? a * a + b * b + c * c : 1)
            * (numbers.size() < 2 ? a * a * a + b * b * b + c * c * c : 1);
        
        return answer;
    }
}