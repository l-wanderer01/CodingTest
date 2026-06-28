import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // answers : 정답이 들어있는 배열
        ArrayList<Integer> al = new ArrayList<>(); // 정답 배열 리스트
                
        int num1 = 0, num2 = 0, num3 = 0;
        
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 0; i < answers.length; i++) {
            
            if ((i + 1) % 5 == answers[i] || ((i + 1) % 5 == 0 && answers[i] == 5)) {
                num1 += 1; // 1번 수포자 정답수
            }
            
            if (arr2[i % 8] == answers[i]) {
                num2 += 1; // 2번 수포자 정답 수
            }
            
            if (arr3[i % 10] == answers[i])
                num3 += 1; // 3번 수포자 정답 수
        }

        int max = Math.max(num1, Math.max(num2, num3));
        
        if (num1 == max) al.add(1);
        if (num2 == max) al.add(2);
        if (num3 == max) al.add(3);
        
        int[] answer = al.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
        return answer;
    }
}