import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        // 논문 전체 개수
        int n = citations.length;
        // 정렬 (O(NlogN))
        Arrays.sort(citations);
        
        for (int i = 0; i < n; i++) {
            // 현재 논문의 인용 횟수(citations[i]) 이상 인용된 논문의 수
            int over = n - i;
            // 현재 논문의 인용 횟수가 남은 논문의 개수보다 크거나 같은지 확인
            if (citations[i] >= over) {
                // over는 갈수록 작아짐 -> 조건을 만족한 최초의 over가 최댓값
                answer = over;
                break;
            }
        }
        
        return answer;
    }
}
