import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        // progresses : 작업 진도, speeds : 개발 속도
        int len = progresses.length;
        // 작업 완성도 관리하는 큐
        Queue<Integer> queue = new LinkedList<Integer>();
        
        // queue 값 초기화
        for (int i = 0; i < len; i++) {
            int cnt = 0;
            while(progresses[i] < 100) {
                progresses[i] += speeds[i];
                cnt++;
            }
            // 남은 작업 일수를 queue에 넣음
            queue.add(cnt);
        }
        System.out.println(queue);
       
        while (!queue.isEmpty()) {
            // 가장 우선순위가 높은 작업의 남은 일수를 꺼냄
            int target = queue.poll();
            int cnt = 1;
            while(!queue.isEmpty() && queue.peek() <= target) {
                queue.poll();
                cnt++;
            }
            answer.add(cnt);
        }
        int size = answer.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = answer.get(i);
        }        
        return result;
    }
}