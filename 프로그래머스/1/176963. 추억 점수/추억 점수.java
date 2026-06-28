import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>();
        
        // name과 yearning을 매핑
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) { // key 값에 photo[i][j]가 존재하는지 확인
                    answer[i] += map.get(photo[i][j]); // 해당 key의 value 값을 누적합
                }
            }
        }
        
        return answer;
    }
}