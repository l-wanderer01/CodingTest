class Solution {
    public double solution(int[] numbers) {
        double total = 0;
    
        for (int num : numbers) {
            total += num;        
        }
        
        double answer = total / numbers.length;
        
        return answer;
    }
}