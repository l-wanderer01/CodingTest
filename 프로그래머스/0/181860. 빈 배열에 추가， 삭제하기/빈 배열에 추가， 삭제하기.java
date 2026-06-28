import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    al.add(arr[i]);
                }
            }
            else {
                for (int j = 0; j < arr[i]; j++) {
                    al.remove(al.size() - 1);
                }
            }
        }

        return al.stream()
            .mapToInt(Integer::valueOf)
            .toArray();
    }
}