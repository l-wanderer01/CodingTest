import java.util.*;

class Solution {
    int answer = -1;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        
        // dfs 하나가 알아서 모든 시작점을 순회합니다.
        dfs(dungeons, 0, k, visited); 
        
        return answer;
    }
    
    public void dfs(int[][] dungeons, int cnt, int k, boolean[] visited) {
        // 1. dfs가 호출될 때마다 최대 방문 횟수 갱신
        answer = Math.max(answer, cnt);
        
        // 2. 모든 던전을 순회
        for (int i = 0; i < dungeons.length; i++) {
            
            // 아직 방문하지 않았고, 남은 피로도가 최소 필요 피로도보다 크거나 같다면
            if (!visited[i] && k >= dungeons[i][0]) {
                
                visited[i] = true; // 방문 처리
                
                // 깊이 탐색 (상태값을 직접 변경하지 않고 연산 결과를 넘김)
                dfs(dungeons, cnt + 1, k - dungeons[i][1], visited);
                
                visited[i] = false; // 방문 복구 (백트래킹)
            }
        }
    }
}