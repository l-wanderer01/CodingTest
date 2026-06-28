import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        
        int start_idx = -1, end_idx = -1;
        
        // 가장 처음의 index를 탐색
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start_idx = i;
                break;
            }
        }
        
        // 2가 배열에 없다면 -1을 return
        if (start_idx == -1) {
            int[] answer = {-1};
            return answer;
        }
        
        for (int i = arr.length - 1; i >= start_idx; i--) {
            if (arr[i] == 2) {
                end_idx = i;
                break;
            }
        }
        
        int[] answer = Arrays.copyOfRange(arr, start_idx, end_idx + 1);
        
        return answer;
    }
}