import java.util.*;

// Greedy 사용!
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // HashMap을 사용해 key, value로 값 저장
        Map<Integer, Integer> hm = new HashMap<>();
        
        for (int i : tangerine) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> al = new ArrayList<>(hm.values());
        
        al.sort(Collections.reverseOrder());
        
        for (int i : al) {
            k -= i;
            answer++;
            if (k <= 0) break;
        }        
        
        return answer;
    }
}