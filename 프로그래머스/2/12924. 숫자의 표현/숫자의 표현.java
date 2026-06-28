// class Solution {
//     public int solution(int n) {
//         int answer = 1; // 자기 자신 포함
//         if (n == 1) return answer;

//         for (int i = (n / 2) + 1; i > 1; i--) {
//             // i부터 시작해서 몇 개의 수를 더하면 n이 되는지 확인
//             // 등차수열의 합: k * (2*i - k + 1) / 2 = n
//             // k : 항의 개수
//             // 첫째항 : i
//             // 끝항 : i - k + 1
//             // (수열을 뒤에서 감소하는 방향으로 계산하기에 'k - 1'이 아닌 '-k + 1'로 계산)
//             for (int k = 2; k * (2 * i - k + 1) / 2 <= n; k++) {
//                 int sum = k * (2 * i - k + 1) / 2; // 항의 개수를 늘려가며 합을 계산
//                 if (sum == n) {
//                     answer++;
//                     break; // 더 큰 k는 불필요
//                 }
//             }
//         }

//         return answer;
//     }
// }


class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int k = 1; k * (k + 1) / 2 <= n; k++) {
            // n : 전체 합
            // k * (k - 1) / 2 : 0부터 k-1까지 더한 값
            // k의 나머지를 계산하는 이유: k와 나누어 떨어지는지 확인, 등차수열의 합 공식에 의해 n = k x a 가 남는데, a는 1이기 때문에 최종적으로 k로 나눈 나머지가 0인지 확인해 전체합이 맞아 떨어지는지 알 수 있다. 
            if ((n - k * (k - 1) / 2) % k == 0) {
                answer++;
            }
        }
        return answer;
    }
}
