import java.io.BufferedReader;
import java.lang.Exception;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Solution {
	static int[][] LAND;
	static int C;
	static int MAX; // 전체 벌꿀 최댓값
	static int BEE;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			MAX = 0;
			LAND = new int[N][N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < N; j++) {
					LAND[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 0; i < N; i++) {
				for (int j = 0; j <= N-M; j++) {
					// 지금 벌꿀의 상하 인덱스와 길이를 준다.
					int[] bee1 = new int[M];
					for (int m=j, idx=0; m<j+M; m++, idx++) {
						bee1[idx] = LAND[i][m];
					}
					backtracking(bee1, 0, 0, 0);
					int honey1 = BEE;
					int honey2 = 0;
					BEE = 0;
					for (int k=i; k<N; k++) {
						if (k == i) {
							for (int l=j+M; l <= N-M; l++) {
								int[] bee2 = new int[M];
								for (int m=l, idx=0; m<j+M; m++, idx++) {
									bee2[idx] = LAND[k][m];
								}
								backtracking(bee2, 0, 0, 0);
								honey2 = BEE;
								BEE = 0;
								int res = honey1+honey2;
								// 최댓값 계산
								MAX = MAX < res ? res : MAX;
							}
						}
						else {
							for (int l=0; l <= N-M; l++) {
								int[] bee2 = new int[M];
								for (int m=l, idx=0; m<l+M; m++, idx++) {
									bee2[idx] = LAND[k][m];
								}
								backtracking(bee2, 0, 0, 0);
								honey2 = BEE;
								BEE = 0;
								int res = honey1+honey2;
								// 최댓값 계산
								MAX = MAX < res ? res : MAX;
							}
						}
					}
				}
			}
			
			sb.append("#").append(tc).append(" ").append(MAX).append("\n");
			
		}// end of tc
		System.out.print(sb.toString());
	}// end of main
	
//	public static int calcHoney(int r, int c, int len) {
//		// 그 배열 범위의 모든 값들을 먼저 읽어서 합친다.
//		int[] arr = new int[len];
//		int sum = 0;
//		for (int i=0; i<len;i++) {
//			arr[i] = LAND[r][c+i];
//			sum += arr[i];
//		}
//		// 모든칸 합친게 C보다 작다.
//		if (sum<=C) {
//			for (int i=0; i<len;i++) {
//				sum += arr[i]*arr[i];
//			}
//		}
//		
//		// C를 초과하면 모든 조합을 계산해본다. -> 비트마스킹 (백트래킹으로도 구할 수 있다)
//		boolean[] visited = new boolean[len];
//		
//		backtracking(arr, visited);
//		
//		return 0;
//	}
	
	public static void backtracking(int[] arr, int idx, int currentSum, int currentCost) {
		if (currentSum > C) return;
		
		if (idx == arr.length) {
			if (BEE < currentCost) BEE = currentCost;
			return;
		}
		
		// 분기 A
		backtracking(arr, idx+1, currentSum+arr[idx], currentCost+(arr[idx]*arr[idx]));
		// 분기 B
		backtracking(arr, idx+1, currentSum, currentCost);
		
		
	}

}// end of class


//첫번째 놈을 무조건 fix 해두고 2칸씩 무조건 읽게 한다. 그리고 그 곳을 visited처리한다.
//두번째 놈은 첫번째놈 바로 뒤부터 한칸씩 이동하면서 조합 체크
//-> 되는 놈이라면 최댓값 계산
//2칸을 하려고 할 때 인덱스가 터지면 그 칸은 패스 (체크하는 함수를 둔다)