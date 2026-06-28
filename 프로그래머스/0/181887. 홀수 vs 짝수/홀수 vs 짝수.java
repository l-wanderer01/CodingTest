import java.lang.Math;

class Solution {
    public int solution(int[] num_list) {
        // 홀수 번째 원소들의 합
        int odd_sum = 0;
        
        // 짝수 번째 원소들의 합
        int even_sum = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) { // even
                even_sum += num_list[i];
            }
            else { // odd
                odd_sum += num_list[i];
            }
        }
        
        return Math.max(odd_sum, even_sum);
    }
}