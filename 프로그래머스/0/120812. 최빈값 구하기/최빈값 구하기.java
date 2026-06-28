import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        int[] arr = new int[1000];
        
        for (int i = 0; i < array.length; i++) {
            arr[array[i]] += 1;
        }
        
        int max = 0, idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) continue;
            else if (max == arr[i]) idx = -1;
            else {
                if (arr[i] > max) {
                    max = arr[i];
                    idx = i;
                }
            }
        }
        
        return idx;
    }
}