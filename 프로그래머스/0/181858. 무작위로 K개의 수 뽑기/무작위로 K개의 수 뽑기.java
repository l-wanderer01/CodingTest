import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        List<Integer> al = new ArrayList<>();
        
        al.add(arr[0]); // 첫 번째 값 저장
        
        for (int num : arr) {
            if (al.contains(num)) continue;
            else {
                al.add(num);
            }
            if (al.size() == k) break;
        }
        
        while(al.size() != k) {
            al.add(-1);
        }
        
        
        return al.stream()
            .mapToInt(Integer::valueOf)
            .toArray();
    }
}