class Solution {
    public int solution(int n) {
        boolean[] arr = new boolean[n + 1];
        int answer = 0;
        
        arr[0] = arr[1] = true; // true : 소수가 아님, false : 소수
        
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == false) { // i가 소수라면 해당 수의 배수는 모두 소수가 아님
                for (int j = 2; i * j < arr.length; j++) {
                    arr[i * j] = true;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == false) {
                answer += 1;
            }
        }
        
        return answer;
    }
}