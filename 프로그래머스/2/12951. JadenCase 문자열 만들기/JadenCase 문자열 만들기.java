class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        if (s.charAt(0) >= 'a') {
            char c = (char)(s.charAt(0) - 32 + '\0');
            sb.append(c);
        }
        else {
            sb.append(s.charAt(0));
        }
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ') {
                if (s.charAt(i) >= 'a') {
                    char c = (char)(s.charAt(i) - 32 + '\0');
                    sb.append(c);
                }
                else {
                    sb.append(s.charAt(i));
                }
            }
            else {
                if (s.charAt(i) < 'a' && s.charAt(i) != ' ') {
                    char c = (char)(s.charAt(i) + 32 + '\0');
                    sb.append(c);
                }
                else {
                    sb.append(s.charAt(i));   
                }
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}