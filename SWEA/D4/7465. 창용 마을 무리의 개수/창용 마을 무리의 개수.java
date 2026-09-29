import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    static boolean[] visited;
    static List<List<Integer>> peoples;
    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken()); // 정점 개수
            int M = Integer.parseInt(st.nextToken()); // 엣지 개수
            int group = 0; // 그룹 수 카운트
            peoples = new ArrayList<>(); // 사람들 연결된 그래프
            
            for (int i = 0; i <= N; i++) {
                peoples.add(new ArrayList<>()); // 0~N번까지 노드까지 초기화
            }
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());

                // 양방향 처리
                peoples.get(s).add(e);
                peoples.get(e).add(s);
            }
            
            // 인접리스트 확인
            // printAdjList();

            visited = new boolean[N+1]; // 인맥 방문 처리

            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    bfs(i);
                    group++;
                }
            }
            
            sb.append("#").append(tc).append(" ").append(group).append("\n");
        }
        System.out.println(sb.toString());
    }

    static void bfs(int people) {
        visited[people] = true;
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(people);
        
        while(!q.isEmpty()) {
            int me = q.poll();
            for (int i = 0; i < peoples.get(me).size(); i++) {
                // 나와 연결되어있는 친구를 큐에 넣는다.
                int friend = peoples.get(me).get(i);
                if (!visited[friend]) {
                    q.offer(friend);
                    visited[friend]= true;
                }
            }
        }
    }

    // static void printAdjList() {
    //     System.out.println();
    //     for (int i = 0; i <= N; i++) {
    //         System.out.print(i + " : ");
    //         if (peoples.get(i).isEmpty()) {System.out.println(); continue;}
    //         for (int j = 0; j < peoples.get(i).size(); j++) {
    //             System.out.print(peoples.get(i).get(j) + ", ");
    //         }
    //         System.out.println();
    //     }
    // }
}