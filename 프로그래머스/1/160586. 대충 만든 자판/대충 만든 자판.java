import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < keymap.length; i++) {
            String key = keymap[i];
            for (int j = 0; j < key.length(); j++) {
                char c = key.charAt(j);
                if (map.get(c) != null && map.get(c) > j + 1) {
                    map.put(c, j + 1); // map.replace(c, j + 1) 로 value값 변경 가능
                }
                else if (map.get(c) == null){
                    map.put(c, j + 1); // map에 요소 추가   
                }
            }
        }
        
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            for (int j = 0; j < target.length(); j++) {
                char c = target.charAt(j);
                if (map.get(c) != null) {
                    answer[i] += map.get(c);
                }
                else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}