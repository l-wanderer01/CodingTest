class Solution {
    public int solution(int[] wallet, int[] bill) {
        // 1. 지폐를 접은 횟수를 저장할 정수 변수 answer를 만들고 0을 저장합니다.
        int answer = 0;
        // Arrays.sort(wallet); // 시간 복잡도 : N * logN
        
        // 2. 반복문을 이용해 bill의 작은 값이 wallet의 작은 값 보다 크거나 bill의 큰 값이 wallet의 큰 값 보다 큰 동안 아래 과정을 반복합니다.
        while(min(bill) > min(wallet) || max(bill) > max(wallet)) {
            // 항상 길이가 긴 쪽을 반으로 접는다!
            bill[bill[0] > bill[1] ? 0 : 1] /= 2;
            answer++;
        }
        
        // 3. answer을 return합니다.
        return answer;
    }
    
    private int max(int[] arr) {
        return Math.max(arr[0], arr[1]);
    }
    
    private int min(int[] arr) {
        return Math.min(arr[0], arr[1]);
    }
}