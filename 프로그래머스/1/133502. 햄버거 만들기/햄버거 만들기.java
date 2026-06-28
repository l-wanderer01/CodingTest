class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] stack = new int[ingredient.length];
        int top = 0; // 가장 상단 index 저장
        
        for (int i : ingredient) {
            stack[top] = i;
            
            if (top >= 3 &&
                stack[top - 3] == 1 &&
                stack[top - 2] == 2 &&
                stack[top - 1] == 3 &&
                stack[top] == 1) {
                
                top -= 4; // 저장됐던 재료 제거
                answer++;
                
            }
            
            top++;
        }
        
        return answer;
    }
}