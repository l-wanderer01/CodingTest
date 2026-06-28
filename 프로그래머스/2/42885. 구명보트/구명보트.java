import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people); // 정렬
        int left = 0, right = people.length - 1;
        while (left <= right) {
            if (people[left] + people[right] <= limit) left++; // 무거운 사람에 가벼운 사람을 함께 태웠을 때 탈 수 있다면 left를 증가시킴
            right--; // 무거운 사람은 무조건 보트에 태운다!
            answer++;
        }
        
        return answer;
    }
}