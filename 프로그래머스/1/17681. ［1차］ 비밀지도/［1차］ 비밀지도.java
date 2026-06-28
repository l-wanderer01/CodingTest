class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int divider = 1; // 이진수의 가장 좌측의 값
        for (int i = 1; i < n; i++) {
            divider *= 2;
        }
        
        for (int i = 0; i < n; i++) {
            // 한 턴이 끝났을 때, 한줄의 탐색을 완료해야한다.
            StringBuilder sb = new StringBuilder(); // 문자열 저장
            int std = divider; // 기준값 초기화
            
            while (std > 0) {
                if (arr1[i] / std > 0 || arr2[i] / std > 0) { // 해당 자리의 이진수 값이 1일 때
                    sb.append("#");
                    if (arr1[i] >= std) arr1[i] %= std;
                    if (arr2[i] >= std) arr2[i] %= std;
                }
                else {
                    sb.append(" ");
                }
                std /= 2;
            }
            answer[i] = sb.toString();
            sb.delete(0, n);
        }
        
        return answer;
    }
}