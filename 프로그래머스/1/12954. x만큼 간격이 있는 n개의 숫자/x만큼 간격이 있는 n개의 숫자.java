import java.util.ArrayList;

class Solution {
    public long[] solution(int x, int n) {
        ArrayList<Long> arr = new ArrayList<Long>();
        
        for (long i = 1; i <= n; i++) {
            long result = x*i;
            arr.add(result);
        }
        
        // Long -> long answer에 저장
        long[] answer = arr.stream()
                            .mapToLong(Long::longValue) // == (i -> i.longValue())
                            .toArray();

        return answer;
    }
}