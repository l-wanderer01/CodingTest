import java.util.*;
import java.io.*;

public class Solution {
    static int[] parent;
    static int cnt, V, E;
    static long res; // 스패닝 트리의 최댓값이 199_999 * 1_000_000이라 20억을 넘는다!
    static int[] groupSize;
    
    static class Edge implements Comparable<Edge> {
        int start;
        int end;
        int weight;
        
        public Edge(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
        
        @Override // 정렬 기준
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }
    
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// T 개수 받음
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
		    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		    
		    V = Integer.parseInt(st.nextToken());
		    E = Integer.parseInt(st.nextToken());
		    
		    Edge[] edges = new Edge[E]; // 간선 입력 저장할 배열
		    
		    for (int i = 0; i < E; i++) {
		        st = new StringTokenizer(br.readLine(), " ");
		        int start = Integer.parseInt(st.nextToken());
		        int end = Integer.parseInt(st.nextToken());
		        int weight = Integer.parseInt(st.nextToken());
		        
		        edges[i] = new Edge(start, end, weight);
		    }
		    
		    Arrays.sort(edges); // 가중치가 가장 낮은 간선들을 순서로
		    
		    parent = new int[V+1]; // 그룹 번호 저장
		    groupSize = new int[V+1]; // 그룹 사이즈 저장
		    res = 0;
		    cnt = 0;
		    
		    makeSet();
		    
		    for (Edge edge : edges) {
                
                boolean isUnion = union(edge.start, edge.end);
                
                if (isUnion) {
                    cnt++; // 모든 정점을 연결했는지 확인하기 위해
                    res += edge.weight;
                }
                if (cnt == V-1) break; // 모든 정점을 연결했다면, 연결된 간선의 수는 정점의 수-1 이기 때문!
            }
		    
		    sb.append("#").append(tc).append(" ").append(res).append("\n");
		    
		}// end of tc
		System.out.print(sb.toString());
	}// end of main
	
	static void makeSet() { // 자기 자신으로 초기화
	    for (int i = 1; i < V+1; i++) {
            parent[i] = i;
            groupSize[i] = 1;
        }
	}
	
	static boolean union(int start, int end) { // 합치기
	    int pStart = find(start);
        int pEnd = find(end);
        
        if (pStart == pEnd) return false;
        
        // 그룹 크기 비교 (그룹 합치기) - Union by Size (최적화)
        if (groupSize[pStart] > groupSize[pEnd]) {
            // 큰 그룹 아래에 작은 그룹 넣기
            parent[pEnd] = parent[pStart];
             // 큰 그룹 사이즈 갱신
            groupSize[pStart] += groupSize[pEnd];
        }
        else {
            parent[pStart] = parent[pEnd];
            groupSize[pEnd] += groupSize[pStart];
        }
        
        return true;
	}
	
	static int find(int v) { // 부모 찾기
	    if (parent[v] == v) return v;
	    
	    return parent[v] = find(parent[v]); // 경로 압축이 같이 되어야 한다!
	}
}// end of class

//// 크루스칼의 핵심!
// 가중치가 가장 낮은 간선들을 순서로 합친다. // edge 클래스를 만들어서 처리
// 이때, 사이클이 발생하지 않도록!

/*
// Kruskal
makeset
union
find

static int[] parent;
static int res, cnt;
edge 클래스 (가중치 기준 정렬)
// 크루스칼의 핵심!
가중치가 가장 낮은 간선들을 순서로 합친다. // edge 클래스를 만들어서 처리
이때, 사이클이 발생하지 않도록!
class Edge implements Comparable {
    compareTo()    
}

T 개수 받음

V와 E 개수 받음

Edge[] edges = new int[E];
for (int i 0 ~ E-1) {
    s(start) e(end) w(weight) 를 3개 받는다.
    edges[i] = new Edge(s, e, w);
}

Arrays.sort(edges); // 가중치가 가장 낮은 간선들을 순서로

parent = new int[V+1];

makeSet();

for (int i = 0 ~ E-1) {
    Edge edge = edges[i]
    
    boolean isUnion = union(edge.start, edge.end)
    
    if (isUnion) {
        cnt++;
        res += edge.weight;
    }
    if (cnt == V-1) break;
}


makeSet() { // 자기 자신으로 초기화
    for (int i = 1; i < V+1; i++) {
        parent[i] = i;
    }
}

boolean union(int start, int end) { // 합치기
    
    pStart = find(start);
    pEnd = find(end);
    
    if (pStart == pEnd) return false;
    
    parent[pStart] = parent[pEnd];
    
    return true;
}

int find(int e) { // 부모 찾기
    if (parent[e] == e) return e;
    
    // 경로 합치기
    return parent[e] = find(parent[e]); // 경로 압축이 같이 되어야 한다!
}

// find에서 경로압축을 한다! (당연한 것!) 다시 부모를 찾을 때, 반복하지 않도록 하기 위해!
*/