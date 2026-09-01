import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for (int testCase = 1; testCase <= T; testCase++) {
			int N = Integer.parseInt(br.readLine());
			
			// 카드들 구분
			st = new StringTokenizer(br.readLine(), " ");
			
			// 카드 저장 배열
			String[] cards = new String[N];
			
			// 카드 저장
			for (int i = 0; i < N; i++) {
				cards[i] = st.nextToken();
			}
			
			sb.append("#").append(testCase).append(" ");
			
			// 풀이 1
//			// 투 포인터
//			int left = 0;
//			int right = (N+1)/2;
//			
//			for (int i = 0; i < N; i++) {
//				if (i % 2 == 1) {
//					sb.append(cards[right++]).append(" ");
//				}
//				else {
//					sb.append(cards[left++]).append(" ");
//				}
//			}
			
			// 풀이 2
			// 절반만 순회
			int half = (N+1)/2;
			for (int i = 0; i < half; i++) {
				sb.append(cards[i]).append(" ");
				if (i+half < N) {
					sb.append(cards[i+half]).append(" ");
				}
			}
			
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}