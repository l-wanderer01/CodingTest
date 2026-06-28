import java.lang.Math;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int length = 0, height = 0;
        
        // 가로와 세로 중 긴 길이를 가로 길이로 넣음
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        
        for (int i = 0; i < sizes.length; i++) {
            length = Math.max(length, sizes[i][0]);
            height = Math.max(height, sizes[i][1]);
        }
        
        answer = length * height;
        
        return answer;
    }
}