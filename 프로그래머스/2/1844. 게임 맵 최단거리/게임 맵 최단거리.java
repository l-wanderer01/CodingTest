import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = Integer.MAX_VALUE; // 최단거리를 구하기 위해 최댓값으로 초기화
        
        // bfs를 위한 queue
        Queue<Node> q = new LinkedList<>();
        // 행 길이
        int N = maps.length;
        // 열 길이
        int M = maps[0].length;
        // 탐색 여부 확인을 위한 배열(공간제한을 고려해 boolean으로 작성)
        boolean[][] checked = new boolean[N][M];
        // 시작 위치
        q.add(new Node(0, 0, 1)); // 해당 위치 시작부터 cnt 증가! (cnt는 1부터 시작!)
        checked[0][0] = true; // 방문 처리
        
        // 상하좌우 반복을 위함
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        while(!q.isEmpty()) {
            // Queue에서 요소 추출
            Node n = q.poll();
            if (n.r == N-1 && n.c == M-1)
                answer = Math.min(answer, n.cnt);
            
            // 상하좌우 반복
            for (int i=0; i<4; i++) {
                // 1. 좌표를 넘는가?[범위 검사] (반드시 필요)
                if (n.r + dr[i]< 0 || n.c + dc[i] < 0 || n.r + dr[i] >= N || n.c + dc[i]>= M)
                    continue;
                // 2. 이미 방문했는가? (반드시 필요)
                if (checked[n.r + dr[i]][n.c + dc[i]])
                    continue; // "버린다"는 의미
                // 3. 길이 막혀있는가? (문제마다 다름)
                if (maps[n.r + dr[i]][n.c + dc[i]] == 0)
                    continue;
                
                // 큐에 노드 삽입
                q.add(new Node(n.r + dr[i], n.c + dc[i], n.cnt + 1));
                // 방문 표시
                checked[n.r + dr[i]][n.c + dc[i]] = true;
            }
        }
        
        // 사방이 막혀있어 접근 불가한 경우
        if (answer == Integer.MAX_VALUE)
            answer = -1;
        
        return answer;
    }
    
    // 좌표 저장
    public static class Node {
        int r;
        int c;
        int cnt; // 해당 좌표까지 움직인 횟수 (이동거리)
        
        public Node(int r, int c, int cnt) {
            this.r = r;
            this.c = c;
            this.cnt = cnt;
        }
    }
}