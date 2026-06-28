import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int sum = 0;
        
        // stream 활용
        // int sum = IntStream.of(num_list).sum();
        
        for (int i: num_list) {
            mul *= i;
            sum += i;
        }
        
        return sum * sum > mul ? 1 : 0;
    }
}