import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0, end = arr.length - 1;
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) { // 짝수 start부터 4까지의 idx가 필요
                end = start + query[i];
                // System.out.println(end);
            }
            else { // 홀수
                // start : 1, end : 4
                // start : 2, end : 4
                start = start + query[i];
            }
        }
        
        // copyOfRange 사용
        // 최종 idx = 1 3
        int[] answer = Arrays.copyOfRange(arr, start, end + 1);
        
        return answer;
    }
}