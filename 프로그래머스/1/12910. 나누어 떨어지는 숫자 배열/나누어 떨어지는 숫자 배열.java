import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        Arrays.sort(arr);
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) al.add(arr[i]);
        }
        
        if (al.size() == 0) al.add(-1);
        
        return al.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}