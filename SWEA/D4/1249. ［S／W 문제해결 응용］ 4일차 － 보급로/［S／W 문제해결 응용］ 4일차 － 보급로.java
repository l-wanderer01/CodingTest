import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    public static class Node implements Comparable<Node> {
	    int x;
	    int y;
	    int damage;
	    
	    public Node(int x, int y, int damage) {
	        this.x = x;
	        this.y = y;
	        this.damage = damage;
	    }
	    
	    // PriorityQueue에 우선순위 적용을 위한 오버라이딩
	    @Override
	    public int compareTo(Node n) {
	        return Integer.compare(this.damage, n.damage);
	    }
	}
    
	public static void main(String args[]) throws Exception
	{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
        StringBuilder sb = new StringBuilder();
        
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
		    // 복구 소요 시간
		    int time = 0;
			// Queue<Node> q = new LinkedList<>();
			PriorityQueue<Node> pq = new PriorityQueue<>(); // damage가 작은 순서대로 꺼냄
			
			int N = Integer.parseInt(br.readLine());
			int[][] map = new int[N][N];
// 			boolean[][] visited = new boolean[N][N]; // 방문 여부 체크
			int[][] dist = new int[N][N]; // 각 위치별 도착 최소값 저장
			
			for (int i = 0; i < N; i++) {
			    Arrays.fill(dist[i], Integer.MAX_VALUE);
			}
			
			for (int r = 0; r < N; r++) {
			    String row = br.readLine();
			    
			    for (int c = 0; c < N; c++) {
			        map[r][c] = row.charAt(c) - '0';
			    }
			}
			
			// 시작점
			pq.add(new Node(0, 0, 0));
			dist[0][0] = 0;
			
			// 방문하지 않은 곳이 없을 때까지 반복 (queue에 값이 있다면 반복)
			while(!pq.isEmpty()) {
			    Node n = pq.poll();
			    
			    // 현재 queue에서 뽑아온 Node의 인덱스
			    int x = n.x;
			    int y = n.y;
			    
			    // 3. 큐에서 꺼낸 노드 n의 damage가 이미 기록된 최단 거리 dist[n.x][n.y]보다 큰 경우
			    if (n.damage > dist[x][y]) continue;
			    
			    // 상하좌우 반복
			    for (int i = 0; i < 4; i++) {
			        int nr = x + dr[i];
			        int nc = y + dc[i];
			        
    			    // 1. 인덱스를 넘지 않는지 (IndexOutofBoundsException)
    			    if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;
    			    // 2. 방문한 위치의 값과 현재 도달 최소값을 더한 값이 더 작은지
    			    if (dist[nr][nc] <= map[nr][nc] + dist[x][y]) continue;
    			    
    			    dist[nr][nc] = map[nr][nc] + dist[x][y];
    			    pq.add(new Node(nr, nc, dist[nr][nc]));
			    }
			}
			
			// 최종 출력
            sb.append("#").append(test_case).append(" ").append(dist[N-1][N-1]).append("\n");
		}
		System.out.println(sb.toString());
	}
}