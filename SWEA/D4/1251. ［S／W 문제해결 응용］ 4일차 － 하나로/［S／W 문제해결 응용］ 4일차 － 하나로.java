import java.util.*;
import java.io.*;

public class Solution {
    static int V, cnt; // V: 정점 개수, cnt: 모든 정점 방문했는지 체크
    static double E; // E: 세율
    static long L; // L: 누적 거리
    static int[] X, Y;
    static long[] minDist;
    static boolean[] visited;
    
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
		    V = Integer.parseInt(br.readLine());
		    
		    StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		    StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		    X = new int[V];
		    Y = new int[V];
		    visited = new boolean[V];
		    minDist = new long[V];
		    cnt = 0;
		    // minDist를 INF로 초기화
		    Arrays.fill(minDist, Long.MAX_VALUE);
		    
		    for (int i = 0; i < V; i++) {
		        X[i] = Integer.parseInt(st1.nextToken());
		        Y[i] = Integer.parseInt(st2.nextToken());
		    }
		    E = Double.parseDouble(br.readLine());
		    L = 0;
		    
		    visited[0] = true;
		    minDist[0] = 0;
		    // 처음 들어온걸 출발점으로!
		    Prim(X[0], Y[0]);
		    
		    long res = Math.round(E*L);
		    
		    sb.append("#").append(tc).append(" ").append(res).append("\n");
		}// end of tc
		System.out.print(sb.toString());
	}// end of main
	
	static void Prim(int x, int y) {
	    // 기저조건
	    if (cnt == V - 1) return; // 모든 정점 방문 시 종료
	    
	    // 지금 들어온 정점에 대해 모든 정점들이 거리 계산
	    for (int i = 0; i < V; i++) {
	        // 방문 여부 확인 및 minDist 업데이트
	        if (visited[i]) continue;
	        // 각 노드별 그룹에 연결될 수 있는 최소 비용 업데이트
	        calcMinDist(x, y, X[i], Y[i], i);
	       // System.out.print(i + ": " + minDist[i] + " ");
	    }
	   // System.out.println();
	    
	    // 지금까지 방문하지 않은 정점의 minDist 중 최솟값을 가진 정점 idx
        int idx = calcMinimum();
        L += minDist[idx];
        visited[idx] = true;
        cnt += 1;
        Prim(X[idx], Y[idx]);
	}
	
	// 현재 그룹에 대해 정점을 연결할 수 있는 최소 거리 계산
	static void calcMinDist(int x, int y, int xi, int yi, int idx) { // x: 새롭게 업데이트된 x, y: 새롭게 업데이트 된 y, xi: Dist계산할 대상 x, yi: Dist계산할 대상 y
	    long dx = (long) xi - x;
        long dy = (long) yi - y;
        
        long newDist = dx * dx + dy * dy;
	    
	    if (minDist[idx] > newDist) minDist[idx] = newDist;
	}
	
	// minDist 중 방문하지 않은 애들 중 최솟값 찾기
	static int calcMinimum() {
	    int idx = -1;
	    Long min = Long.MAX_VALUE;
	    for (int i = 0; i < V; i++) {
	        if (!visited[i] && min > minDist[i]) {
	            min = minDist[i];
	            idx = i;
	        }
	    }
	    return idx;
	}
	
}// end of class