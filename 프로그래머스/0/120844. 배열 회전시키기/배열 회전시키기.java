class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] answer = new int[length];
        
        int rotate = direction.equals("right") ? 1 : -1;
        
        for (int i = 0; i < length; i++) {
            answer[i] = numbers[(length + i - rotate) % length];
        }
        
        return answer;
    }
}