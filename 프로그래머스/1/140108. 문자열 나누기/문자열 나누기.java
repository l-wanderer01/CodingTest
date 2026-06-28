class Solution {
    public int solution(String s) {
        int answer = 0;
        int i = 0;
        
        while (i < s.length()) {
            int same = 1, diff = 0;
            int j = 1;
            while (same != diff) {
                if (i + j >= s.length()) break;
                if (s.charAt(i) == s.charAt(i + j)) {
                    same++;
                }
                else {
                    diff++;
                }
                j++;
            }
            i += j;
            answer++;
        }
        return answer;
    }
}