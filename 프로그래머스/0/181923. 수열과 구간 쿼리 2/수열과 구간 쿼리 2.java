class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int start = 0, end = 0, cmp = 0;
        
        for (int i = 0; i < queries.length; i++) {
            start = queries[i][0];
            end = queries[i][1];
            cmp = queries[i][2];
            int min = Integer.MAX_VALUE;
            
            for (int j = start; j <= end; j++) {
                if (arr[j] > cmp && arr[j] < min) {
                    answer[i] = arr[j];
                    min = arr[j];
                }
            }
            
            if (min == Integer.MAX_VALUE) {
                answer[i] = -1;
            }
            
        }
        return answer;
    }
}