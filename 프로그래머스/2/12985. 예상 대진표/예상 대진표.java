import java.lang.Math;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int round = 0;
        // a번 참가자는 b번 참자가와 몇 번째 라운드에서 만나는지
        // 이 문제는 배열로 접근하는게 아닌 정수의 계산만으로 문제를 풀 수 있다.
        boolean[] arr = new boolean[n];
        arr[a - 1] = true;
        arr[b - 1] = true;
        
        while(true) {
            int idx = 0;
            for (int i = 0; i < arr.length / Math.pow(2, round); i += 2) {
                if (arr[i] == true && arr[i + 1] == true) {
                    return round + 1;
                }
                if (arr[i] == true || arr[i + 1] == true) {
                    arr[i] = false; // 기존의 값들을 false로 초기화
                    arr[i + 1] = false;
                    arr[idx] = true;
                }
                idx++;
            }
            round++;
        }
    }
}