import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        // 배열을 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        // A 배열의 가장 작은 값과 B 배열의 가장 큰 값을 곱한 후 더함
        for (int i = 0; i < A.length; i++) {
            int min = A[i];
            int max = B[A.length - i - 1];
            answer += min * max;
        }
        

        return answer;
    }
}