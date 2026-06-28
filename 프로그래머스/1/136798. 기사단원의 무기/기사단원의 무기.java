import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int[] arr = new int[number];
        
        for (int i = 1; i <= number; i++) {
            int cnt = countDivisors(i);
            arr[i - 1] = cnt > limit ? power : cnt;
        }
        
        return Arrays.stream(arr).sum();
    }

    // √n까지만 탐색해서 약수 개수 구하기
    private int countDivisors(int n) {
        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                cnt++;               // i가 약수
                if (i != n / i) {    // 짝이 되는 약수도 카운트
                    cnt++;
                }
            }
        }
        return cnt;
    }
}