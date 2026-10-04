import java.io.*;
import java.util.*;

public class Solution {
    static int[] parent;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken()); // 노드 수
            int M = Integer.parseInt(st.nextToken()); // 간선의 수

            parent = new int[N+1];

            // make-set
            for (int i = 1; i <= N; i++) {
                parent[i] = i;
            }

            for (int m = 0; m < M; m++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                union(x, y);
            }

            // 무리 개수 출력
            // 무리 개수는 본인이 대표자인 애들만 세면 된다! (중요!)
            int groupCnt = 0;
            for (int i = 1; i <= N; i++) {
                if (parent[i] == i) groupCnt++;
            }

            sb.append("#").append(tc).append(" ").append(groupCnt).append("\n");
        }
        System.out.print(sb.toString());
    }

    // // find-set (경로 압축 x)
    // static int findSet(int v) { // int를 리턴!
    //     if (v == parent[v]) return v;
    //     return findSet(parent[v]);
    // }

    // find-set (경로 압축 o)
    static int findSet(int v) {
        if (parent[v] == v) return v;
        return parent[v] = findSet(parent[v]); // 경로 압축!
    }

    static void union(int x, int y) {
        int parentX = findSet(x);
        int parentY = findSet(y);
        // if (parentX == parentY) return;
        // (중요) 작은 부모의 값을 큰 부모의 값으로 옮긴다! (x와 y를 옮기는게 아니라!)
        if (parentX != parentY) { // 굳이 parentX와 parentY의 대소비교를 하지 않아도 된다! (문제에서 다른 조건이 주어진다면 여기서 집합의 부모를 대소비교 로직 추가하면 된다!)
            parent[parentY] = parentX;
        }
    }       
}