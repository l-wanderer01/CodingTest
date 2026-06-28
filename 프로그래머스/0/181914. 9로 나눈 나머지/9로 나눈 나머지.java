class Solution {
    public int solution(String number) {
        
        int answer = 0;
        
        String[] sarr = number.split("");
        for (int i = 0; i < sarr.length; i++) {
            answer += Integer.valueOf(sarr[i]);
        }
        
        answer %= 9;
        
        return answer;
    }
}