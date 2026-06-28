import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                al.add(arr[i]);
            }
        }
        
        return al.stream()
            .mapToInt(Integer::valueOf)
            .toArray();
    }
}