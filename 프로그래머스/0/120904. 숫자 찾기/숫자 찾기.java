class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String numStr = num + "";
        String kStr = k + "";
        
        answer = numStr.indexOf(kStr);
        
        return answer < 0 ? -1 : answer + 1;
    }
}