class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for (int idx = 0; idx < queries.length; idx++) {
            int[] query = queries[idx];
            
            int s = query[0], e = query[1], k = query[2];
            
            for (int i = s; i <= e; i++) {
                
                if (i % k == 0) {
                    arr[i] += 1;
                }
            }
        }
        
        return arr;
    }
}