import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    int T = 10;
    	for (int tc = 1; tc <= T; tc++) {
		    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		    int V = Integer.parseInt(st.nextToken()); // 노드 개수
		    int E = Integer.parseInt(st.nextToken()); // 간선 개수
		    
		    // 각 노드별 본인에게 오는 간선 개수 저장할 배열
		    int[] in = new int[V+1]; // 0번은 없다!
		    // 인접리스트 생성
		    List<Integer>[] edges = new ArrayList[V+1];
		    // 인접리스트 초기화
		    for (int i = 1; i <= V; i++) {
		        edges[i] = new ArrayList<>();
		    }
		    
		    // 다음줄 읽어옴
		    st = new StringTokenizer(br.readLine(), " ");
		    // 값에 맞게 인접리스트 생성
		    for (int i = 0; i < E; i++) {
		        int start = Integer.parseInt(st.nextToken());
		        int end = Integer.parseInt(st.nextToken());

		        edges[start].add(end);
		        in[end]++;
		    }
		    
		    // 다음에 처리할 노드 저장할 큐
		    Queue<Integer> q = new ArrayDeque<>();
		    
		    // 본인에게 오는 간선이 없는 노드는 모두 queue에 넣는다.
		    for (int i = 1; i <= V; i++) {
		        if (in[i] == 0) q.offer(i);
		    }
		    // 연결된 노드 저장
		    StringBuilder res = new StringBuilder();
		    
		    // 큐가 비어있지 않을때까지 반복
		    while(!q.isEmpty()) {
		        // 처리할 노드 꺼냄
		        int node = q.poll();
		        res.append(node).append(" ");
		        
		        // 작업한 node가 연결된 간선 사용 처리
		        for (int to : edges[node]) {
		            // 현재 처리한 노드와 연결된 다른 노드의 연결된 간선의 개수 감소
		            in[to]--;
		            // 본인에게 오는 간선이 없는 노드면 이를 queue에 넣는다.
		            if (in[to] == 0) {
    		            q.offer(to);
    		        }
		        }
		    }
		    sb.append("#").append(tc).append(" ").append(res.toString()).append("\n");
    	}
    	System.out.print(sb.toString());
	}
}