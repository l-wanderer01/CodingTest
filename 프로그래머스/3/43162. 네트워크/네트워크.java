class Solution {
    int n;
    int[][] computers;
    int answer;
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        this.n = n;
        this.computers = computers;
        
        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            findNetwork(i, i);   
        }
        
        return answer;
    }
    
    public void findNetwork(int startNode, int node) {
        if (visited[node]) return;
        
        visited[node] = true;
        
        for (int i = 0; i < n; i++) {
            // 아직 방문하지 않았으면서 연결된 노드가 있는지 확인
            if (!visited[i] && computers[node][i] == 1) findNetwork(startNode, i);
        }
        
        if (startNode == node) {
            answer++;
        }
    }
}