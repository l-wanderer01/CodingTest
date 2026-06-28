class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // char형으로 출력
            if (c == ' ') {
                sb.append(" ");
                continue;
            }
            c += n;
            int a = 0;
            // if (Character.isLowerCase(c)) System.out.println("소문자");
            if (c > 'z' && Character.isLowerCase(s.charAt(i))) {
                c = (char)('a' + (c - 'z') - 1);
            }
            else if (c > 'Z' && Character.isUpperCase(s.charAt(i))) {
                c = (char)('A' + (c - 'Z') - 1);
            }
            sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}