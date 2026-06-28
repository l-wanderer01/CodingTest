import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (al.isEmpty()) al.add(i);
                else {
                    boolean prime = true;
                    for (int j = 0; j < al.size(); j++) {
                        if (i % al.get(j) == 0) {
                            prime = false;
                            break; // 이미 배열의 수와 나눌 수 있다면 해당 값을 버린다.
                        }
                    }
                    if (prime) al.add(i);
                }
            }
        }
        
        return al.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}