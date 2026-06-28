class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLength = t.length(), pLength = p.length();
        Long num = Long.parseLong(p); // 기준 value;
        
        // 어디서 런타임에러가 발생하는걸까...
        for (int i = 0; i <= tLength - pLength; i++) {
            String str = t.substring(i, i + pLength);
            Long subNum = Long.parseLong(str);
            if (num >= subNum) {
                answer += 1;
            }
        }
        
        return answer;
    }
}