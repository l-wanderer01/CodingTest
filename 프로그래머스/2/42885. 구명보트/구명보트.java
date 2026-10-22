import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int boats = 0;
        
        int cnt = 0; // 구조된 사람 개수 카운트

        int idx = 0;
        // 정렬 시키기!
        Arrays.sort(people);
        // limit - 40을 찾아서 이 사람의 끝 인덱스 찾기
        int endIdx = people.length - 1;
        while (endIdx >= 0 && people[endIdx] > limit - 40) {
            endIdx--;
            cnt++;
            boats++;
        }
        
        // System.out.println(endIdx);
        int startIdx = 0; // 시작하는 사람 위치
        
        while (cnt < people.length) {
            
            if (people[startIdx] + people[endIdx] <= limit) {
                startIdx++;
                cnt++;
            }
            endIdx--;
            cnt++; // 구조된 사람 수
            boats++; // 구명보트 수 증가
        }
        
        return boats;
    }
}

// N이 50000이라 N^2도 안된다. 무조건 N으로 끊어야함.
// 탓는지 체크 isSelected[]
// 무조건 혼자 타야하는 사람: limit - people[i] < 40