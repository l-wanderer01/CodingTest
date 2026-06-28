class Solution {
    int answer = 0;
    
    public void bfs(int leaf, int index, int[] numbers, int target) { // 현재 leaf의 값, 현재 탐색중인 노드의 index
        if (index == numbers.length) {
            if (leaf == target){
                answer++;   
            }
            return;
        }
        
        bfs(leaf - numbers[index], index + 1, numbers, target);
        bfs(leaf + numbers[index], index + 1, numbers, target);
        
    }
    
    public int solution(int[] numbers, int target) {
        int cnt = numbers.length; // 재귀 반복 횟수
        
        // 탐색 call
        bfs(-1 * numbers[0], 1, numbers, target); // - 만 반복하여 결과 도출
        bfs(numbers[0], 1, numbers, target); // + 만 반복하여 결과 도출
        
        return answer;
    }
}