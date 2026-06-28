class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        // 정수 a, b 항이 a, 공차가 d
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + d * i;
            }
        }
        
        return answer;
    }
}