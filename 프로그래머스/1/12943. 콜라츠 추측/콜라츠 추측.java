class Solution {
    public int collatz(long num, int cnt) { // num * 3 + 1의 값이 Integer Overflow가 나기 때문에 long 형으로 변환 필요!!
        
        if (num == 1) {
            return cnt;
        }
        if (cnt == 500) {
            return -1;
        }
        
        if (num % 2 == 0) {
            return collatz(num / 2, cnt + 1);
        }
        else {
            return collatz(num * 3 + 1, cnt + 1);
        }
    }
    
    
    public int solution(int num) {
        // 재귀 사용 필요
        int answer = collatz(num, 0);
        
        return answer;
    }
}