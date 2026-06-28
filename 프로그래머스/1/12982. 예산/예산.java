import java.util.List;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.*;
import java.util.Collections;

class Solution {
    public int solution(int[] d, int budget) {
        // 탐색법 : BFS or DFS
        // stack
        
        Stack<Integer> st = new Stack<>();
        
        // Array -> List
        List<Integer> li = Arrays.stream(d)
                                .boxed() // int -> Integer로 boxing
                                .collect(Collectors.toList());
        
        Collections.sort(li);
        
        int answer = 0;
        int sum = 0;
        
        for (int i = 0; i < li.size(); i++) {
            if (sum + li.get(i) <= budget) {
                st.push(li.get(i));
                sum += li.get(i);
            }
            else {
                break;
            }
        }
        
        return st.size();
    }
}