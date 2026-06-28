class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        
        // 방향: 오른쪽, 아래, 왼쪽, 위
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int dir = 0; // 방향 인덱스
        
        int x = 0, y = 0;

        for (int i = 1; i <= n * n; i++) {
            answer[x][y] = i;
            visited[x][y] = true;
            
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            // 경계를 벗어나거나 이미 방문한 경우 방향 전환
            if (nx < 0 || ny < 0 || nx >= n || ny >= n || visited[nx][ny]) {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            
            x = nx;
            y = ny;
        }
        
        return answer;
    }
}