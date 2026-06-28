class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kString = k + "";
        
        for (int num = i; num <= j; num++) {
            String s = num + "";
            for (int cnt = 0; cnt < s.length(); cnt++) {
                if (s.charAt(cnt) == kString.charAt(0)) answer++;
            }
        }
        
        return answer;
    }
}