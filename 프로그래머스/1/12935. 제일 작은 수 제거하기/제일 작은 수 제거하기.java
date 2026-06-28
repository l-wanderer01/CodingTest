import java.util.*;
import java.util.stream.*; // Collectors 사용

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        ArrayList<Integer> al = (ArrayList<Integer>) Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        
        int min = arr[0]; // int형의 가장 큰 값
        
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i], min); // 최솟값 탐색
        }
        
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == min) al.remove(i);
        }     
        
        return al.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}