class Solution {
    int solution(int[][] land) {
        int answer = 0;
        
        // DP(Dynamic Programming) : 이전 값을 기억하여 다음에 동일한 연산을 못하도록 막음
//         land[1][0] = land[1][0] + Math.max(land[0][1], land[0][2], land[0][3]);
//         land[1][1] = land[1][1] + Math.max(land[0][0], land[0][2], land[0][3]);
//         land[1][2] = land[1][2] + Math.max(land[0][0], land[0][1], land[0][3]);
//         land[1][3] = land[1][3] + Math.max(land[0][0], land[0][1], land[0][2]);
        
//         land[2][0] = land[2][0] + Math.max(land[1][1], land[1][2], land[1][3]);
//         land[2][1] = land[2][1] + Math.max(land[1][0], land[1][2], land[1][3]);
//         land[2][2] = land[2][2] + Math.max(land[1][0], land[1][1], land[1][3]);
//         land[2][3] = land[2][3] + Math.max(land[1][0], land[1][1], land[1][2]);
        
        // ---
        for (int i = 1; i<land.length; i++) {
            land[i][0] += max(land[i-1][1], land[i-1][2], land[i-1][3]);
            land[i][1] += max(land[i-1][0], land[i-1][2], land[i-1][3]);
            land[i][2] += max(land[i-1][0], land[i-1][1], land[i-1][3]);
            land[i][3] += max(land[i-1][0], land[i-1][1], land[i-1][2]);   
        }
        
        // 최종 return은 가장 마지막 행의 최댓값
        // answer = Math.max(land[1][0], land[1][1], land[1][2], land[1][3]);
        
        answer = land[land.length-1][0];
        System.out.println(answer);
        
        for (int i = 1; i < 4; i++){
            int num = Math.max(answer, land[land.length - 1][i]);
            if (answer < num) {
                answer = num;
            }
        }

        return answer;
    }
    
    public int max(int a, int b, int c) {
        return Math.max(Math.max(a,b), c);
    }
}