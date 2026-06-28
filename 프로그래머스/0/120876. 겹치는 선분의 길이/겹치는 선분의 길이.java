import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int size = 0, min = lines[0][0], max = lines[0][1];
        
        // 수평선을 배열로써 저장
        for (int[] arr : lines) {
            min = arr[0] < min ? arr[0] : min;
            max = arr[1] > max ? arr[1] : max;
        }
        
        int[] iArr = new int[max - min];
        
        for (int[] arr : lines) {
            for (int i = arr[0] - min; i < arr[1] - min; i++) {
                iArr[i] += 1;
            }
        }
        
        for (int cnt : iArr) {
            if (cnt > 1) answer++;
        }
        
        return answer;
    }
}