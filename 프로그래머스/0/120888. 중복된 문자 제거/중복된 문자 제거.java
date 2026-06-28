class Solution {
    public String solution(String my_string) {
        
        String answer = "";
        
        String[] sArr = my_string.split("");
        
        for (String s : sArr) {
            if (answer.contains(s)) continue;
            else answer += s;
        }
        
        return answer;
    }
}