import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        int len = times.length;
        
        // 적게 걸리는 심사관부터 정렬
        Arrays.sort(times);
        
        // 1. 탐색 범위 (최상의 경우)
        long min = 1;
        // 2. 탐색 범위 (최악의 경우)
        long max = (long) times[len-1] * n;
        
        // 총 인원 수
        long persons = 0;
        
        // 3. 이분 탐색 시작.
        while (min <= max) {
            // 중간값 (여기서 위아래로 조율) -> 최소와 최대의 값을 일치시킴
            long mid = (min+max)/2;
            persons = 0;
            // 중간으로 걸리는 시간동안 각 심사관이 몇명을 처리할 수 있는지
            for (int i = 0; i < len; i++) {
                persons += (mid/times[i]);
            }
            
            // 처리가능한 사람이 많다(시간이 넉넉) -> 시간 줄인다.
            if (persons >= n) {
                answer = mid;
                max=mid-1;
            }
            // 처리가능한 사람이 적다(시간 부족) -> 시간을 늘인다.
            else {
                min=mid+1;   
            }
        }
        
        return answer;
    }
}