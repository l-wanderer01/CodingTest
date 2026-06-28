import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            boolean b = true;
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    b = false;
                    break;   
                }
            }
            if (b) al.add(arr[i]);
        }
        
        return al.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}