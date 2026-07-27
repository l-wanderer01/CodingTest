import java.util.*;

class Solution {
    int N;
    int answer = 0;
    public int solution(int n) {
        N = n;
        // index : 행 번호, value : 열 번호, 대각선 비교 편하게 하기 위해 n+1개 생성
        int[] places = new int[n+1];
        Arrays.fill(places, Integer.MIN_VALUE);
        
        dfs(places, 1);
        
        return answer;
    }
    
    public void dfs(int[] arr, int row) {
        // 종료조건 (answer를 언제 더하냐...)
        if (row == arr.length) {
            if (arr[arr.length-1] != Integer.MIN_VALUE) {
                answer++;
            }
            return;
        }
        // 1. 각 행에서 본인이 유일 (1차원 배열로 해결)
        // 2. 각 컬럼에서 본인이 유일 (1차원 배열에 들어있는 value 값들이 본인과 일치하는지 확인)
        for (int col = 1; col <= N; col++) {
            // 한 컬럼에 들어갈때마다 들어가는 조합을 찾아도 N만큼 계속 돌아야 한다.
            // 3. 대각선에서 본인이 유일 (Math.abs 사용), row 끼리의 차와 col 끼리의 차가 같다면 대각선에 존재
            boolean check = true;
            for (int i = 1; i < row; i++) {
                if (arr[i] == col || Math.abs(i-row) == Math.abs(arr[i]-col)) check = false;
                // if (Math.abs(i-row) == Math.abs(arr[i]-col)) check = false;             
            }
            if (check) {
                arr[row] = col;
                dfs(arr, row+1);
            }
        }
    }    
}