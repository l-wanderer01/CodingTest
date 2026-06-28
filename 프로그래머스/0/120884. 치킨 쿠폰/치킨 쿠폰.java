class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupons = chicken;

        while (coupons >= 10) {
            int free = coupons / 10;
            answer += free;
            coupons = free + (coupons % 10);
        }
        return answer;
    }
}