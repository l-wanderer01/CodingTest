import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int len = 1;
        Set<Integer> set = new HashSet<>();
        // 합을 리스트에 집어넣을 때 중복 검사를 해서 리스트에 넣고 리스트의 길이를 반환
        while (len <= elements.length) {
            for (int i = 0; i < elements.length; i++) {
                if (i + len <= elements.length) {
                    // 부분 리스트 추출
                    int[] arr = Arrays.copyOfRange(elements, i, i + len);
                    int total = Arrays.stream(arr).sum();
                    set.add(total);
                }
                else {
                    int[] arr1 = Arrays.copyOfRange(elements, i, elements.length);
                    int[] arr2 = Arrays.copyOfRange(elements, 0, len - arr1.length);
                    int total = Arrays.stream(arr1).sum();
                    total += Arrays.stream(arr2).sum();
                    set.add(total);
                }
            }
            len++;
        }
        
        answer = set.size();
        
        return answer;
    }
}