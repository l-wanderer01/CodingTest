class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] sArr = my_string.split("");
        
        for (String str : sArr) {
            answer += str.repeat(n);
        }
        
        return answer;
    }
}