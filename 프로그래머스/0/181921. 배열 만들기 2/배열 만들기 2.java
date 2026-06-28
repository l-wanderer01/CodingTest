import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.Collections;

class Solution {
    List<Integer> answer = new ArrayList<>();
    int l, r;
    
    public int[] solution(int l, int r) {    
        this.l = l;
        this.r = r;
        
        dfs("5");
            
        if (answer.isEmpty()) return new int[]{-1};
        Collections.sort(answer); // 오름차순 정렬
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
    
    private void dfs(String input) {
        if (!input.isEmpty()) {
            int num = Integer.parseInt(input);
            if (num > r) return; // r보다 크면 종료
            if (num >= l) {
                answer.add(num); // r과 l 사이에 있는 경우 저장
            }
        }
        
        // 현재 숫자에 0 또는 5를 붙여 재귀적으로 탐색
        dfs(input + "0");
        dfs(input + "5");
    }
}