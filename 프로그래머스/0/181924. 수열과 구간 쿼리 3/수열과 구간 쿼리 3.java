import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        // arr의 원소 값을 변경한다! -> 인덱스로 접근
        
        // 원소의 값을 변경
        for (int i = 0; i < queries.length; i++) {
            
            int index1 = queries[i][0]; // 0
            int index2 = queries[i][1]; // 3
            
            int temp = arr[index1]; // 0 1
            arr[index1] = arr[index2]; // 3
            arr[queries[i][1]] = temp; // 0

        }
        
        return arr;
    }
}