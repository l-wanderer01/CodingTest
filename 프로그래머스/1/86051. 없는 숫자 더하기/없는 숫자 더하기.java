class Solution {
    public int solution(int[] numbers) {
        int answer = 45; // 0~9까지 더한 값
        
        for (int i : numbers) {
            answer -= i;
        }
        
        return answer;
    }
}