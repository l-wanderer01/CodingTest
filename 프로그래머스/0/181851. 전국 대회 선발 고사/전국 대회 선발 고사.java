import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] arr = new int[rank.length];
        Arrays.fill(arr, 100);
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                arr[i] = rank[i];
            }
        }
        
        Arrays.sort(arr);

        int first = arr[0], second = arr[1], third = arr[2];
        int a = 0, b = 0, c = 0;
        
        for (int i = 0; i < rank.length; i++) {
            if (rank[i] == first) a = i;
            else if (rank[i] == second) b = i;
            else if (rank[i] == third) c = i;
        }
        
        return a * 10000 + b * 100 + c;
    }
}