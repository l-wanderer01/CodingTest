class Solution {
    public int solution(int n) {
        int answer = 0, cnt = 0; // cnt : 몇 
        
        while (cnt != n) {
            answer++;
            if (answer % 3 == 0 || answer / 10 == 3 || answer % 10 == 3 || answer / 10 == 13) { // 3의 배수, 십의 자리가 3, 일의 자리가 3, 130번대 제외
                continue;
            }
            
            cnt++;
        }
        
        return answer;
    }
}