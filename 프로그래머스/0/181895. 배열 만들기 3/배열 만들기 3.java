class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0], a2 = intervals[0][1];
        int b1 = intervals[1][0], b2 = intervals[1][1];
        
        int[] answer = new int[a2 - a1 + b2 - b1 + 2];
        
        for (int i = 0; i < answer.length; i++) {
            if (i < a2 - a1 + 1) {
                answer[i] = arr[i + a1];
            }
            else {
                answer[i] = arr[b1++];
            }
        }
        
        return answer;
    }
}