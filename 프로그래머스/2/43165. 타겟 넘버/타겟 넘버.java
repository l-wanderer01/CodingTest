import java.util.*;

class Solution {
    static int tg;
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        tg = target;
        // 자료구조 = numbers로 주는 리스트 활용
        // 알고리즘 = DFS
        
        dfs(numbers, 0, numbers[0], 0);
        dfs(numbers, 0, -1 * numbers[0], 0);
        
        return answer;
    }
    
    public void dfs(int[] numbers, int idx, int num, int sum) {
        // 종료조건
        if (idx == numbers.length - 1) {
            sum += num;
            if (sum == tg) {
                answer++;
                System.out.println(answer);
            }
            return;   
        }
        // 방문 노드 stack에 추가
        sum += num;
        dfs(numbers, idx+1, -1 * numbers[idx+1], sum);
        dfs(numbers, idx+1, 1 * numbers[idx+1], sum);
        
    }
}