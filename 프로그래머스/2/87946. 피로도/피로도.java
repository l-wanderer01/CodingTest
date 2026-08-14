import java.util.*;

class Solution {
    int answer = -1;
    int hp;
    boolean[] visited;
    int[][] dungeons;
    public int solution(int k, int[][] dungeons) {
        
        // 현재 체력
        this.hp = k;
        // 방문여부 체크
        visited = new boolean[dungeons.length];
        this.dungeons = dungeons; // 동일한 변수명이기에 this로 지정
        // 모든 경우의 수 조회
        dfs(hp, 0);
        
        return answer;
    }
    
    // 완전탐색 (DFS)
    public void dfs(int hp, int cnt) {
        if (answer < cnt) {
            answer = cnt;
        }
        // answer = Math.max(answer, cnt); // 위의 코드와 동일하게 동작
        
        // 모든 던전을 다 도는 경우를 찾았다면 그 즉시 종료
        if (dungeons.length == cnt) {
            answer = cnt;
            return;
        }
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= hp) {
                visited[i] = true;
                // int currentHp = hp - dungeons[i][1];
                // int currentCnt = cnt+1;
                // dfs(currentHp, currentCnt);
                dfs(hp-dungeons[i][1], cnt+1);
                
                visited[i] = false;
            }
        }
    }
}

// 알고리즘 : DFS
// 자료구조 : 배열
// 조건 : 지금의 체력이 던전 입장 가능한지