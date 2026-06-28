class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        int idx = 0; // 단어 내의 인덱스
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                sb.append(" ");
                idx = 0; // 공백 이후는 인덱스 0
                continue;
            }
            else {
                if (idx % 2 == 0) {
                    sb.append(Character.toUpperCase(c));
                }
                else {
                    sb.append(Character.toLowerCase(c));
                }
            }
            idx++;
        }
        
        answer = sb.toString();
        
        return answer;
    }
}