import java.util.*;

class Solution {
    // Set: 중복 소수를 거르기 위함
    Set<Integer> set = new HashSet<Integer>();
    public int solution(String numbers) {
        
        // 1. 문자 배열로 쪼갬 + 각 문자의 사용 여부 확인 배열 생성
        char[] cArr = numbers.toCharArray();
        boolean[] visited = new boolean[cArr.length];
        
        // 2. 순차적으로 각 문자를 첫번째 자리로 설정 후 dfs 탐색
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            // 숫자 사용 처리
            visited[i] = true;
            String str = c+"";
            dfs(str, cArr, visited);
            // 이번에 썼던걸 다른 조합에서 쓰도록 사용 해제
            visited[i] = false;
        }

        return set.size();
    }
    
    // 빈 문자열과 문자 배열, 방문 여부 배열을 input으로 받는다.
    public void dfs(String str, char[] cArr, boolean[] visited) {
        
        // 종료조건 (백트래킹이 잘 잡히면 종료조건 없이도 마무리 된다?)
        // 3. 지금까지 완성된 문자가 소수인지 판별
        int num = Integer.parseInt(str);
        isPrime(num);
        
        // 4. 아직 사용되지 않은 문자들을 찾아 지금 문자열 뒤에 붙임
        char c = '\0';
        int len = cArr.length;
        for (int i = 0; i < len; i++) {
            // 아직 사용 안했다면 문자열 뒤에 붙임
            if (!visited[i]) {
                c = cArr[i];
                visited[i] = true;
                dfs(str+c, cArr, visited); // 재귀
                // 현재 사용한 숫자를 사용하지 않음으로 해제하면서 백트래킹
                visited[i] = false;
            }
        }        
    }
    // 소수인지 판별
    public void isPrime(int num) {
        if (num == 0 || num == 1) {
            return;
        }
        // sqrt{N}까지 나누어떨어지는 수가 있는지 확인 (제곱근 판정법)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return;
            }
        }
        set.add(num);
    }
    
}