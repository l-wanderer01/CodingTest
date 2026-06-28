import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        Stack<Integer> stk = new Stack<>();
        
        for (int num : arr) {
            if (stk.isEmpty()) stk.push(num);
            else if (stk.peek() == num) stk.pop(); // 마지막 원소 제거
            else {
                stk.push(num);
            }
        }
        
        if (stk.isEmpty()) stk.push(-1);
        
        return stk.stream()
            .mapToInt(Integer::valueOf)
            .toArray();
    }
}