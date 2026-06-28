class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        // 기약분수로 변환
        // 분자의 약수로 분모를 나눠본다.
        int[] iArr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        while(true) {
            boolean bl = false;
            for (int i : iArr) {
                if (a % i == 0 && b % i == 0) {
                    a /= i;
                    b /= i;
                    bl = true;
                }
            }
            if (!bl) break;
        }
        
        // num : 기약분수로 나타냈을 때, 분모
        while (b > 1) {
            if (b % 2 == 0) {
                b /= 2;
                answer = 1;
            }
            else if (b % 5 == 0) {
                b /= 5;
                answer = 1;
            }
            else {
                answer = 2;
                break;
            }
        }
        
        return answer;
    }
}