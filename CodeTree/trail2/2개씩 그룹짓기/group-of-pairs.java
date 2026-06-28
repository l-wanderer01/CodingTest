import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. N 입력 받기 (그룹의 개수)
        int n = Integer.parseInt(br.readLine());
        
        // 원소의 총 개수는 2N개입니다.
        int totalElements = 2 * n;
        int[] arr = new int[totalElements];
        
        // 2. 2N개의 공백으로 구분된 숫자 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < totalElements; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // 3. 오름차순 정렬 (O(N log N))
        Arrays.sort(arr);
        
        int maxSum = 0;
        
        // 4. 양 끝의 원소를 짝지으며 최댓값 갱신 (O(N))
        for (int i = 0; i < n; i++) {
            // 가장 작은 값과 가장 큰 값을 더함
            int currentSum = arr[i] + arr[totalElements - 1 - i];
            
            // 현재 그룹의 합이 기존 최댓값보다 크다면 갱신
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        
        // 5. 결과 출력
        System.out.println(maxSum);
    }
}