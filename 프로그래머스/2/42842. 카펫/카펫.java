import java.util.*;
import java.lang.Math;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        // brown + yellow = return[0] * return[1]
        long total = brown + yellow;
        
        ArrayList<Integer> al = new ArrayList<>();
        
        // 약수 구하기
        for (int i = 3; i <= Math.sqrt(total); i++) {
            if (total % i == 0) al.add(i); 
        }
        
        // 사이드를 모두 brown으로 채웠을 때, yellow의 개수만큼 남는지
        
        for (int i = 0; i < al.size(); i++) {
            long height = al.get(i), width = total / al.get(i);
            if (width * 2 + (height - 2) * 2 == brown) {
                answer[0] = (int) width;
                answer[1] = (int) height;
                break;
            }
        }
        
        return answer;
    }
}