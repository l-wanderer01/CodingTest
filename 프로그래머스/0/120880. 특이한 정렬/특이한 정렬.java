import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Integer[] answer = Arrays.stream(numlist)
                            .boxed()
                            .toArray(Integer[]::new);
        
        Arrays.sort(answer, (x, y) -> {
            int tempX = Math.abs(x - n);
            int tempY = Math.abs(y - n);
            
            if (tempX != tempY) {
                return Integer.compare(tempX, tempY); // 거리 오름차순
            }
            else {
                return Integer.compare(y, x); // 동률이라면 값 큰 순
            }
        });
        
        return Arrays.stream(answer)
                    .mapToInt(Integer::intValue)
                    .toArray();
    }
}