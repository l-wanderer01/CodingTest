class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while(order > 0) {
            if (order % 10 != 0 && (order % 10) % 3 == 0) { // 0 인걸 어떻게 판별할까...
                answer++;
            }
            order /= 10;
        }
        
        return answer;
    }
}