import java.util.*;
import java.io.*;

public class Solution {
    static int N, K, res;
    static int[][] map; // 초기 맵
    static int[][] start; // 시작 가능 위치 저장 (map에서 값이 가장 큰 값들의 위치)
    static boolean[][] visited; // 방문처리
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    		N = Integer.parseInt(st.nextToken());
    		K = Integer.parseInt(st.nextToken());
    		int max = 0; // 현재 map에서 가장 큰 값
    		map = new int[N][N];
    		for (int r = 0; r < N; r++) {
    		    st = new StringTokenizer(br.readLine(), " ");
    		    for (int c = 0; c < N; c++) {
    		        map[r][c] = Integer.parseInt(st.nextToken());
    		        if (map[r][c] > max) max = map[r][c]; // map의 최댓값 업데이트
    		    }
    		}
    		
    		start = new int[5][2]; // map에서 가장 큰 값들의 위치 저장 (최대 5개라 했으므로 5개 저장)
    		int cntMax = 0; // 최댓값의 총 개수 (start를 모두 다 돌지 않기 위함)
    		// 최댓값 찾아서 저장
    		for (int r = 0; r < N; r++) {
    		    for (int c = 0; c < N; c++) {
    		        if (map[r][c] == max) { // 최댓값 위치 저장
    		            start[cntMax][0] = r;
    		            start[cntMax][1] = c;
    		            cntMax++;
    		        }
    		    }
    		}
    		
    		res = 0; // 최대 경로 저장
    		visited = new boolean[N][N]; // 방문 여부 저장
    		for (int i = 0; i < cntMax; i++) {
                makeLoad(start[i][0], start[i][1], 1, false); // depth가 1부터 시작하는 건, 처음 본인 위치가 경로 길이에 포함되기 때문
            }
            
            sb.append("#").append(tc).append(" ").append(res).append("\n");
		}
		System.out.print(sb.toString());
	}
	
	static void makeLoad(int r, int c, int depth, boolean cut) { // cut: 등산로를 깎았는지 확인
        // 이 문제는 기저조건이 필요없다! (4방 탐색이 안되는 그때, 알아서 종료되기 때문)
        if (res < depth) { // 최대 거리인지 확인
            res = depth;
        }
        
        visited[r][c] = true;
        for (int i = 0; i < 4; i++) { // 4방 탐색
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (!isinRange(nr, nc) || visited[nr][nc]) { // 범위 체크
                continue;
            }
            int nextHeight = map[nr][nc]; // 이동할 위치의 높이 저장 (공사를 한다면 원래 상태로 돌리기 위해)
            
            // 공사 필수
            if (map[nr][nc] >= map[r][c]) {
                if (cut) continue; // 이미 잘랐다면 더 못자르고 못움직이게 함
                // map의 크기보다 1 작아지게 그 칸을 줄인다.
                if (map[nr][nc] - K >= map[r][c]) continue; // K 범위 내에서 잘랐을 때, 지금 높이보다 낮아지는지 확인
                map[nr][nc] = map[r][c] - 1; // 지금 위치의 높이보다 1칸 낮으면 됨
                makeLoad(nr, nc, depth+1, true);
                map[nr][nc] = nextHeight; // 변경한 높이 복구
            }
            // 공사 필요 x
            else {
                makeLoad(nr, nc, depth+1, cut); // cut 여부를 매개변수에 전달
            }
        }
        visited[r][c] = false;
    }
    
    static boolean isinRange(int r, int c) {
        return (r >= 0 && r < N && c >= 0 && c < N);
    }
}