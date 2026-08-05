import java.util.*;

// class Solution {
//     public int solution(int[] citations) {
//         int answer = 0;
//         // 논문 전체 개수
//         int n = citations.length;
//         // 정렬 (O(NlogN))
//         Arrays.sort(citations);
        
//         for (int i = 0; i < n; i++) {
//             // 현재 논문의 인용 횟수(citations[i]) 이상 인용된 논문의 수
//             int over = n - i;
//             // 현재 논문의 인용 횟수가 남은 논문의 개수보다 크거나 같은지 확인
//             if (citations[i] >= over) {
//                 // over는 갈수록 작아짐 -> 조건을 만족한 최초의 over가 최댓값
//                 answer = over;
//                 break;
//             }
//         }
        
//         return answer;
//     }
// }

class Solution {
    public int solution(int[] citations) {
        int n = citations.length;
        int answer = 0; // 최댓값은 n (논문 개수가 h 편이 되어야하기 때문!)
        Arrays.sort(citations); // h번 이하 인용된 것을 별도로 카운트하지 않기 위해 sort
    
        if (citations[0] >= n) {
            answer = n;
            return answer;
        }
        // (h번 이상 인용된 논문 개수)
        for (int i = 0; i < n; i++) {
            int h = citations[i];
            int papers = 0; // h번 이상 인용된 논문 카운트
            for (int j = 0; j < n; j++) {
                if (citations[j] > h) {
                    papers = n-j;
                    break;
                }
            }
            // h번 이상 인용된 논문이 h편 이상인지 확인
            if (papers >= h) {
                answer = papers;
                System.out.println(answer);
            }
            else {
                
                break;
            }
        }

        return answer;
    }
}


