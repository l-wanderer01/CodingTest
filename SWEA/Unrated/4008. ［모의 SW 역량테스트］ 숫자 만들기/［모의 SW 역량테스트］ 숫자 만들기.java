import java.io.*;
import java.util.*;

class Solution {
    static int N;
    static int[] numbers;
    static int max, min;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        
        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= T; test_case++) {
            N = Integer.parseInt(br.readLine().trim());
            
            // 1. 연산자 개수 입력 (순서대로 +, -, *, /)
            int[] ops = new int[4];
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            for (int i = 0; i < 4; i++) {
                ops[i] = Integer.parseInt(st.nextToken());
            }

            // 2. 피연산자(숫자) 입력
            numbers = new int[N];
            st = new StringTokenizer(br.readLine().trim());
            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            // 3. 최댓값, 최솟값 초기화
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;

            // 4. DFS 탐색 시작 (첫 번째 숫자부터 시작하므로 depth는 1)
            dfs(numbers[0], 1, ops[0], ops[1], ops[2], ops[3]);

            // 5. 정답 포맷에 맞게 저장 (최댓값 - 최솟값)
            sb.append("#").append(test_case).append(" ").append(max - min).append("\n");
        }
        
        // 전체 결과 출력
        System.out.print(sb.toString());
    }

    /**
     * @param current_result 현재까지 누적 계산된 결과값
     * @param depth          현재 사용할 숫자의 인덱스
     * @param plus           남은 덧셈 연산자 개수
     * @param minus          남은 뺄셈 연산자 개수
     * @param multiply       남은 곱셈 연산자 개수
     * @param divide         남은 나눗셈 연산자 개수
     */
    static void dfs(int current_result, int depth, int plus, int minus, int multiply, int divide) {
        // 모든 숫자를 다 연산했을 경우 (종료 조건)
        if (depth == N) {
            max = Math.max(max, current_result);
            min = Math.min(min, current_result);
            return;
        }

        // 남은 연산자가 있다면 해당 연산을 수행하고 재귀 호출
        if (plus > 0) {
            dfs(current_result + numbers[depth], depth + 1, plus - 1, minus, multiply, divide);
        }
        if (minus > 0) {
            dfs(current_result - numbers[depth], depth + 1, plus, minus - 1, multiply, divide);
        }
        if (multiply > 0) {
            dfs(current_result * numbers[depth], depth + 1, plus, minus, multiply - 1, divide);
        }
        if (divide > 0) {
            // 자바의 정수 나눗셈은 문제의 조건(소수점 이하 버림)을 자연스럽게 만족합니다.
            dfs(current_result / numbers[depth], depth + 1, plus, minus, multiply, divide - 1);
        }
    }
}