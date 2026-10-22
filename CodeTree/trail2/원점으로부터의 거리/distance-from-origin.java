import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dist = Math.abs(x - 0) + Math.abs(y - 0);
            nodes[i] = new Node(i+1, dist);
        }
        
        Arrays.sort(nodes, (a, b) -> {
            if (a.dist == b.dist) {
                return Integer.compare(a.idx, b.idx);
            }
            return Integer.compare(a.dist, b.dist);
        });

        for (int i = 0; i < n; i++) {
            System.out.println(nodes[i].idx);
        }
    }

    static class Node {
        int dist;
        int idx;
        
        public Node (int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }
}

// 원점에서 가까운 점부터 순서대로 번호 풀력
// 거리가 가까울 시, 번호가 작은 점부터 출력
// 점을 나타내는 클래스를 만든다.
    // 이 클래스는 (0,0)점과의 거리, 본인의 번호를 가진다.
    // 정렬 기준 1. (0,0) 과의 거리 / 2. 본인의 번호