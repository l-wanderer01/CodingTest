import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) al.add(i);
        }
        
        return al.stream()
                .mapToInt(Integer::valueOf)
                .toArray();
    }
}