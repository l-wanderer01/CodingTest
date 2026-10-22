import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int boat = 0;
        
        Arrays.sort(people);
        
        int minIdx = 0; // 가벼운 사람
        int maxIdx = people.length - 1; // 무거운 사람
        
        while(minIdx <= maxIdx) {
            if (people[minIdx] + people[maxIdx] <= limit) {
                // 제일 무거운 사람과 제일 가벼운 사람을 더했을 때, 초과하지 않으면 둘 다 태운다.
                minIdx++;
            }
            maxIdx--;
            boat++;
        }
        
        return boat;
    }
}