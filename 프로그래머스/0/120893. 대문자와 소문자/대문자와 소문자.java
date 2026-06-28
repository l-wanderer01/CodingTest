class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = '\0';
            if (my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') {
                c = (char)(my_string.charAt(i) + ('a' - 'A'));
            }
            else {
                c = (char)(my_string.charAt(i) - ('a' - 'A'));
            }     
            sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}