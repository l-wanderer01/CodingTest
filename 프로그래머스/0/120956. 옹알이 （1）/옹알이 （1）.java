class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String s : babbling) {
            int a = 0, y = 0, w = 0, m = 0;
            if (s.contains("aya")) a++;
            if (s.contains("ye")) y++;
            if (s.contains("woo")) w++;
            if (s.contains("ma")) m++;
            
            if (s.length() == a * 3 + y * 2 + w * 3 + m * 2) answer++;
        }
        
        return answer;
    }
}