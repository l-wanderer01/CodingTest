import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<Integer>();
    public int solution(String numbers) {

        char[] cArr = numbers.toCharArray();
        // DFS로 구현해야한다!
        // char를 사용했는지 여부 체크
        boolean[] visited = new boolean[cArr.length];
        
        for (int i = 0; i < cArr.length; i++) {
            // 현재 위치의 인덱스는 check
            char c = cArr[i];
            visited[i] = true;
            String str = c+"";
            dfs(str, cArr, visited);
            visited[i] = false;
        }

        return set.size();
    }
    
    // 빈 문자열과 문자 배열, 방문 여부 배열을 input으로 받는다.
    public void dfs(String str, char[] cArr, boolean[] visited) {
        
        // 종료조건 (백트래킹이 잘 잡히면 종료조건 없이도 마무리 된다?)
        int num = Integer.parseInt(str);
        isPrime(num);
        
        // 아직 사용하지 않은 문자를 찾는다.
        char c = '\0';
        int len = cArr.length;
        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                c = cArr[i];
                visited[i] = true;
                dfs(str+c, cArr, visited);
                // 현재 사용한 숫자를 사용하지 않음으로 해제하면서 백트래킹
                visited[i] = false;
            }
        }
        
        
    }
    // 소수인지 판별
    public void isPrime(int num) {
        // sqrt{N}까지 나누어떨어지는 수가 있는지 확인 (제곱근 판정법)
        if (num == 0 || num == 1) {
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return;
            }
        }
        set.add(num);
    }
    
}