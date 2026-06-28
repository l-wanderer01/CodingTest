import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> answer = new ArrayList<>();
        
        while (n > 1) {
            answer.add(n);
            if (n % 2 == 0) n /= 2;
            else {
                n = 3 * n + 1;
            }
        }
        
        answer.add(n);
        
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}