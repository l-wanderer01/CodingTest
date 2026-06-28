class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int length = common.length;
        if (common[1] - common[0] == common[2] - common[1]) { // 등차수열이라면
            answer = common[length - 1] + common[1] - common[0];
        }
        else { // 등비수열이라면
            answer = common[length - 1] * (common[1] / common[0]);
        }
        
        return answer;
    }
}