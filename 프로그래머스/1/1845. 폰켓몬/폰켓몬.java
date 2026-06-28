import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] nums) {
        
        int num = nums.length / 2; // 총 가지고 갈 수 있는 포켓몬 수
        
        // 중복을 제외시키는 방법 (중복을 제외한 요소의 값)
        long cnt = Arrays.stream(nums)
                    .distinct()
                    .count();
        
        int answer = num > (int) cnt ? (int) cnt : num;
        
        return answer;
    }
}