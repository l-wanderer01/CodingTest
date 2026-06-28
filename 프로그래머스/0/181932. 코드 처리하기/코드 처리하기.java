class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = (mode == 0) ? 1 : 0;
                continue;
            }
            
            if (i % 2 == mode) { // mode가 0 일때는 나머지가 0, 1일때는 나머지가 1로 생각하고 풀이
                answer += code.charAt(i);
            }
            
            
        }
        
        return answer.equals("") ? "EMPTY" : answer;
    }
}