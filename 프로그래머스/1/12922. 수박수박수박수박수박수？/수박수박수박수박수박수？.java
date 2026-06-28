class Solution {
    public String solution(int n) {
        String answer = "";
        
        String str = "수박";
    
        answer = str.repeat(n/2);
        
        if (n % 2 == 1) answer += str.charAt(0);
        
        return answer;
    }
}