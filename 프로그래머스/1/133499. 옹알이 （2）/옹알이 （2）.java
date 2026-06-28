class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String s : babbling) {
            int a = 0, y = 0, w = 0, m = 0;
            // 연속된 발음이 있다면 제외, 포함된 옹알이 개수 확인
            if (s.contains("aya") && !s.contains("ayaaya")) {
                a += count(s, "aya");
            }
            if (s.contains("ye") && !s.contains("yeye")) {
                y += count(s, "ye");
            }
            if (s.contains("woo") && !s.contains("woowoo")) {
                w += count(s, "woo");
            }
            if (s.contains("ma") && !s.contains("mama")) {
                m += count(s, "ma");
            }
            if (s.length() == a * 3 + y * 2 + w * 3 + m * 2) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public int count(String str, String s) {
        String[] sArr = str.split(s);
        int length = 0, cnt = 0;
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].length() != 0) {
                length += sArr[i].length();
            }
        }
        
        return (str.length() - length) / s.length();
    }
}