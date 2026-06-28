import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        for (int l : lost) lostSet.add(l);
        for (int r : reserve) reserveSet.add(r);

        // 1단계: 교집합 제거
        Iterator<Integer> it = lostSet.iterator();
        while (it.hasNext()) {
            int s = it.next();
            if (reserveSet.contains(s)) {
                it.remove();
                reserveSet.remove(s);
            }
        }

        int answer = n - lostSet.size();

        // 2단계: 빌려주기
        List<Integer> lostList = new ArrayList<>(lostSet);
        Collections.sort(lostList);

        for (int s : lostList) {
            if (reserveSet.contains(s - 1)) {
                reserveSet.remove(s - 1);
                answer++;
            } else if (reserveSet.contains(s + 1)) {
                reserveSet.remove(s + 1);
                answer++;
            }
        }

        return answer;
    }
}