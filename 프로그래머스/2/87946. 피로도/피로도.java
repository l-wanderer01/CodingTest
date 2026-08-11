import java.util.*;

class Solution {
    int answer = -1;
    public int solution(int k, int[][] dungeons) {
        
        // 현재 체력
        int hp = k;
        // 방문여부 체크
        boolean[] visited = new boolean[dungeons.length];
        
        // 모든 경우의 수 조회
        dfs(dungeons, visited, hp, 0);
        
        return answer;
    }
    
    // 완전탐색 (DFS)
    public void dfs(int[][] dungeons, boolean[] visited, int hp, int cnt) {
        answer = Math.max(answer, cnt);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= hp) {
                visited[i] = true;
                dfs(dungeons, visited, hp - dungeons[i][1], cnt+1);
                visited[i] = false;
            }
        }
    }
}

// 알고리즘 : DFS
// 자료구조 : 배열
// 조건 : 지금의 체력이 던전 입장 가능한지