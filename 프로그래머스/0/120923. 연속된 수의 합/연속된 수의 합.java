import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        
        ArrayList<Integer> al = new ArrayList<>();
        int sum = 0, tmp = total;
        
        while (total != sum) { // 개수가 동일한지 cnt 필요
            sum = 0;
            for (int i = tmp; i > tmp - num; i--) { // num 번 반복
                sum += i;
            }
            if (total == sum) break;
            tmp--; // n개 만큼 더할 때, 마지막 요소의 값
        }
        
        if (total == 0) {
            int start = (num / 2) - num + 1;
            for (int i = 0; i < num; i++) {
                al.add(start++);
            }
            
            return al.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        }
        
        int end = tmp; // 연속된 숫자의 시작 값
        for (int i = end - num + 1; i <= end; i++) {
            al.add(i);
        }
        
        return al.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}