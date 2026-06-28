class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length]; // 순서를 저장하는 배열
        int[] avg = new int[score.length]; // 평균 값을 저장하는 배열
        
        for (int i = 0; i < score.length; i++) {
            avg[i] = score[i][0] + score[i][1];
        }
        
        for (int i = 0; i < score.length; i++) {
            int cnt = 1; // 기본 등수
            for (int j = 0; j < score.length; j++) {
                if (avg[i] < avg[j]) { // 현재의 avg 값보다 큰 요소의 개수를 카운트
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        
        return answer;
    }
}