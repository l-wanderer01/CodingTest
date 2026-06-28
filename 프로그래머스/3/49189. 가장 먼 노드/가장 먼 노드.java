import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        
        // n: 그래프의 정점의 개수
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for (int i = 0; i < n + 1; i++) { // 이게 왜 + 1이어야 하는가? 인덱스와 노드 번호를 일치시키기 위해 0번 인덱스는 dummy로 두기 위함! 
            graph.add(new ArrayList<>()); // 각 노드별 리스트를 만듦
        }
        
        // 노드에 맞는 간선을 입력
        for (int i = 0; i < edge.length; i++) { // size() 메서드를 이용해 ArrayList 안의 객체의 개수를 가지고 올 수 있음
            putEdge(graph, edge[i]);
        }
        
        //print(graph, n);
        // 1을 제외한 배열의 첫 요소를 꺼내 간선 리스트에서 해당 요소를 포함한 간선을 찾는다
        // i를 가진 간선을 탐색하는 알고리즘, 순차 탐색
        
        // visited: 방문 횟수 저장
        ArrayList<Integer> visited = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            visited.add(0); // visited를 모두 0으로 초기화
        }
        
        // queue
        Queue<int[]> queue = new LinkedList<>(); // 노드 방문 여부와 거리를 저장
        queue.offer(new int[]{1, 0}); // 노드 번호, 거리
        
        visited.set(1, 1); // 방문 check
        
        bfs(graph, queue, visited); // bfs 동작
        
        
        int max = findMostVisited(visited); // 가장 많이 방문한 노드 검색
        
        int count = 0;
        for (int i = 0; i < visited.size(); i++) {
            if (visited.get(i) == max) {
                count++;
            }
        }

        int answer = count;
        
        return answer;
    }
    
    // graph의 node에 edge 추가
    public void putEdge(ArrayList<ArrayList<Integer>> graph, int[]edge) {
        int x = edge[0];
        int y = edge[1];
        
        graph.get(x).add(y);
        graph.get(y).add(x);
    }
    
    // graph 확인
    public void print(ArrayList<ArrayList<Integer>> graph, int n) {
        for (int i = 0; i < n + 1; i++) {
            System.out.print("node[" + i + "]" + " : ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + "->");   
            }
            System.out.println();
        }
    }
    
    // bfs
    public void bfs(ArrayList<ArrayList<Integer>> graph, Queue<int[]> queue, ArrayList<Integer> visited) {
        
        while(!queue.isEmpty()){
            int[] curr = queue.poll(); // queue에서 첫 번째 값을 꺼냄
            int now = curr[0];
            int dist = curr[1];

            for (int next : graph.get(now)) {
                if (visited.get(next) == 0) {
                    visited.set(next, dist + 1); // 거리 저장
                    queue.offer(new int[]{next, dist + 1});
                }
            }
        }
    }
    
    // visited 최댓값
    public int findMostVisited(ArrayList<Integer> visited) {
        int max = 0;
        
        for (int i = 0; i < visited.size(); i++) {
            if (visited.get(i) > max) {
                max = visited.get(i);
            }
        }
        
        return max;
    }
}
