import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        // 원본 값을 저장
        List<Integer> temp = new ArrayList<>();
        for (int num: numbers) {
            temp.add(num);
        }
        
        // 더한 값들을 저장
        List<Integer> temp2 = new ArrayList<>();
        
        for (int i = 0; i < temp.size() - 1; i++) { // 마지막 인덱스는 접근할 필요 x
            for (int j = i + 1; j < temp.size(); j++) {
                temp2.add(temp.get(i) + temp.get(j));
            }
        }
            
        answer = temp2.stream()
            .distinct()
            .sorted()
            .mapToInt(Integer::intValue)
            // .mapToInt(i -> i)
            .toArray();

        return answer;
    }
    
}