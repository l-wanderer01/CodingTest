import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for (String str : intStrs) {
            int num = pick(str, s, l);
            if (num > k) answer.add(num);
        }
        
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
    
    // s번 인덱스에서 l만큼의 길이를 잘라 정수로 변환하는 함수
    private int pick(String str, int idx, int length) {
        int cnt = length - 1, result = 0;
        for (int i = idx; i < idx + length; i++){            
            result += Integer.valueOf(str.charAt(i) - '0') * (int)Math.pow(10, cnt);
            cnt--;
        }
        return result;
    }
}