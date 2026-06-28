import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int num : numlist) {
            if (num % n == 0) {
                al.add(num);
            }
        }
        
        return al.stream()
                .mapToInt(Integer::valueOf)
                .toArray();
    }
}