class Solution {
    public int[] solution(long n) {
        
        String str = Long.toString(n);
        String[] input = str.split("");
        
        int cnt = input.length - 1;
        
        int[] answer = new int[cnt+1];
        
        for (int i = 0; i < cnt / 2 + 1; i++) {
            String temp = input[i];
            input[i] = input[cnt - i];
            input[cnt - i] = temp;
        }
        
        for (int i = 0; i < input.length; i++) {
            int a = Integer.valueOf(input[i]);
            answer[i] = a;
        }
        
        return answer;
    }
}