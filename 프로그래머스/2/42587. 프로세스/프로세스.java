import java.util.*;

// 시뮬레이션 문제
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Node> queue = new LinkedList<>();
        int answer = 0;
        int len = priorities.length;
        int cnt = 0; // 몇번째로 실행되는지 저장
        for (int i = 0; i < len; i++) {
            queue.add(new Node(i, priorities[i]));
        }
        
        while(!queue.isEmpty()) {
            // 지금 우선순위가 가장 높은 걸 뽑음
            Node top = queue.poll();
            boolean isPriority = true;
            // 우선순위가 가장 높은지 확인
            for (Node n : queue) {
                if (n.priority > top.priority) {
                    isPriority = false;
                    queue.add(top);
                    break;
                }
            }
            
            // 현재 node가 가장 높다면, location과 idx가 동일한지 확인
            if (isPriority) {
                cnt++; // 실행시킴
                if (top.idx == location) {
                    answer = cnt;
                    break;
                }
            }            
        }
        
        return answer;
    }
    
    // 각 프로세스들을 node로 묶음 (map을 사용 못하기에 클래스로 묶음) -> 목적지 찾기에서도 동일
    class Node {
        int idx;
        int priority;
        
        Node(int idx, int proiority) {
            this.idx = idx;
            this.priority = proiority;
        }
    }
}