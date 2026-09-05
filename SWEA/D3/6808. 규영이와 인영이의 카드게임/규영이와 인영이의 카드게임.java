import java.util.*;
import java.io.*;

class Solution
{   
    static int N;
    static int totalSum; // 카드의 총합
    static boolean[] visited;
    static int kWin; // 규영이가 이긴 경우의 수 누적
    static int[] kCards;
    static int[] iCards;
    
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		// 규영이 카드 개수
		N = 18; // 총 카드 개수
        int total = factorial(N/2);	// 총 경우의 수
        totalSum = sigmaSum(N); // 카드의 총합
        
		for(int tc = 1; tc <= T; tc++)
		{
		    visited = new boolean[N/2];
		    // 규영이 카드
			kCards = new int[N/2];
			// 인영이 카드
			iCards = new int[N/2];
			// 카드 배분 정보 저장
			boolean[] isUsed = new boolean[N+1];
			kWin = 0;
            st = new StringTokenizer(br.readLine());
            // 규영이 카드
            for (int i = 0; i < N/2; i++) {
                int card = Integer.parseInt(st.nextToken());
                kCards[i] = card;
                isUsed[card] = true;
            }
            // 인영이 카드
            for (int i=1, idx=0; i <= N; i++) {
                if (!isUsed[i]) iCards[idx++] = i;
            }
            
            // dfs로 모든 경우의 수 탐색 (이때 탐색하면서 카드 값 비교)
            dfs(0, 0);
            
            sb.append("#").append(tc).append(" ").append(kWin).append(" ").append(total - kWin).append("\n");
		}
		System.out.print(sb.toString());
	}
    
    public static int factorial(int n) {
        if (n == 1) return 1;
        return n*factorial(n-1);
    }
    
    public static int sigmaSum(int n) {
        if (n == 1) return 1;
        return n+sigmaSum(n-1);
    }
    
    public static void dfs(int depth, int sum) {
        // depth가 N이 되면 종료 (depth가 0부터 시작하니까 N이 되면 모든 배열을 다 돈거다!)
        if (depth >= N/2) {
            if (sum > totalSum/2) {
                kWin++;
            }
            return;
        }
        for (int i = 0; i < N/2; i++) {
            if (!visited[i]) {
                visited[i] = true;
                // 규영이가 이기면 두 수의 총합을 누적한다.
                if (kCards[depth] > iCards[i]) {
                    dfs(depth+1, sum+kCards[depth]+iCards[i]);
                }
                // 같으면 본인 카드값만 누적함
                else if (kCards[depth] == iCards[i]) {
                    dfs(depth+1, sum+kCards[depth]);
                }
                else {
                    dfs(depth+1, sum);
                }
                visited[i] = false;   
            }
        }
    }
}