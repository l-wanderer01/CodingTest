import java.util.*;
import java.io.*;

public class Solution {
    static int[][] map;
    static int N;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int[][] dist;
    static final int INF = Integer.MAX_VALUE;
    
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
		    N = Integer.parseInt(br.readLine());
		    map = new int[N][N];
		    
		    for (int i = 0; i < N; i++) {
		        char[] list = br.readLine().toCharArray();
		        for (int j = 0; j < N; j++) {
		            map[i][j] = list[j] - '0';
		        }
		    }// end of map 초기화
		    
		    // 가중치를 계산해서 가장 적은 것들만 선택해서 최종적으로 도달하기 위해 메모하는 큐
		    PriorityQueue<int[]> pq = new PriorityQueue<>(
	            (a, b) -> Integer.compare(a[2], b[2])
	        );
	        
	        // 위치별 최소 누적 비용 저장
	        dist = new int[N][N];
	        for (int r = 0; r < N; r++) {
                Arrays.fill(dist[r], INF);
            }
	        
	        dist[0][0] = 0; // 시작위치 초기화
	        
	        // 시작 값 집어넣음
	        pq.offer(new int[]{0, 0, 0});
	        
	        while(!pq.isEmpty()) {
	            int[] vertex = pq.poll();
	            int x = vertex[0];
	            int y = vertex[1];
	            
	            for (int d = 0; d < 4; d++) {
	                int nr = x + dr[d];
	                int nc = y + dc[d];
	                
	                if (!isinRange(nr, nc)) continue;
	                
	                // 누적 값 업데이트
	                if (dist[nr][nc] > dist[x][y] + map[nr][nc]) {
	                    dist[nr][nc] = dist[x][y] + map[nr][nc];
	                    pq.offer(new int[]{nr, nc, map[nr][nc]});
	                }
	            }
	        }
		    sb.append("#").append(tc).append(" ").append(dist[N-1][N-1]).append("\n");
		} // end of tc
		System.out.print(sb.toString());
    }// end of main
    
    static boolean isinRange(int r, int c) {
        return (r >= 0 && r < N && c >= 0 && c < N);
    }
} 

/*
////// 다익스트라로 생각하고 푼 방식
// 복구 시간이 가장 짧은 경로에 대한 총 복구 시간
// 칸을 다 복구해야 다음 칸으로 이동 가능
-> 그러면 이거 다익스트라?
가중치가 가장 적은 길로 가야하니까. 아니면? 일단 다익스트라로.
방문하지 않은 곳 중 가장 적은 것

// 다익스트라면 연결리스트로 만들어야하네.. 근데 이거 "격자 그래프"로 인풋이 들어오는데, 상관없나? 상관없다 4방 돌리면서 방문체크하면서 PQ로 박아넣고 한다.

// 배열을 인풋으로 박아서 map 초기화
// 0,0부터 N-1,N-1까지

1. 간선 리스트를 인접 리스트로 바꿔서 생각하기 위해 v, e, w로 변환해 생각
    v : 각 자리의 x,y
    e : 4방으로 연결된 애들
    w : 이동하려는 정점의 숫자
    
2. 다익스트라는 dist[][] 배열로 각 정점에 도달할 수 있는 최소값을 저장하며 간다!
    - dist[][] 배열은 INF값으로 초기화
    - dist[0][0]은 0으로 초기화
    - dist[r][c]는 해당 위치에 도달할 수 있는 최소의 값을 저장해나간다.
    static final INF = Integer.MAX_VALUE;
    dist = new int[N][N];
    for (int r = 0; r < N; r++) {
        Arrays.fill(dist[i], INF);
    }
    dist[0][0] = 0;
    
    
3. 누적 비용을 어떻게 계산할 것인가
    - (0,1)에 도달하는 새로운 누적 비용은 어떤 수식으로 계산할 수 있을까?
        지금 도달한 경로 + 새로 가려는 칸
        int cost = dist[r][c] + map[nr][nc];
    - 새로 계산한 비용과 dist[0][1]을 비교해서, 어떤 조건일 때 값을 갱신해야 할까?
        cost < dist[0][1] ? cost : dist[0][1];
    - 이미 dist[0][1] = 1인 상황에서 새로운 경로의 누적 비용이 3이라면 갱신해야 할까? 그 이유는?
        갱신하면 안된다. 새로운 경로가 기존의 경로보다 누적 비용이 크기 때문
4. PQ 도입의 타당성
    - 일반적인 Queue(FIFO)를 사용하면 어떤 정점부터 탐색하게 될까?
        그냥 제일 앞에있는거 먼저
    - 다익스트라에서는 A(10), B(2), C(5) 중 어떤 정점부터 탐색하는 것이 적절할까?
        B(2)
    - 왜 누적 비용이 가장 작은 정점부터 탐색해야 할까? 가중치가 모두 1인 BFS와 비교해서 생각해 봐.
        여태까지 업데이트된 값들이 최소값이 아닐 수 있기 때문에 업데이트 치면서 가야한다!
    
    PriorityQueue<int[]> pq = new PriorityQueue<>( // implements Comparator, Comparable, compare, compareTo 얘네의 차이가 대체 뭐여
        (a, b) -> Integer.compare(a[2], b[2]);
    );
    
    pq.offer(new int{0,0,0})
// 걍 4방 탐색하면서 제일 적은 곳으로 방문처리 하면 되나.
dr = {-1, 1, 0, 0}
dc = {0, 0, -1, 1}

범위 체크 isinRange(int x, int y)
*/